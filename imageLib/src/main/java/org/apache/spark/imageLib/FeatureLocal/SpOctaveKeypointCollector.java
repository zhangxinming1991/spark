package org.apache.spark.imageLib.FeatureLocal;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;
import org.apache.spark.imageLib.SIFT.SpAbstractOctaveLocalFeatureCollector;
import org.apache.spark.imageLib.SIFT.SpGaussianOctave;
import org.apache.spark.imageLib.SIFT.SpOctaveInterestPointFinder;
import org.apache.spark.imageLib.imageKeyPoint.SpKeypoint;
import org.openimaj.feature.OrientedFeatureVector;

/**
 * Created by root on 17-2-25.
 */
public class SpOctaveKeypointCollector<
        IMAGE extends SpImage<?,IMAGE> & SpSinglebandImageProcessor.Processable<Float,SpFImage,IMAGE>>
        extends
        SpAbstractOctaveLocalFeatureCollector<
                        SpGaussianOctave<IMAGE>,
                        SpScaleSpaceFeatureExtractor<OrientedFeatureVector, IMAGE>,
                SpKeypoint,
                        IMAGE
                        > {

    protected SpScaleSpaceImageExtractorProperties<IMAGE> extractionProperties = new SpScaleSpaceImageExtractorProperties<IMAGE>();

    /**
     * Construct with the given feature extractor.
     * @param featureExtractor the feature extractor.
     */
    public SpOctaveKeypointCollector(SpScaleSpaceFeatureExtractor<OrientedFeatureVector, IMAGE> featureExtractor) {
        super(featureExtractor);
    }

    @Override
    public void foundInterestPoint(SpOctaveInterestPointFinder<SpGaussianOctave<IMAGE>, IMAGE> finder, float x, float y, float octaveScale) {
        int currentScaleIndex = finder.getCurrentScaleIndex();
        extractionProperties.image = finder.getOctave().images[currentScaleIndex];
        extractionProperties.scale = octaveScale;
        extractionProperties.x = x;
        extractionProperties.y = y;

        float octSize = finder.getOctave().octaveSize;

        addFeature(octSize * x, octSize * y, octSize * octaveScale);
    }

    protected void addFeature(float imx, float imy, float imscale) {
        OrientedFeatureVector[] fvs = featureExtractor.extractFeature(extractionProperties);

        for (OrientedFeatureVector fv : fvs) {
            features.add(new SpKeypoint(imx, imy, fv.orientation, imscale, fv.values));
        }
    }

}

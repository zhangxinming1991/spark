package org.apache.spark.imageLib.SIFT;

import org.apache.spark.imageLib.FeatureLocal.SpScaleSpaceImageExtractorProperties;
import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;
import org.apache.spark.imageLib.imageKeyPoint.SpLocalFeature;
import org.apache.spark.imageLib.imageKeyPoint.SpLocalFeatureList;
import org.apache.spark.imageLib.imageKeyPoint.SpMemoryLocalFeatureList;
import org.openimaj.image.feature.local.extraction.FeatureVectorExtractor;

/**
 * Created by root on 17-2-24.
 */
public abstract class SpAbstractOctaveLocalFeatureCollector <OCTAVE extends SpOctave<?, ?, IMAGE>, EXTRACTOR extends FeatureVectorExtractor<?, SpScaleSpaceImageExtractorProperties<IMAGE>>, FEATURE extends SpLocalFeature<?, ?>, IMAGE extends SpImage<?, IMAGE> & SpSinglebandImageProcessor.Processable<Float, SpFImage, IMAGE>>
        implements
        SpCollector<OCTAVE, FEATURE, IMAGE> {

    protected EXTRACTOR featureExtractor;
    protected SpLocalFeatureList<FEATURE> features = new SpMemoryLocalFeatureList<FEATURE>();

    /**
     * Construct the AbstractOctaveLocalFeatureCollector with the given feature
     * extractor.
     *
     * @param featureExtractor
     *            the feature extractor
     */
    public SpAbstractOctaveLocalFeatureCollector(EXTRACTOR featureExtractor) {
        this.featureExtractor = featureExtractor;
    }

    /**
     * Get the list of features collected.
     *
     * @return the features
     */
    @Override
    public SpLocalFeatureList<FEATURE> getFeatures() {
        return features;
    }

}

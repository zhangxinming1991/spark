package org.apache.spark.imageLib.FeatureLocal;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;
import org.openimaj.feature.FeatureVector;
import org.openimaj.image.feature.local.extraction.FeatureVectorExtractor;

/**
 * Created by root on 17-2-25.
 */
public interface SpScaleSpaceFeatureExtractor	<F extends FeatureVector,
        IMAGE extends SpImage<?,IMAGE> & SpSinglebandImageProcessor.Processable<Float,SpFImage,IMAGE>>
        extends
        FeatureVectorExtractor<F, SpScaleSpaceImageExtractorProperties<IMAGE>> {


}

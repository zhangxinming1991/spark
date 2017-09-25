package org.apache.spark.imageLib.FeatureLocal;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;

/**
 * Created by root on 17-2-25.
 */
public class SpGradientScaleSpaceImageExtractorProperties<I extends SpImage<?, I> & SpSinglebandImageProcessor.Processable<Float, SpFImage, I>>
        extends
        SpScaleSpaceImageExtractorProperties<I> {

    /**
     * The gradient magnitude map
     */
    public SpFImage magnitude;

    /**
     * The gradient orientation map
     */
    public SpFImage orientation;
}

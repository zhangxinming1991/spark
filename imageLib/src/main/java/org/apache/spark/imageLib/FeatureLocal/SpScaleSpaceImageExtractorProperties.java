package org.apache.spark.imageLib.FeatureLocal;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;

/**
 * Created by root on 17-2-25.
 */
public class SpScaleSpaceImageExtractorProperties<I extends SpImage<?, I> & SpSinglebandImageProcessor.Processable<Float, SpFImage, I>>
        extends
        SpLocalImageExtractorProperties<I> {

    /**
     * The scale of the interest point
     */
    public float scale;
}

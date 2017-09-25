package org.apache.spark.imageLib.FeatureLocal;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;
import org.openimaj.image.feature.local.extraction.ExtractorProperties;

/**
 * Created by root on 17-2-25.
 */
public class SpLocalImageExtractorProperties<I extends SpImage<?, I> & SpSinglebandImageProcessor.Processable<Float, SpFImage, I>>
        implements
        ExtractorProperties {

    /**
     * The image being processed
     */
    public I image;

    /**
     * The x-ordinate of the interest point
     */
    public float x;

    /**
     * The y-ordinate of the interest point
     */
    public float y;
}

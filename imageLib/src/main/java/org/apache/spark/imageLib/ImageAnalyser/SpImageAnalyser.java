package org.apache.spark.imageLib.ImageAnalyser;

import org.apache.spark.imageLib.ImageBasic.SpImage;

/**
 * Created by root on 17-2-25.
 */
public interface SpImageAnalyser<I extends SpImage<?, I>> {

    /**
     * Analyse an image.
     *
     * @param image
     *            The image to process in place.
     */
    public abstract void analyseImage(I image);

}

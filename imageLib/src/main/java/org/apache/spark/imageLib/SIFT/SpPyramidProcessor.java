package org.apache.spark.imageLib.SIFT;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;

/**
 * Created by root on 17-2-24.
 */
public interface SpPyramidProcessor <IMAGE extends SpImage<?,IMAGE> & SpSinglebandImageProcessor.Processable<Float,SpFImage,IMAGE>> {
    /**
     * Process the given pyramid.
     *
     * @param pyramid the pyramid.
     */
    public void process(SpGaussianPyramid<IMAGE> pyramid);
}

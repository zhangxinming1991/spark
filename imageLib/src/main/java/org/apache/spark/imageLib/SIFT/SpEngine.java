package org.apache.spark.imageLib.SIFT;

import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.imageKeyPoint.SpLocalFeature;
import org.apache.spark.imageLib.imageKeyPoint.SpLocalFeatureList;


/**
 * Created by root on 17-2-23.
 */
public interface SpEngine <FEATURE extends SpLocalFeature<?, ?>, IMAGE extends SpImage<?, IMAGE>>{
    /**
     * Find local features in the given image and return them.
     *
     * @param image
     *            the image
     * @return the features.
     */
    public SpLocalFeatureList<FEATURE> findFeatures(IMAGE image);
}

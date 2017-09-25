package org.apache.spark.imageLib.ImageMatch;

import org.apache.spark.imageLib.imageKeyPoint.SpIndependentPair;
import org.openimaj.math.model.Model;

import java.util.List;

/**
 * Created by root on 17-3-2.
 */
public interface SpRobustModelFitting <I, D, M extends Model<I, D>> extends SpModelFItting<I, D, M> {
    /**
     * @return list of the inliers in the original data
     */
    List<? extends SpIndependentPair<I, D>> getInliers();

    /**
     * @return list of the outliers in the original data
     */
    List<? extends SpIndependentPair<I, D>> getOutliers();
}

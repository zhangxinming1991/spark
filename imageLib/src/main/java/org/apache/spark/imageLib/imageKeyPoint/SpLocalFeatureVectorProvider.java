package org.apache.spark.imageLib.imageKeyPoint;

/**
 * Created by root on 17-2-25.
 */
public interface SpLocalFeatureVectorProvider <L extends SpLocation, T extends SpFeatureVector>
        extends
        SpFeatureVectorProvider<T>,
        SpLocationProvider<L> {
}

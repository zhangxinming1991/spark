package org.apache.spark.imageLib.SIFT;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;
import org.apache.spark.imageLib.imageKeyPoint.SpLocalFeature;
import org.apache.spark.imageLib.imageKeyPoint.SpLocalFeatureList;

/**
 * Created by root on 17-2-24.
 */
public interface SpCollector <OCTAVE extends SpOctave<?, ?, IMAGE>, FEATURE extends SpLocalFeature<?, ?>, IMAGE extends SpImage<?, IMAGE> & SpSinglebandImageProcessor.Processable<Float, SpFImage, IMAGE>>
        extends
        SpOctaveInterestPointListener<OCTAVE, IMAGE> {

    /**
     * Get the list of features collected.
     *
     * @return the features
     */
    public SpLocalFeatureList<FEATURE> getFeatures();
}

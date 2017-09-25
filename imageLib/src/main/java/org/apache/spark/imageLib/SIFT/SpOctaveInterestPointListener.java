package org.apache.spark.imageLib.SIFT;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;

/**
 * Created by root on 17-2-24.
 */
public interface SpOctaveInterestPointListener
        <OCTAVE extends SpOctave<?,?,IMAGE>,
        IMAGE extends SpImage<?,IMAGE> & SpSinglebandImageProcessor.Processable<Float,SpFImage,IMAGE>>  {

    /**
     * Do something with a detected interest point.
     *
     * @param finder the finder that found the point
     * @param x the x position
     * @param y the y position
     * @param octaveScale the scale within the octave
     */
    public void foundInterestPoint(SpOctaveInterestPointFinder<OCTAVE, IMAGE> finder, float x, float y, float octaveScale);
}

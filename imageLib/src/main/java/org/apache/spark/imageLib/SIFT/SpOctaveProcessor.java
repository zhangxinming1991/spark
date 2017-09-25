package org.apache.spark.imageLib.SIFT;

import org.apache.spark.imageLib.ImageBasic.SpFImage;
import org.apache.spark.imageLib.ImageBasic.SpImage;
import org.apache.spark.imageLib.ImageBasic.SpSinglebandImageProcessor;

/**
 * Created by root on 17-2-23.
 */
public interface SpOctaveProcessor<
        OCTAVE extends
                SpOctave<?,?,IMAGE>,
        IMAGE extends
                SpImage<?,IMAGE> &
                SpSinglebandImageProcessor.Processable<Float,SpFImage,IMAGE>
        >{
    /**
     * Process the provided octave.
     *
     * @param octave the octave.
     */
    public void process(OCTAVE octave);
}

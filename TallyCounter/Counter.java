// Counter.java
//
// Implementation of a simple tally counter.
// 2016 (c) zubernetes
/**
    A simulated tally counter that tracks some
    abstract amount of objects.
*/
public class Counter {
    private int value;
    private String strokes = "";

    /**
        Adds tick to the tally counter.
    */
    public void count() {
        value = value + 1;
        strokes = strokes + "|";
    }

    /**
        Returns the number of the tally counter.
        @return value
    */
    public int getValue() {
        return value;
    }

    /**
        Returns a visual number of the counter.
        @return strokes
    */
    public String getStrokes() {
        return strokes;
    }

    /**
        Resets the tally counter.
    */
    public void reset() {
        value = 0;
    }
}

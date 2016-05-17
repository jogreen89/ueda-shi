// IntCompare.java
//
// A simple comparison integer comparison implementation
// from "The Principles of Programming" by
// Kernighan and Pike.
// 2016 (c) zubernetes
class IntCompare implements Compare {
    public int compare(Object o1, Object o2) {
        int i1 = ((Integer) o1).intValue();
        int i2 = ((Integer) o2).intValue();
        
        if (i1 < i2)
            return -1;
        else if (i1 == i2)
            return 0;
        else
            return 1;
    }
}

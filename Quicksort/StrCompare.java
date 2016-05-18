// StrCompare.java
//
// A simple string comparison implementation
// from "The Principles of Programming" by
// Kernighan and Pike.
// 2016 (c) zubernetes
class StrCompare implements Compare {
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.compareTo(s2);
    }
}

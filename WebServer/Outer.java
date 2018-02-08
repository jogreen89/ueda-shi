class Outer
{
    private int size;
    private String thoughts = "My outer thoughts";

    class Inner
    {
        String innerThoughts = "My inner thoughts";

        void doStuff()
        {
          // inner object has its own "this"
          System.out.println(innerThoughts);

          // and it also has a kind of "outer this"
          // even for private data of outer class
          System.out.println(thoughts);
        }
    }
}


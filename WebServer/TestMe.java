class TestMe
{
    public static void main(String args[])
    {
      Outer o = new Outer();
      // Inner i = new Inner();  doesnt work

      Outer.Inner i = o.new Inner();
      i.doStuff();
    }
}

public class Main {
    /**
        Starting place of application.
    */
    public static void main(String[] args) {
        Counter tally = new Counter();

        tally.count();
        tally.count();
        tally.count();

        int result = tally.getValue();
        System.out.println("The tally count is " + Integer.toString(result));
        System.out.println("The tally count is " + tally.getStrokes());
    }
}

public class Stringi {
    public static void main(String[] args) {
        String test = "jakiś tekstowy napis";
        String testReversed = new StringBuffer(test).reverse().toString();
        System.out.println(test);
        System.out.println(testReversed);
        int reps = 5000000;
        String[] vars = new String[reps];
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < reps; i++) {
            vars[i] = "hello";
        }
        long timeStop = System.currentTimeMillis();
        System.out.println("time elasped: " + (timeStop - timeStart) + " ms");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < reps; i++) {
            vars[i] = new String("hello");
        }
        timeStop = System.currentTimeMillis();
        System.out.println("(new) time elasped: " + (timeStop - timeStart) + " ms");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < reps; i++) {
            vars[i] = new String("hello");
            vars[i] = vars[i].intern();
        }
        timeStop = System.currentTimeMillis();
        System.out.println("(new; intern) time elasped: " + (timeStop - timeStart) + " ms");
    }
}

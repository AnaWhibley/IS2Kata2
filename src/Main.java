public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(2,2,4,5,6,4,5,6,8,8,10,12);
        for (int value : histogram.getValues()) {
            System.out.println(value + ": " + histogram.getCount(value));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HistogramDisplay display = new HistogramDisplay(new Histogram(2,2,4,5,6,4,5,6,8,8,10,12));
        display.execute();
    }
}

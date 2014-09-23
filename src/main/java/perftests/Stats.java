package perftests;
public class Stats {
    final double mean;
    final double stddev;
    public Stats(long[] results) {
        double sum = 0;
        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        mean = sum / results.length;

        double sum2 = 0; 
        for (int i = 0; i < results.length; i++) {
            final double diff = (results[i] - mean);
            sum2 += diff * diff;
        }
        stddev = Math.sqrt(sum2/(Math.max(results.length - 1,1)));
    }

    public String toString() {
        return String.format("Stats: %f %f", mean, stddev);
    }
}

package perftests;
class Tools {
    public static long[] measure(Test t, int times) {
        long[] results = new long[times]; 
        for (int i = -10; i < times; i++) {
            final long started = System.currentTimeMillis();
            t.run();
            if (i >= 0)
                results[i] = System.currentTimeMillis() - started;
        }
        return results;
    }
}

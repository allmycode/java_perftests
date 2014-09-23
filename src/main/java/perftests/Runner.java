package perftests;
class Runner {
    public static void main(String ... args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: Runner <tests> <count>");
        }
        final String tests = args[0];
        final int count = Integer.parseInt(args[1]);
        for (String testclass: tests.split(",")) {
            System.out.println("Running test: " + testclass + " " + count + " times"); 
        
            Class c = Class.forName("tests." + testclass);
            Test t = (Test)c.newInstance();
            Stats s1 = new Stats(Tools.measure(t, count));
            System.out.println(s1);
        }
    }
}

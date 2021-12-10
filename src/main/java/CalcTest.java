public class CalcTest {
    static {
        try {
            System.err.println("远程代码开始执行了...");
            Runtime runtime = Runtime.getRuntime();
            String osName = System.getProperty("os.name");
            System.err.println(osName);
            if (osName.startsWith("Mac OS")) {
                String[] commands = {"open", "/System/Applications/Calculator.app"};
                runtime.exec(commands);
            } else if (osName.startsWith("Windows")) {
                // windows
                String[] commands = {"calc"};
                runtime.exec(commands);
            }


            System.err.println("远程代码被执行了...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

}

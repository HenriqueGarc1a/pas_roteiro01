public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello!");
        String version = System.getProperty("java.version");
        System.out.println("Running Java Version " + version + "\n");
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));

    }
}

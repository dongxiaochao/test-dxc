import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Main {

    private static String locka = "locka";
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Thread thread1 = new Thread();
        thread1.start();
        Thread thread2 = new Thread();
        thread2.start();
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        Thread t = Thread.currentThread();

        System.out.println(t.getName());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString1 = formatter.format(System.currentTimeMillis());
        System.out.println(dateString1);
        newHash();

    }

    public static void newHash() {
        HashMap<String,String> map = new HashMap<>();
        map.put("guess","dxc");
        System.out.println(map.get("guess"));
    }

}

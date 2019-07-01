import java.util.Vector;

/**
 * @author haosiyuan
 * @date 2019/7/1 3:51 PM
 * @info 单例模式
 */
public class Singleton {

    private static Singleton instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private Singleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }
}

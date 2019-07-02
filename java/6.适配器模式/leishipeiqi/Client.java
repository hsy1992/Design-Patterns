package leishipeiqi;

/**
 * @author haosiyuan
 * @date 2019-07-02 10:30
 * @info
 */
public class Client {

    public static void main(String[] args) {
        //这样Targetable接口的实现类就具有了Source类的功能。
        Targetable targetable = new Adapter();
        targetable.mothod1();
    }
}

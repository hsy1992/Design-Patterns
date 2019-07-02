/**
 * @author haosiyuan
 * @date 2019-07-02 11:05
 * @info 将抽象化与实现化解耦，使得二者可以独立变化，
 */
public class MyBridge extends Bridge {

    public void method() {
        getSource().method();
    }
}

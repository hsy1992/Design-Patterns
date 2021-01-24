package leishipeiqi;

/**
 * @author haosiyuan
 * @date 2019-07-02 10:29
 * @info
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void mothod2() {
        System.out.println("这是Targetable方法");
    }
}

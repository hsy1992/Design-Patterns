package duixiang;

import leishipeiqi.Source;
import leishipeiqi.Targetable;

/**
 * @author haosiyuan
 * @date 2019-07-02 10:31
 * @info
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void mothod1() {
        source.mothod1();
    }

    @Override
    public void mothod2() {
        System.out.println("这是Targetable方法");
    }
}

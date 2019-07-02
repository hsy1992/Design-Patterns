/**
 * @author haosiyuan
 * @date 2019-07-02 10:43
 * @info 被装饰者
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("我是 原始source");
    }
}

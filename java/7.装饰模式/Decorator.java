/**
 * @author haosiyuan
 * @date 2019-07-02 10:44
 * @info 装饰器
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * 缺点：产生过多相似的对象，不易排错！
 */
public class Decorator implements Sourceable {

    /**
     * 被装饰
     */
    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    @Override
    public void method() {

        System.out.println("装饰》》》》》》");
        source.method();
    }
}

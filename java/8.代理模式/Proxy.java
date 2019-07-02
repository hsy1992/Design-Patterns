/**
 * @author haosiyuan
 * @date 2019-07-02 10:48
 * @info
 */
public class Proxy implements Sourceable {

    private ProxySource proxySource;

    public Proxy() {
        this.proxySource = new ProxySource();
    }

    @Override
    public void method() {
        proxySource.method();
    }
}

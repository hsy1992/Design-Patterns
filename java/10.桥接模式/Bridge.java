/**
 * @author haosiyuan
 * @date 2019-07-02 11:03
 * @info
 */
public class Bridge {

    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}

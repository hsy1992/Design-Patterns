/**
 * @author haosiyuan
 * @date 2019-07-04 21:20
 * @info
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}

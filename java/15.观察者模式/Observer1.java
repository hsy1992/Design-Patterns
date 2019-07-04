/**
 * @author haosiyuan
 * @date 2019-07-04 21:17
 * @info
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}

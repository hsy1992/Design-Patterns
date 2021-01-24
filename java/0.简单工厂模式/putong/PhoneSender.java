package putong;

/**
 * @author haosiyuan
 * @date 2019/7/1 3:19 PM
 * @info
 */
public class PhoneSender implements Sender {

    @Override
    public void send() {
        System.out.println("我是一个 PhoneSender");
    }
}

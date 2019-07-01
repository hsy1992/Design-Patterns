/**
 * @author haosiyuan
 * @date 2019/7/1 3:38 PM
 * @info
 */
public class PhoneSendFactory implements ISendFactory {
    @Override
    public Sender produce() {
        return new PhoneSender();
    }
}

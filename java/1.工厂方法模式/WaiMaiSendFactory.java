/**
 * @author haosiyuan
 * @date 2019/7/1 3:38 PM
 * @info
 */
public class WaiMaiSendFactory implements ISendFactory {
    @Override
    public Sender produce() {
        return new WaiMaiSender();
    }
}

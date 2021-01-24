package putong;

/**
 * @author haosiyuan
 * @date 2019/7/1 3:20 PM
 * @info 工厂
 */
public class SendFactory {

    public Sender produceFactory(String type) {

        if ("phone".equals(type)) {
            return new PhoneSender();
        } else if ("waimai".equals(type)) {
            return new WaiMaiSender();
        } else {
            return null;
        }
    }

    public Sender producePhone() {
        return new PhoneSender();
    }

    public Sender produceWaiMai() {
        return new WaiMaiSender();
    }
}

package putong;

/**
 * @author haosiyuan
 * @date 2019/7/1 3:15 PM
 * @info 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。首先看下关系图：
 */
public class Client {

    public static void main(String[] args) {

        SendFactory sendFactory = new SendFactory();
        sendFactory.produceFactory("waimai").send();

        sendFactory.producePhone().send();
    }
}

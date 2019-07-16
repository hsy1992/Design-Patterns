/**
 * @author haosiyuan
 * @date 2019-07-05 20:49
 * @info
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {

    }
}

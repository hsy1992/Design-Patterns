/**
 * @author haosiyuan
 * @date 2019-07-05 20:50
 * @info 命令去做
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}

/**
 * @author haosiyuan
 * @date 2019-07-04 17:26
 * @info
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculator(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}

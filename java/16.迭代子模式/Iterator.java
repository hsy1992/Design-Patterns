/**
 * @author haosiyuan
 * @date 2019-07-04 21:27
 * @info 迭代器
 */
public interface Iterator {

    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}

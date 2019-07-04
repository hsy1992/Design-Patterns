
/**
 * @author haosiyuan
 * @date 2019-07-04 21:26
 * @info 集合
 */
public interface Collection {

    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}

import java.io.*;

/**
 * @author haosiyuan
 * @date 2019/7/1 4:22 PM
 * @info 原型模式 实现了 Cloneable
 */
public class Prototype implements Cloneable, Serializable {

    /**
     * 唯一标识
     */
    private static final long serialVersionUID = 1L;

    private String string;

    private SerializableObject obj;
    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深拷贝
     * @return
     */
    public Object deepClone() throws IOException, ClassNotFoundException {

        //写入当前对象的二级制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读取
        ByteArrayInputStream ios = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(ios);
        return ois.readObject();
    }


    private String getString() {
        return string;
    }

    private void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }

}

package clone;

import java.io.*;

public class QiTianDaSheng  implements  Cloneable,Serializable{
    String[] family = null;
    public  QiTianDaSheng(){
        this.family = new String[5];
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.myClone();
    }

    /**
     * 深克隆
     * @return
     */
    private Object myClone(){
        try {
            ByteArrayOutputStream bos  = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng q1 = (QiTianDaSheng)ois.readObject();
            return  q1;

        }catch(Exception e ){
            e.printStackTrace();
        }
        return null;
    }
}

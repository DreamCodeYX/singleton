package clone;

public class CloneTest {
    public static void main(String[] args) {
        try {
            QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
            QiTianDaSheng q1 = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println(q1 == qiTianDaSheng);
            System.out.println(q1.family);
            System.out.println(qiTianDaSheng.family);
            System.out.println(q1.family == qiTianDaSheng.family);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

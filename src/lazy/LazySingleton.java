package lazy;

/**
 *
 */
public class LazySingleton {

    private static  LazySingleton lazySingleton = null ;
    private  LazySingleton(){}

    //解决懒汉式单例中的线程不安全问题
    //尽可能的减小synchronized 锁的范围，减小其锁带来的性能问题
    //双重检查加锁
    public  static  LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}

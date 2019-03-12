package badmashPattern;

import java.io.Serializable;

/**
 *饿汉式单例
 * 线程安全的
 * 当实现Serializable 接口的时候可以被序列化处理
 *          解决方法：重写readResole 方法返回对象本身
 *
 *
 * 加载顺序
 *先静态、后动态
 *先属性、后方法
 *先上后下
 */
public class BadmashPattern implements Serializable{

    private  static  final  BadmashPattern badmashPattern = new  BadmashPattern();
    private  BadmashPattern(){}

    public BadmashPattern getInstance(){
        return badmashPattern;
    }

    private Object readResolve(){
        return  badmashPattern;
    }

}

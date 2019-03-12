package lazy;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例测试
 */
public class LazyClassSingletonTest {
    public static void main(String[] args) {
        try {
            //反射拿到类的class
            Class<?> clazz = LazyClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //设置强制访问
            c.setAccessible(true);
            //暴力初始化
            Object obj1 = c.newInstance();

            Object obj2 = c.newInstance();

            System.out.println(obj1);
            System.out.println(obj2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

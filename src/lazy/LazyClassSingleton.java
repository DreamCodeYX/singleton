package lazy;

public class LazyClassSingleton {

    //仅仅是private 不能防止反射对其的破坏
    private LazyClassSingleton(){
        //解决反射破坏的问题
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个LazyClassSingleton实例");
        }
    }

    public static final  LazyClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return  LazyHolder.LAZY;
    }
    //确保线程安全
    private static class LazyHolder{
        private static final  LazyClassSingleton LAZY =  new LazyClassSingleton();
    }
}

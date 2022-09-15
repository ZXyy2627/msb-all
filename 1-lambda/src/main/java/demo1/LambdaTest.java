package demo1;

/**
 * @ClassName LambdaTest
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/9/14
 * @Version 1.0
 **/
public class LambdaTest {
    public static void main(String[] args) {
        //子类实现接口
        Factory factory = new SubClass();
        User user1 = (User) factory.getObject();
        System.out.println(user1);

        //匿名内部类
        factory = new Factory() {
            @Override
            public Object getObject() {
                return new User("张三", 22);
            }
        };
        User user2 = (User) factory.getObject();
        System.out.println(user2);

        //lambda表达式
        factory = () -> {
            return new User("李四", 33);
        };
        User user3 = (User) factory.getObject();
        System.out.println(user3);

        //lambda表达式作为参数传递
        User user4 = (User) getObject(() -> {
            return new User("xx", 14);
        }, "User");
        System.out.println(user4);

        factory = getFactory();
        User user5 = (User) factory.getObject();
        System.out.println(user5);
    }

    public static Object getObject(Factory factory, String beanName) {
        Object obj = factory.getObject();
        if (obj != null && obj.getClass().getSimpleName().equals(beanName)) {
            return new User("王五", 44);
        }
        return null;
    }

    public static Factory getFactory() {
        return () -> {
            return new User("赵六", 55);};

    }
}

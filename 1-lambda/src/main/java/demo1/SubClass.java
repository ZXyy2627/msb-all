package demo1;

/**
 * @ClassName SubClass
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/9/14
 * @Version 1.0
 **/
public class SubClass implements Factory {
    @Override
    public Object getObject() {
        return new User("丁一", 11);
    }
}

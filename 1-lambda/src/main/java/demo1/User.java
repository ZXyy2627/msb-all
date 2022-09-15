package demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName User
 * @Description 请描述类的业务用途
 * @Author zhangxiang
 * @Date 2022/9/14
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class User {

    private String name;
    private int age;
}

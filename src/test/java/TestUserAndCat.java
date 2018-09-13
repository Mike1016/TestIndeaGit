import org.junit.Test;

/**
 * @author miao
 * @create 2018-09-13 21:07
 */
public class TestUserAndCat {

    @Test
    public void test1(){
        User user = new User();
        Cat cat = new Cat();

        user.setId(1);
        user.setName("mike");
        cat.setId(2);
        cat.setName("miaomiao");

        System.out.println(cat.getName());
        System.out.println(user.getName());
    }
}

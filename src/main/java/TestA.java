import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yldo
 * Date: 11/30/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestA {
    public static void main(String[] args) {
        String mawa = "dog";
        Map<String, String> map = new HashMap<String, String>();
        map.put("dog","собака");
        System.out.println(map.size());
        System.out.println(map.get(mawa));
    }
}

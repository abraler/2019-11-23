import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        System.out.println(map.hashCode());
    }
}

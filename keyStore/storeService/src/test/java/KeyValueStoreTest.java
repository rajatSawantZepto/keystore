
import java.util.HashMap;

public class KeyValueStoreTest {

    public void defaultTest() {
        StoreService storeService = new StoreServiceImpl();
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("name", "ronaldo");
        map1.put("age", 38);
        storeService.put("portugal", map1);

        storeService.get("portugal");
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("name", "Messi");
        map2.put("married", false);
        storeService.put("spain", map2);

        storeService.get("spain");


    }
}



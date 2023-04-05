import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreRepository {

    private Map<String, AbstractClass> store;

    public StoreRepository() {
        this.store = new HashMap<String, AbstractClass>();
    }


    public void put(String key, AbstractClass value) {
        store.put(key, value);
    }

    public AbstractClass get(String key) {
        return store.get(key);
    }

    public boolean contains(String key) {
        return store.containsKey(key);
    }

    public void remove(String key) {
        store.remove(key);
    }

    public List<String> getListOfkeys(String key, Object value) {
        return null; // todo
    }
}

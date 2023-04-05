import java.util.List;
import java.util.Map;

public interface StoreService<K,V> {

    AbstractClass get(String key);

    void put(String key, Map value);

    void remove(String key);

    List<String> search(String key, Object value);

}

import java.util.List;
import java.util.Map;

public class StoreServiceImpl implements StoreService {

    private StoreRepository storeRepository;

    public StoreServiceImpl() {
        this.storeRepository = new StoreRepository();
    }

    public AbstractClass get(String key) {
        AbstractClass value = storeRepository.get(key);
        return value;
    }

    public void put(String key, Map value) {
        storeRepository.put(key, value);
    }

    public void put(String key, Map value) {
        storeRepository.put(key, value);
    }

    public void remove(String key) {
        validateKeyPresent(key);

        storeRepository.remove(key);
    }

    public List<String> search(String key, Object value) {
        validateKeyPresent(key);
        return storeRepository.getListOfkeys(key, value);
    }

    private void validateKeyPresent(String key) {
        boolean containsKey = storeRepository.contains(key);

        if (!containsKey) {
            throw new IllegalArgumentException("key provided="+ key + " does not exist.");
        }
    }
}

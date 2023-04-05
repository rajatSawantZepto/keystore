import java.util.HashMap;
import java.util.Map;

public abstract class AbstractClass {
    public Map<String, Object> value;

    public static final String NAME = "name";

    public AbstractClass(String name) {
        this.value = new HashMap<>();
        value.put(NAME, name);
    }

    public AbstractClass(Map<String, Object> map) {
        if (!map.containsKey(NAME)) {
            throw new IllegalArgumentException("map provided doesn't have name attribute");
        }
        this.value = map;

    }
}

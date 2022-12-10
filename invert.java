import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Invert {
    public static <K, V> Map<V, K> invert(Map<K, V> sourceMap) {
        return sourceMap.entrySet()
                .stream().collect(
                        Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (oldValue, newValue) -> newValue)
                );
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 3);
        map.put("c", 4);
        map.put("d", 4);
        HashMap<Integer, String> invertedMap= (HashMap<Integer, String>) invert(map);
        for(Integer i : invertedMap.keySet()) {
            System.out.println(i + " " + invertedMap.get(i));
        }
    }

}

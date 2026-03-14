import java.util.HashMap;
import java.util.Map;

public class RabbitsInForest {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for (int answer : answers) {
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();      
            int count = entry.getValue(); 
            int groupSize = x + 1;
            int groups = (count + x) / groupSize;
            total += groups * groupSize;
        }

        return total;
    }
}

import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static int[] Funcion(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++){
            int resto = target - nums[i];

            if(map.containsKey(resto)){
                return new int[] {map.get(resto), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No se puede sumar");
        }
    }


import java.util.*;

public class DescArray {
    public static void main(String[] args) {
        int[] arr={4,1,2,3,1,2,5,2};
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                System.out.print(element);
            }
        }
    }
}

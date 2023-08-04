import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author lilepingstart
 * @creat 2023-07-05 22:02
 */
public class LeetCode {
    public static void main(String[] args) {
//        int[] nums={2,7,11,15};
//        int target=9;
//        int[] sum=twoSum(nums, target);
//        System.out.println(twoSum(nums, target));
//        List<String> strs =["eat", "tea", "tan", "ate", "nat", "bat"];
        List<String> strs=new ArrayList<String>();
        strs.add("tan");
        strs.add("eat");
        strs.add("tea");

        HashMap<String,List<String>> hashMap=new HashMap<String,List<String>>();
        for (int i = 0; i < strs.size(); i++) {
            char charArray[]=strs.get(i).toCharArray();
            Arrays.sort(charArray);
            String sorted_str= new String(charArray);
            if(hashMap.containsKey(sorted_str)){
                //如果存在该key，则获取其列表
                List<String> values=hashMap.get(sorted_str);
                values.add(strs.get(i));
                hashMap.put(sorted_str,values);
            }else{
                //不存在key则创建列表
                List<String> values=new ArrayList<String>();
                values.add(strs.get(i));
                hashMap.put(sorted_str,values);
            }
        }
        System.out.println(new ArrayList<List<String>> (hashMap.values()));

//        System.out.println(ans);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp=target-nums[i];
            if(hashMap.containsKey(temp)){
                return new int[] {hashMap.get(temp),i};
            }
                hashMap.put(nums[i],i);
        }
        return new int[0];
    }

    public void groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap=new HashMap<String,List<String>>();

        System.out.println(strs);


    }
}

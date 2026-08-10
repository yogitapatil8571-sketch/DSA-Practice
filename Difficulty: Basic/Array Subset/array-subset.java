import java.util.HashMap;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer>frequencyMap=new HashMap<>();
        // code here
        for(int num:a){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0) +1);
        }
        
        for(int num:b){
            if(!frequencyMap.containsKey(num) || frequencyMap.get(num)==0){
                return false;
            }
            frequencyMap.put(num,frequencyMap.get(num)-1);
        }
        return true;
    }
}

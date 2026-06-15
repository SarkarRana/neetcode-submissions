class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : strs){
            int[] arr = new int[26];
            for(char c : s.toCharArray()){
                arr[c-'a']++;
            }
            String key = Arrays.toString(arr);
            if(map.containsKey(key)){
                List<String> val = map.get(key);
                val.add(s);
            }else{
                List<String> val = new ArrayList<>();
                val.add(s);
                map.put(key, val);
            }
        }
        map.forEach((key,val)-> {
            res.add(val);
        });

        return res;

    }
}

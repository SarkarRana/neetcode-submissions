class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));

        map.forEach((num,val)-> {
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        });
        int[] res = new int[k];
        int index = 0;
        while(!pq.isEmpty()){
            res[index++] = pq.poll();
        }
        return res;
        
    }
}

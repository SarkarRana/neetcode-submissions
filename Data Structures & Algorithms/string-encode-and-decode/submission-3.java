class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
        

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        if(str==null || str.isEmpty()){
            return res;
        }


        int i = 0;
        while(i<str.length()){
            int j = str.indexOf("#",i);
            int length = Integer.parseInt(str.substring(i,j));
            System.out.println("Length:: "+length);
            i = j+1;
            res.add(str.substring(i, i+length));
            i = i+length;
        }
        return res;



    }
}

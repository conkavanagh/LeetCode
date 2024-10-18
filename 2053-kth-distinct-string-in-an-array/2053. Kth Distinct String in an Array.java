class Solution {
    public String kthDistinct(String[] arr, int k) {
        if(k>arr.length) return "";

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String word : arr){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        int count = 0;
        for(String word : map.keySet()){
            if(map.get(word) == 1){
                count++;
            }
            if(count == k) return word;
        }
        return "";
    }
}
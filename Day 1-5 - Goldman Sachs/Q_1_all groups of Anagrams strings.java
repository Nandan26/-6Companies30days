class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> moto=new HashMap<>();
        
        for(String str:string_list){
            HashMap<Character, Integer> nano=new HashMap<>();
            
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                nano.put(ch,nano.getOrDefault(ch,0)+1);
            }
            
            if(moto.containsKey(nano)==false){
                ArrayList<String> temp=new ArrayList<>();
                temp.add(str);
                moto.put(nano,temp);
            }
            else{
                ArrayList<String> t2=moto.get(nano);
                t2.add(str);
            }
            
        }
        
        List<List<String>> ans=new ArrayList<>();
        
        for(ArrayList<String> val:moto.values()){
            ans.add(val);
        }
        return ans;
    }
}

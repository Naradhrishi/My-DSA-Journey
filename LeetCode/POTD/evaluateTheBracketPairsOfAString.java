class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder(s.length());
        boolean isKeyStarted = false;
        StringBuilder key =  new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){isKeyStarted = true; continue;}
            if(s.charAt(i) == ')'){isKeyStarted = false; sb.append((map.get(key.toString()) == null) ? '?' : map.get(key.toString()));key.setLength(0);continue;}
            if(!isKeyStarted){
                sb.append(s.charAt(i));
            }else{
                key.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
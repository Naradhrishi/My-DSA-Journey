class Solution {
    public boolean isValidSerialization(String preorder) {
        int slot = 1;
        String[] nodes = preorder.split(",");
        for(int i=0; i<nodes.length; i++){
            String curr = nodes[i];
            if(curr.equals("#")){
                slot -= 1;
            }else{
                slot = slot - 1 + 2;
            }
        System.out.println(slot);

            if(i < nodes.length -1 && slot <= 0){
                return false;
            }

        }
        if(slot == 0){
            return true;
        }else{
            return false;
        }
        
    }
}
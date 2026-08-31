/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr = head, prev = null, next = null;
        boolean canBeMin = false, canBeMax = false;
        int nodeNum = 0, minDistance = Integer.MAX_VALUE, maxDistance = -1;
        List<Integer> criticals = new ArrayList<>();

        while(curr != null){
            nodeNum++;
            if(prev != null){
                if(curr.val > prev.val){
                    if(canBeMin){
                        criticals.add(nodeNum - 1);
                        canBeMin = false;
                    }
                    canBeMax = true;
                }
                else if(curr.val < prev.val){
                    if(canBeMax){
                        criticals.add(nodeNum - 1);
                        canBeMax = false;
                    }
                    canBeMin = true;
                }else{
                    if(canBeMin){
                        canBeMin = false;
                    }
                    if(canBeMax){
                        canBeMax = false;
                    }
                }
            }

            prev = curr;
            curr = curr.next;
            
        }
        
        if(criticals.size() < 2){
            return new int[]{-1, -1};
        }else{
            maxDistance = criticals.get(criticals.size() -1) - criticals.get(0);

            for(int j=0; j<criticals.size(); j++){
                int currCritical = criticals.get(j);
                if(j+1 < criticals.size()){
                    if((criticals.get(j+1) - currCritical) < minDistance){
                        minDistance = criticals.get(j+1) - currCritical;
                    }
                }
            }
        }

        return new int[]{minDistance, maxDistance};
    }
}
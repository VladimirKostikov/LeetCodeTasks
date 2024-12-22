import java.util.*;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<Integer>();

        for(int i=0; i<nums1.length; i++)
            l.add(nums1[i]);
        
        for(int i=0; i<nums2.length; i++)
            l.add(nums2[i]);

        Collections.sort(l);

        if(l.size() % 2 != 0) {
            return l.get(l.size()/2);
        }

        else {
            double el1 = l.get((l.size()/2)-1);
            double el2 = l.get((l.size()/2));

            return (el1+el2)/2; 
        }
    
    }
}
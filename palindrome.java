/*
Given an integer x, return true if x is a 
palindrome, and false otherwise.

*/

class Solution {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int[] newIntArr = new int[temp.length()];

        for(int i=0; i<temp.length(); i++) {
            newIntArr[i] = temp.charAt(i);
        }

        boolean flag = true;

        if(x < 0) {
            flag = false;
        }

        if(newIntArr.length == 1) {
            flag = true;
        }

        if(newIntArr.length == 2) {
            if(newIntArr[0] != newIntArr[1]) {
                flag = false;
            }
        }

        else if(newIntArr.length > 2) {
            for(int i=0; i<newIntArr.length / 2; i++) {
                if(newIntArr[i] != newIntArr[newIntArr.length-i-1]) {
                    flag = false;
                }
            }
        }

        return flag;
    }
}
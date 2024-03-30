package com.compnay;


//
public class palindrom {
    public static int countPalindromeSubstrings(String str) {
        int count =0;
        for (int i=0;i<=str.length();i++){
          for(int j = i;j<str.length();j++){
              if (isPalindrome(str, i, j))
              count++;
          }
        }
        return count;
    }
    public static boolean isPalindrome(String str,int i,int j){
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str ="abc";
        int result= countPalindromeSubstrings(str);
        System.out.println(result);
    }
}
//
//

class Solution {
    public boolean isPalindrome(int x) {
        int digit=0;
        int rigth=x;
        int reverse=0;
     while(x>0){
        digit=x%10;
        reverse=(reverse*10)+digit;
        x=x/10;
     }   
     return rigth==reverse;
    }
}
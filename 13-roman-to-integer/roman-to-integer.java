class Solution {
    public int romanToInt(String s) {
        int total=0;
        int pre=0;
        for(int i=s.length()-1;i>=0;i--){
            int current=0;
            switch(s.charAt(i)){
                case 'I':current=1;break;
                case 'V':current=5;break;
                case 'X':current=10;break;
                case 'L':current=50;break;
                case 'C':current=100;break;
                case 'D':current=500;break;
                case 'M':current=1000;break;

            }
            if(current<pre){
                total-=current;

            }else{
                total+=current;
            }
            pre=current;
        }
        return total;
        
    }
}
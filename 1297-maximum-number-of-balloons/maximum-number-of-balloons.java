class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b')b++;
            if(c=='l')l++;
            if(c=='a')a++;
            if(c=='o')o++;
            if(c=='n')n++;

        }
        l/=2;
        o/=2;
        int ans=b;
        if(a<ans) ans=a;
        if(l<ans) ans=l;
        if(o<ans) ans=o;
        if(n<ans) ans=n;

        return ans;
        
    }
}
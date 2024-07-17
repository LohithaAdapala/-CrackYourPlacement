
class Solution {
    public static void func(int n,int open,int close,List<String> ans,String temp){
        if(open+close==2*n){
            ans.add(temp);
            return;
        }
        if(open<n){
            func(n,open+1,close,ans,temp+"(");
        }
        if(close<open){
            func(n,open,close+1,ans,temp+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        func(n,0,0,ans,"");
        return ans;
        
    }
}

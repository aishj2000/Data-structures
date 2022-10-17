class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26){
            return false;
        }
        int res[] = new int[26];
        Arrays.fill(res,0);
        for(int i=0; i<s.length();i++){
            res[s.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(res[i]==0){
                return false;
            }
        }
        return true;
    }
}
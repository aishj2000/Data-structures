class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>seen = new HashSet<>();
        
        for(char curr : sentence.toCharArray()){
            seen.add(curr);
        }
        return seen.size() == 26;
        
    }
}
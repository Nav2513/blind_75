class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length())
            return false;

        int[] CHAR = new int[256];

        for(int i = 0; i < s.length(); i++){
            CHAR[s.charAt(i)]++;
            CHAR[t.charAt(i)]--;
        }

        for(int i = 0; i < CHAR.length; i++){
            if(CHAR[i] > 0)
                return false;
        }
        return true;
    }
}

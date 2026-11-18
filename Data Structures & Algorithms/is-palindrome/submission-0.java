class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9')){

                if(ch >= 'A' && ch <= 'Z'){
                    char ch1 = (char)(ch + 32);
                    res.append(ch1);
                } else {
                    res.append(ch);
                }
            }
        }
        return isPal(res);
    }

    public static boolean isPal(StringBuilder str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

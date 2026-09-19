package leetCode;

// #557
public class ReverseWordsInAStringIII {
    public String reverseWords(String s){
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                r = i - 1;

                while(l < r){
                    char x = chars[r];
                    chars[r] = chars[l];
                    chars[l] = x;
                    r--;
                    l++;
                }

                l = i + 1;
            }else if(i == chars.length - 1){
                r = i ;

                while(l < r){
                    char x = chars[r];
                    chars[r] = chars[l];
                    chars[l] = x;
                    r--;
                    l++;
                }
            }
        }

        return new String(chars);
    }
}

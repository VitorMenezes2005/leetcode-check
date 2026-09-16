package leetCode;

// #917
public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;

        while(l < r){
            if(!Character.isLetter(chars[r])){
                r--;
            }else if(!Character.isLetter(chars[l])){
                l++;
            }else{
                char x = chars[r];
                chars[r] = chars[l];
                chars[l] = x;
                l++;
                r--;
            }

        }

        return new String(chars);
    }
}

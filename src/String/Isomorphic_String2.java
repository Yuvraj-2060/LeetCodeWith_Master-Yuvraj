package String;

public class Isomorphic_String2 {
    public static boolean isIsomorphic(String s, String t) {
        int sLetters[] = new int[256];
        int tLetters[] = new int[256];

        for(int index = 0; index < s.length(); ++index) {
            char sC = s.charAt(index);
            char tC = t.charAt(index);
            if(tLetters[tC] == 0 && sLetters[sC] == 0) {
                sLetters[sC] = tC;
                tLetters[tC] = sC;
            }
            else {
                if(tLetters[tC] != sC || sLetters[sC] != tC) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 ="abb";
        String str2 ="egg";

        System.out.println("Is String Two String Are Isomorphic: " +isIsomorphic(str1,str2) );
    }
}

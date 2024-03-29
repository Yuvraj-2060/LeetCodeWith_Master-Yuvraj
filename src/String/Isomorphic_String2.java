package String;

public class Isomorphic_String2 {
    public static boolean isIsomorphic(String s, String t) {
        int map1[]=new int[200];
        int map2[]=new int[200];//Initialises with zeros
        if(s.length()!=t.length())
            return false;
        for(int idx=0;idx<s.length();idx++)
        {
            if(map1[s.charAt(idx)]!=map2[t.charAt(idx)])
                return false;
            map1[s.charAt(idx)]=idx+1;
            map2[t.charAt(idx)]=idx+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 ="abb";
        String str2 ="egg";

        System.out.println("Is String Two String Are Isomorphic: " +isIsomorphic(str1,str2) );
    }
}

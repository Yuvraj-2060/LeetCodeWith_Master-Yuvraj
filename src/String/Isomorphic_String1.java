package String;
import java.util.*;
public class Isomorphic_String1 {
    public static boolean areIsomorphic(String str1, String str2)
    {
        HashMap<Character,Character> hm=new HashMap<>();
        if(str1.length()!=str2.length())
            return false;
        for(int i=0;i<str1.length();i++)
        {
            if(!hm.containsKey(str1.charAt(i)))
            {
                if(hm.containsValue(str2.charAt(i)))
                {
                    return false;
                }
                hm.put(str1.charAt(i),str2.charAt(i));
            }
            else if(hm.containsKey(str1.charAt(i)))
            {
                char temp=hm.get(str1.charAt(i));
                if(temp!=str2.charAt(i))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 ="abb";
        String str2 ="egg";

        System.out.println("Is String Two String Are Isomorphic: " +areIsomorphic(str1,str2) );
    }
}

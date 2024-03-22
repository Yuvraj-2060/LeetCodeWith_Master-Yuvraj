package String;

public class IsStringRotated1 {
    public static int isCyclicRotation(String p, String q)  {
        if(p.length()!=q.length())   return 0;

        q=q+q;

        if(q.contains(p))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        String s1="abac";
        String s2="baca";
        String s3="bacb";

        System.out.println("Is String Rotated: "+isCyclicRotation(s1,s3));

    }
}

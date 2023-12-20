public class Remove_star_From_String1 {
    public static void main(String[] args) {

        System.out.println(removeStars("leet**code*e"));
    }
    public static String removeStars(String s) {
        int i=0,j=0;
        for(i=0;i<s.length();i++)
            if(s.charAt(i)=='*')
                j--;
            else
                s = s.substring(0, j++) + s.charAt(i) + s.substring(j);
        return s.substring(0,j);
    }
}

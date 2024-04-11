package String;

public class SumOfBeauty_Of_All_SubString1 {
    public static int beautySum(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int fr[]=new int[26];
            for(int j=i;j<s.length();j++){
                fr[s.charAt(j)-'a']++;
                res+=solve(fr);
            }
        }
        return res;
    }

    public static int solve(int frq[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<frq.length;i++){
            if(frq[i]==0){
                continue;
            }

            min=Math.min(min,frq[i]);
            max=Math.max(max,frq[i]);
        }
        return max-min;
    }
    public static void main(String[] args) {
        String str = "aabcb"; // Ans: 5
//        String str = "aabcbaa"; // Ans: 17
        System.out.println("Sum Of Beauty Of All Sub String Is: "+ beautySum(str));
    }
}

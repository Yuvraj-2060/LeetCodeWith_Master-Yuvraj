package String;

public class SumOfBeauty_Of_All_SubString2 {
    public static int beautySum(String s) {
        int cnt =0;
        for(int i=0;i<s.length();i++){
            int freq[] = new int[26];

            for(int j=i;j<s.length();j++){

                freq[s.charAt(j)-'a']++;
                int mx = Integer.MIN_VALUE;
                int mi = Integer.MAX_VALUE;

                for(int k=0;k<26;k++){

                    if(freq[k] != 0){
                        mx = Math.max(mx, freq[k]);
                        mi = Math.min(mi, freq[k]);
                    }
                }
                cnt +=mx-mi;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "aabcb"; // Ans: 5
//        String str = "aabcbaa"; // Ans: 17
        System.out.println("Sum Of Beauty Of All Sub String Is: "+ beautySum(str));
    }
}

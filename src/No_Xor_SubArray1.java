import java.util.*;
public class No_Xor_SubArray1 {
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        System.out.println(solve(arr,6));
    }
    static int solve(int[] A, int B) {
        int c = 0;
        int currentXOR = 0;
        HashMap<Integer, Integer> xorCount = new HashMap<>();
        xorCount.put(0, 1); // Initialize with 0 XOR count

        for (int i = 0; i < A.length; i++) {
            currentXOR ^= A[i]; // Update current XOR
            int targetXOR = currentXOR ^ B; // Calculate the target XOR

            if (xorCount.containsKey(targetXOR)) {
                c += xorCount.get(targetXOR); // Increment count by the target XOR count
            }

            if (xorCount.containsKey(currentXOR)) {
                xorCount.put(currentXOR, xorCount.get(currentXOR) + 1); // Update current XOR count
            } else {
                xorCount.put(currentXOR, 1);
            }
        }
        return c;
    }
}

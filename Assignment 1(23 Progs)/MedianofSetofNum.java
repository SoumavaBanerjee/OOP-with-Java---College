import java.util.*; 
public class MedianofSetofNum {
 public static void main(String[] args)
 {
    int[] nums = {12,29,38,25,34,54,21};
    System.out.println(Arrays.toString(nums));
    int n = nums.length;
		if (n < 1) {
			System.out.printf("False");
		}
		Queue<Integer> min = new PriorityQueue<Integer>(n);
		for (int num : nums) {
			min.add(num);
		}
		if ((n & 1) == 0) {
			n >>= 1;
			n -= 1;
		} else {
			n >>= 1;
		}
		int i = 0;
		while (i < n) {
			min.remove();
			i++;
		}
		System.out.print(min.remove()); 
    }
}
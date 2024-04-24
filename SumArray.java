public class SumArray {
    public static void main(String[] args) {
        int[] num1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] num2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};
        int diff = Math.abs(num1.length - num2.length);
        int max = Math.max(num1.length, num2.length);
        int carry = 0;
        int[] res = new int[max + 1];
        int k = num1.length - 1;
        int m = num2.length - 1;
        for (int i = max; i > diff; i--) {
            int sum = num1[k--] + num2[m--] + carry;
            res[i] = sum % 10;
            carry = sum / 10;
        }
        if(num1.length>num2.length) {
            for (int n = diff; n > 0; n--) {
                res[n]=num1[n-1];
            }
        }
        else {
            for (int n = diff; n > 0; n--) {
                res[n]=num1[n-1];
            }
        }
        for(int val:res){
            System.out.print(val);
        }
    }
}

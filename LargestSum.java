public class LargestSum {
    public static void main(String[] args) {
        int[] arr={2,7,5,-1,-3,2,9,7};
        int i=0,j=0;
        int maxVal=0;
        int sum=0;
        while (i<arr.length && j<arr.length){
            if(arr[i]>0) {
                if (arr[j] > 0) {
                    sum += arr[j];
                    j++;
                } else {
                    maxVal = Math.max(maxVal, sum);
                    sum = 0;
                    i = j;
                }
            }
            else{
                i++;
                j=i;
            }
        }
        maxVal = Math.max(maxVal, sum);
        System.out.println(maxVal);
        System.out.println(i+" "+j);
        for(int m=i;m<j;m++){
            System.out.print(arr[m]+" ");
        }
    }
}

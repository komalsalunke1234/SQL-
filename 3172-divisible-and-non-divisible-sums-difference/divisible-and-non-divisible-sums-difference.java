class Solution {
    public int differenceOfSums(int n, int m) {
    //     int sum1=0;
    //     int sum2=0;
    //     int []arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         if( n%m!=0 ){
    //             sum1+=arr[i];
    //         }
    //         else{
    //             sum2+=arr[i];

    //         }
    //     }
    
    //    return sum1-sum2;

    int totalSum = n * (n + 1) / 2;
        int count = n / m;
        int divisibleSum = m * count * (count + 1) / 2;

        int num1 = totalSum - divisibleSum;
        int num2 = divisibleSum;

        return num1 - num2; 

    }
}
class Solution {
    public int differenceOfSums(int n, int m) {
        int count=0;
        int x=0;
        
        for(int i=1;i<=n;i++){
            if( i%m!=0 ){
                count+=i;
            }
            else{
                x+=i;

            }}
    return count-x;
        }}
    
    //    return sum1-sum2;
    //  int count=0;
    //     int c1=0;
    //     for(int i=1;i<=n;i++){
    //         if(i%m==0){
    //             count+=i;
    //         }
    //         else{
    //             c1+=i;
    //         }
    //     }
    //     return c1-count;

    // int totalSum = n * (n + 1) / 2;
    //     int count = n / m;
    //     int divisibleSum = m * count * (count + 1) / 2;

    //     int num1 = totalSum - divisibleSum;
    //     int num2 = divisibleSum;

    //     return num1 - num2; 

    

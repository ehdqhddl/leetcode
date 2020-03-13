public class Solution {
    public static void main(String args[]){
        int[] nums = new int[] {2,2,3,4};
        int[] arrRes = new int[nums.length];
        int poc = 1;

        for(int i =0;i<nums.length;i++){
            arrRes[i] = poc;
            poc *= nums[i];
        }
        poc = 1;
        for(int i =nums.length-1 ;i>=0;i--){
            arrRes[i] *= poc;
            poc *= nums[i];
        }

        /*
           자신을 기준으로 왼쪽의 누적곱을 구해 배열을 채워나갑니다.
           배열이 {1,2,3,4} 일때,
           0번째 인덱스의 경우 arr[-1]는 없으므로 왼쪽 누적곱은 1, 따라서 arr[0] = 1
           1번째 인덱스의 경우 arr[0]까지의 왼쪽 누적곱은 1 (1*arr[0])
           2번째 인덱스의 경우 arr[1]까지의 왼쪽 누적곱은 2 (1*arr[1])
           3번째 인덱스의 경우 arr[2]까지의 왼쪽 누적곱은 6 (2*arr[2])

           현재 배열상태는 {1,1,2,6}

           두번째 반복문에서는 자신을 기준으로 오른쪽의 누적곱을 구해 배열을 채워나갑니다.

           3번째 인덱스의 경우 arr[4]는 없으므로 오른쪽 누적곱은 1, 따라서 arr[3] *= 1
           2번째 인덱스의 경우 arr[3]까지의 오른쪽 누적곱은 4 (1*arr[3]), 따라서 arr[2] *= 4
           1번째 인덱스의 경우 arr[2]까지의 오른쪽 누적곱은 12 (4*arr[2]), 따라서 arr[1] *= 6
           0번째 인덱스의 경우 arr[1]까지의 오른쪽 누적곱은 24 (12*arr[1]),  따라서 arr[0] *= 24

         */
    }
}

package SORT;
/**
 * 奇偶排序（砖排序）
 * begin: 偶排列从0开始，奇数排列从1开始
 * even: 是否发生交换事件，不发生则循环结束
 */

public class OddEven_Sort {
    public static void sort(int [] arr) {
        int begin = 0;
        boolean event = true;
        while(event){
            event = false;
            for(int i = begin ; i < arr.length - 1 ; i += 2)
                if(arr[i] > arr[i+1]){
                    SWAP.swap(arr , i , i+1) ;
                    event = true;
                }
            if(begin == 0)
                begin++;
            else
                begin--;
        }
    }
}

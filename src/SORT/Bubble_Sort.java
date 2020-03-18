package SORT;
/**冒泡排序
 *i: 控制循环次数，数组元素个数-1 次外循环
 * j: 每次内循环从0开始，两两一组，将较大的数往右边冒泡
 */
public class Bubble_Sort {
    public static void sort(int [] arr){
        for(int i = 1 ; i < arr.length ; i++)
            for(int j = 0 ; j < arr.length-1 ; j++)
                if(arr[j] > arr[j+1])
                    SWAP.swap(arr , j , j+1);
    }
}

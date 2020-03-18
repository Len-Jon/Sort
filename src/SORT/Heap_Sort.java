package SORT;
/**
 * 堆排序
 */
public class Heap_Sort {
    /**
     * 单个树根与左右比较并交换
     * x为根的坐标
     */
    private static void deal(int [] arr , int x){
        int left_index = 2 * x +1;
        int right_index = 2 * x + 2;
        if( arr[x] < arr[left_index])
            SWAP.swap(arr , x , left_index);
        if( arr[x] < arr[right_index] )
            SWAP.swap(arr , x , right_index);
    }

    /**
     * end_index为数组中要处理的最后一个数的坐标
     * last_tree为它的父节点坐标---------------(end_index - 1) / 2
     * end_index如果是偶数则父树有双子根，可直接调用deal
     * 奇数则单独处理后以偶数处理
     * last_tree则是最后一个有子根的树
     * 从它开始往回层次遍历
     * */
    private static void heapify(int [] arr , int end_index) {
        int last_tree = (end_index - 1) / 2;
        if(end_index%2 != 0){
            if(arr[last_tree] < arr[end_index] )
                SWAP.swap(arr , last_tree , end_index);
            last_tree--;
        }
        for(int i = last_tree ; i >= 0 ; i--)
            deal(arr, i);
    }

    /**
     * 每次将最大值移动到堆顶后，将其与最后一位交换
     * 最后一次的结束位置是1，因为是对结束位置的父节点操作
     * 排除它之后继续下一轮heapify
     * */
    public static void sort(int [] arr){
        for(int i = arr.length-1 ; i > 0 ; i--) {
            heapify(arr , i);
            SWAP.swap(arr , 0 , i);
        }
    }
}

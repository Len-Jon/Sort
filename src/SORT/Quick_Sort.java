package SORT;
/**
 * 快速排序
 * 冒泡排序增强版
 * 因为是递归所以需要三个入参
 * temp: 基准元素
 * left: 左指针
 * right: 右指针
 * 算法最优是以中位数作为基准，这里以第一个数为基准做例子
 */
public class Quick_Sort {
    public static void sort(int [] arr){
        deal_1(arr , 0 , arr.length - 1);
    }
    private static void deal_1(int [] arr , int _left , int _right){
        int temp , left = _left , right = _right;
        if(left <= right){  //--------------------------------待排序的元素至少有两个的情况
            temp = arr[left];   //----------------------------待排序的第一个元素作为基准元素,这里可以换成中位数
            while(left != right){   //-------------------------从左右两边交替扫描，直到left = right
                while(right > left && arr[right] >= temp)
                    right --;   //-------------------------------从右往左扫描，找到第一个比基准元素小的元素
                arr[left] = arr[right]; //----------------------找到符合条件的元素arr[right]后与arr[left]交换
                while(left < right && arr[left] <= temp)    //左边同理
                    left ++;
                arr[right] = arr[left];
            }
            arr[right] = temp;  //--------------------------基准元素归位
            deal_1(arr,_left,left-1); //-------------对基准元素左边的元素进行递归排序
            deal_1(arr, right+1,_right);  //---------对基准元素右边的进行递归排序
        }
    }
}

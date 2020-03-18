package SORT;

/**
 * 选择排序
 * index: 通过比较存储最小值坐标
 * i: 循环控制第一个到倒数第二个
 * j: 循环控制第 i+1 个到最后一个元素
 *
 */
public class Selection_Sort  {
    public static void sort(int [] arr){
        int index;
        for(int i = 0 ; i < arr.length-1 ; i++){
            index = i;
            for(int j = i+1 ; j < arr.length ; j++)
                if(arr[index] > arr[j])
                    index = j;
             if(index != i)
                 SWAP.swap(arr,i,index);
        }
    }
}

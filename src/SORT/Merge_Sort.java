package SORT;
/**
 * 归并排序
 *归并部分：
 * temp: 临时数组，长度为需要归并的数组（a，b）长度和
 * k: 临时数组下标
 * left：左数组的下标，从a的开头开始
 * right：右数组的下标，从b的开头开始
 * lr_end: 传入的数组范围的最后一个坐标+1
 * 将二者较小值放入temp中，剩下的部分用while接着直接复制进去
 * 拆分部分：
 * 处理单个元素直接return
 * 递归调用左右拆分并归并
 *
 */
public class Merge_Sort {
    private static void merge(int [] arr , int left_begin , int right_begin , int lr_end){
        int [] temp = new int[lr_end - left_begin];
        int left = left_begin , right = right_begin;
        int k = 0;
        while (left < right_begin && right < lr_end)
            temp[k++] = arr[left]<arr[right] ? arr[left++] :arr[right++];
        while (left < right_begin)
            temp[k++] = arr[left++];
        while (right < lr_end)
                temp[k++] = arr[right++];
        System.arraycopy(temp, 0, arr, left_begin, temp.length);//复制回arr，java有垃圾回收就不用处理temp了
    }
    private static void split (int [] arr , int L , int R){
        if(L == R)
            return;
        int mid = L + (R - L) / 2;  //偶数个元素在中线左边,奇数正中间
        split(arr , L , mid);
        split(arr , mid+1 , R);
        merge(arr , L , mid+1 , R+1);
    }
    public static void sort(int [] arr) {
        split(arr, 0, arr.length - 1);
    }
}

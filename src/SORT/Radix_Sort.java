package SORT;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 基数排序
 * 一种特殊的桶排序，按照数位上的数字分组
 */
public class Radix_Sort {
    //判断是几位数,（字符串则是最长的字符串长度
    private static int length(int num){
        if(num == 0)
            return 1;
        int len = 0;
        while(num != 0){
            num /= 10;
            len++;
        }
        return len;
    }

    //取从右开始的第x位数（字符串为右数第x个字母
    private static int getDigit(int num , int x){
        for(int i = 1 ; i < x ; i++)
            num /= 10;
        return num%10;
    }

    public static void sort(int [] arr){
        LinkedList<Integer>[] radix = new LinkedList[10];//字符串则是52个对应A-Z,a-z
        for(int i = 0 ; i < 10 ; i++)
            radix[i] = new LinkedList<>();
        int max = arr[0];
        for(int num : arr){
            if(max < num)
                max = num;
        }

        for(int i = 1 ; i <= length(max) ; i++){
            for(int num : arr)
                radix[getDigit(num , i)].add(num);//按第i位数分组
            int index = 0;
            for(int j = 0 ; j < 10 ; j++){//按照基数顺序放回
                for(int k = 0 ; k < radix[j].size() ; k++) {
                    arr[index++] = radix[j].get(k);
                }
                radix[j].clear();//清空链表
            }
        }
    }
}

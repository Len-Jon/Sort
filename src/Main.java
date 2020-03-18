/**
 * @author B19031707
 * @version 1.0
 */
import SORT.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        int N = 30;
        int [] arr;
        System.out.println("选择\n1.随机数30个\n2.手动输入");
        select = in.nextInt();
        switch (select){
            case 1:
                arr = new int[N];
                for(int i = 0 ; i < N ; i++)
                    arr[i] = (int)(Math.random()*100);
                break;
            case 2:
                System.out.println("输入排序个数");
                N = in.nextInt();
                arr = new int[N];
                System.out.println("输入数据");
                for(int i = 0 ; i < N ; i++)
                    arr[i] = in.nextInt();
                break;
            default:
                throw new IllegalStateException("不陪你玩了！");
        }

        System.out.println("选择排序方式：");
        System.out.println(
                "1.Selection_Sort;\t" +
                "2.Insertion_Sort;\n" +
                "3.Bubble_Sort;\t\t" +
                "4.Quick_Sort;\n" +
                "5.Shell_Sort;\t\t" +
                "6.Merge_Sort;\n" +
                "7.Heap_Sort;\t\t" +
                "8.OddEven_Sort;\n" +
                "9.Radix_Sort;\t\t//负数暂不支持\n" +
                "10.Bucket_Sort;\t\t//负数暂不支持");
        select = in.nextInt();
        System.out.println("Before: "+Arrays.toString(arr));
        switch (select){
            case 1  :Selection_Sort.sort(arr);break;
            case 2  :Insertion_Sort.sort(arr);break;
            case 3  :Bubble_Sort.sort(arr);break;
            case 4  :Quick_Sort.sort(arr);break;
            case 5  :Shell_Sort.sort(arr);break;
            case 6  :Merge_Sort.sort(arr);break;
            case 7  :Heap_Sort.sort(arr);break;
            case 8  :OddEven_Sort.sort(arr);break;
            /*
             * 以上排序只需要
             * 1.将int数组换成String数组
             * 2.元素比较大小部分用comparable函数
             * 3.修改SWAP函数的入参
             *P.S. String和Integer作为某个类的成员变量并实现Comparable接口就可以重新定义SWAP.swap(int [])为SWAP.swap(SI [])
             *
             * 以下函数的排序算法目前只使用于Integer类型
             */
            case 9  :Radix_Sort.sort(arr);break;//负数另外考虑，分成两部分解决，这里只考虑正数
            case 10:Bucket_Sort.sort(arr);break;
            default:
                throw new IllegalStateException("再见！");
        }
        System.out.println("After:\t"+Arrays.toString(arr));
    }
}

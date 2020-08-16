/*
折半查找
1.必须采用顺序存储结构。
2.必须按关键字大小有序排列。
首先，假设表中元素是按升序排列，将表中间位置记录的关键字与查找关键字比较，如果两者相等，则查找成功；
否则利用中间位置记录将表分成前、后两个子表，如果中间位置记录的关键字大于查找关键字，则进一步查找前一子表，
否则进一步查找后一子表。重复以上过程，直到找到满足条件的记录，使查找成功，或直到子表不存在为止，此时查找不成功。
 */

public class ZheBanPaiXu {

    public static int paixu(int[] are, int des) {
        int fire_one = 0;
        int end_one = are.length - 1;
        int middle;
        while (fire_one <= end_one) {
            middle = (fire_one + end_one) / 2;//把起始位置  和   终止位置   相加   后折半
            if (des == are[middle]) {
                return des;
            }
            else if (des > are[middle]) {
                end_one = middle - 1;

            } else {
                fire_one = middle + 1;
            }

        }
        return -1;
    }
    public static void main (String args []) {
        int are []={1,100,200,5,2,13,7,8,13,7};
        int check =paixu( are,100);
        if (check!=-1) {
            System.out.println("元素是存在的：" + check);
        }
        else{
            System.out.println("元素不存在");
        }
        for (int i=0;i<are.length-1;i++) {
            System.out.println(are[i]);
        }
    }


}

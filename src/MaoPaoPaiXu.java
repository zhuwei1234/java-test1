/*
折半排序
 精髓是 设置两层循环，在子循环中变量当前元素和笑一个元素的比较  大于  就进行交换,这样可以按序排列出最大值
 */

public class MaoPaoPaiXu {
    public static void main (String args []) {
        int are []={1,100,200,5,2,13,7,8,13,7};
        PaiXu( are);
        for (int i=0;i<are.length-1;i++) {
            System.out.println(are[i]);
        }
    }
    public static  void  PaiXu(int str[]){
        for (int i=0;i<str.length-1;i++){
            for (int j=0;j<str.length-1-i;j++){
                if (str[j]>str[j+1]){
                    int tem = str[j];
                    str[j]=str[j+1];
                    str[j+1]=tem;
                }
            }
        }

    }

}

public class MaoPaoPaiXu {
    public static void man (String args []) {
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


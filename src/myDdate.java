public class myDdate {
    String year,mon,day;
    public myDdate(){
        this("2020","01","01");
    }
    public myDdate(String year,String mon,String day){
        this.year=year;
        this.mon=mon;
        this.day=day;
    }
    public  void setDate (String year,String mon,String day){
        this.year=year;
        this.mon=mon;
        this.day=day;
    }
    public void dateInfo(){
        System.out.println(year+":"+mon+":"+day);
    }
    public static void main (String[] args){
        myDdate date1 = new myDdate();
        myDdate date2  = new myDdate();
        date1.setDate("2020","02","03");
        date1.dateInfo();
        date2.setDate("2020","02","04");
        date2.dateInfo();
    }
}

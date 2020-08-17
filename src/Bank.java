 class Bank_Account {
    private  static Bank_Account account;
    private String bank_account; // 银行账户
    private String name;   //户名
    public  double balance;   //余额
    public static Bank_Account getBankAccount(){
         if (account == null){
             account= new Bank_Account();
         }
         return account;
     }
     public Bank_Account(){
        name=null;
        bank_account=null;

     }
     //   构造函数  传参  余额  balance
     public Bank_Account(double balance){
        this.balance=balance;
    }
     //存款
    public  void  add_deposit(double balance){
        this.balance=this.balance+balance;
    }
     //取款
    public void subtract_deposit(double balance){
        this.balance=this.balance-balance;
    }
     //查询余额
    public double get_account_balance(){
        return balance ;
    }
    // 查询户名
    public String get_Name(){
        return name;
    }
    //设置  户名
    public void set_Name( String name){
        this.name=name;
    }
    //查询银行账户
    public String get_bank_account(){
        return bank_account;
    }
    //  设置 银行账户
    public void set_bank_account (String bank_account){
        this.bank_account=bank_account;
    }
}
class Customer {
    private String name,id_number ; //  客户姓名、证件号码
    private Bank_Account bank_account  ; //  定义账户类 引用变量，一个客户对应一个账户
    private static Customer customer;
    //   获取银行账户
    public Bank_Account getBank_account(){
        return bank_account=new Bank_Account();
    }

    // 实现 重构  构造函数 添加客户信息
    public  Customer( String name,String id_number){
        this.name =name;
        this.id_number=id_number;
    }
    //  默认的构造器
    private Customer(){
        name=null;
        id_number=null;
    }
    //    获取带姓名和 证件号的客户实例对象
/*    public Customer get_Customer2( String name,String id_number){
        if (customer == null){
            customer=new Customer(name,id_number);
        }
        return customer;
    }

 */
    //   获取为空的客户类实例对象
    public Customer get_Customer1(){
        if (customer ==  null){
            customer=new Customer();
        }
        return customer;
    }
    //
    public Bank_Account get_bank_account(){
        if (bank_account==null){
            bank_account=new Bank_Account();
        }
        return bank_account;
    }

    //查询  用户姓名
    public String get_name(){
        return name;
    }
    //设置  用户姓名
    public void set_name(String name){
        this.name=name;
    }
    //查询   身份证号
    public String getId_number(){
        return id_number;
    }
    //设置  身份证号
    public void setId_number(String id_number){
        this.id_number=id_number;
    }

}
// 利息账户类
class SavingAccount extends Bank_Account {
    private double interestrate;
    public SavingAccount(double balance,double interestrate){
        super(balance);
        this.interestrate=interestrate;
    }
    public double  get_interestrate(){
        return interestrate;
    }
    public void set_interestrate( double interestrate){
        this.interestrate=interestrate;
    }


}
//    透支类实现透支账户的检查
class CheckAccount extends Bank_Account {
    private double  overdraf ;
    public  CheckAccount(double balance,double overdraf){
        super.balance =balance;
        this.overdraf=overdraf;
    }

    @Override
    public void subtract_deposit(double balance) {
        super.subtract_deposit(balance);

    }
    public void setOverdraf(double overdraf){
        this.overdraf=overdraf;
    }
    public double getOverdraf(){
        return overdraf;
    }
}





public class Bank {
    private  Customer[] customer=new Customer[3]; //    这块需要重点关注 数组的写法  定义一个银行包含多个客户
    Bank_Account [] account= new Bank_Account[3];
    private String bank_name;
    private Bank bank;
    // 构造器
    public Bank get_bank(){
        if (bank == null){
            bank= new Bank();
        }
        return bank;
    }

    //   查询  银行名称
    public String getBankName(){
        return bank_name;
    }
    //    设置  银行名称
    public void setBankName(String bank_name){
        this.bank_name=bank_name;
    }
/*
    public Customer  add_customer( String name ,String id_number){
        bank1.customer[0] = bank1.customer[0].get_Customer2;
        return customer;
    }

 */
    public static void main (String[]args){

    Bank bank1=new Bank();
    bank1.setBankName("中信银行");
    //bank1.bank_name="中信银行";

     bank1.customer[0] = new Customer("张三", "11111111");
     bank1.customer[1] = new Customer("李四", "22222222");
     bank1.customer[2] = new Customer("王五", "22222222");

    bank1.account[0]= bank1.customer[0].getBank_account();
    bank1.account[1] = bank1.customer[1].getBank_account();
    bank1.account[2] = bank1.customer[2].getBank_account();
    bank1.account[0].add_deposit(1000);
    bank1.account[0].add_deposit(100.00);
    bank1.account[1].add_deposit(200.00);
    bank1.account[2].add_deposit(300.00);
    System.out.println(bank1.bank_name);
    for(int i=0; i<3 ;i++) {
        System.out.print( bank1.customer[i].get_name() );
        System.out.print("  证件号："+ bank1.customer[0].getId_number());
        System.out.println("   余额"+bank1.account[i].get_account_balance());
    }

    }

}
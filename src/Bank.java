 class Bank_Account {
    public String bank_account; // 银行账户
    public String name;   //户名
    public double balance;   //余额
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

}
class Customer {
public String name,id_number ; //  客户姓名、证件号码
public Bank_Account bank_account  ; //  定义账户类 引用变量，一个客户对应一个账户
// 实现 重构  构造函数 添加客户信息
public Customer( String name,String id_number){
    this.name =name;
    this.id_number=id_number;
}
/*
public Customer(){
    name=null;
    id_number=null;
}
*/
}


public class Bank {
    public Customer[] customer=new Customer[3] ; //    这块需要重点关注 数组的写法  定义一个银行包含多个客户
    public String bank_name;
    public Customer  add_customer( String name ,String id_number){
        Customer customer=new Customer(name, id_number);
        return customer;
    }
    public static void main (String[]args){
    Bank bank1=new Bank();
    bank1.bank_name="中信银行";

    bank1.customer[0] = new Customer("张三", "11111111");
    bank1.customer[1] = new Customer("李四", "22222222");
    bank1.customer[2] = new Customer("王五", "22222222");

    bank1.customer[0].bank_account =new Bank_Account();
    bank1.customer[1].bank_account =new Bank_Account();
    bank1.customer[2].bank_account =new Bank_Account();

    bank1.customer[0].bank_account.add_deposit(100.00);
    bank1.customer[1].bank_account.add_deposit(200.00);
    bank1.customer[2].bank_account.add_deposit(300.00);
    System.out.println(bank1.bank_name);
    for(int i=0; i<3 ;i++) {
        System.out.print(bank1.customer[i].name );
        System.out.print("  证件号："+bank1.customer[i].id_number);
        System.out.println("   余额"+bank1.customer[i].bank_account.get_account_balance());
    }
/*
    Customer zhangsan=new Customer("张三","210423423423423");

    Bank_Account zhang_shan= new Bank_Account();
    Bank_Account li_si=new Bank_Account();
    zhang_shan.add_deposit(500.01);
    zhang_shan.subtract_deposit(58.3);
    li_si.add_deposit(1500.32);
    li_si.subtract_deposit(300.21);

    System.out.println("张三："+zhang_shan.get_account_balance());
    System.out.println("李四："+li_si.get_account_balance());
*/
    }

}
package pack01;

public class test {
    public static void main(String args[]){

          student zhang = new student();
          zhang.id = 1;
          zhang.name = "zhangsan";
          zhang.sex = "男";
          zhang.addr = "北京";
          System.out.println("姓名："+ zhang.name + " 学号：" + zhang.id + " 性别：" + zhang.sex + " 家庭住址：" + zhang.addr);

          zhang.xuanke(101,"Java","304","16:05","wang");

          zhang.tuike(101,"Java","304","16:05","wang");
    }
}

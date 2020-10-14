# java-2017310739
java课程作业项目仓库
# 阅读程序

## 实验目的
用类描述计算机CPU的速度和硬盘容量
## 实验过程
1.在项目中创建包Pack1，然后再包Pack1中创建类；
2.根据需求需要有最少四个类：PC、CPU、HardDisk、Test（主类）
3.首先PC类中有speed和getspeed，并且getspeed()返回speed的值，然后创建setspeed(int speed)方法，将值赋给speed
4.其次HardDisk类中有amouht和getamount()，且getA mount()返回amount的值，然后创建setAmount(int amount)方法，将值赋给amount
5.根据UML图，在PC类中要求使用setCPU()方法将参数赋给cpu；使用setAmount()将参数赋给HD，再使用void show()和输出语句
6.Test类中需要再main方法中分别创建CPU、HardDisk、PC的三个对象cpu、disk、pc，并为cpu和disk赋初始值2200和200
7.pc以实参cpu调用setCPU方法、以实参disk调用setHardDsik方法
8.最后调用PC中的void show()展示结果

## 核心方法
1.CPU、HardDisk类中的setspeed(int speed)、setAmount(int amount)方法
2.在需要赋值的地方使用this.方法
3.main方法使用new创建对象、
4.调用时使用类对象.方法进行调用

## 实验结果
  2200
  200
  
## 实验感想
通过本次实验，我对课上学的类与对象的关系有了进一步的了解，并且学会怎么使用this.方法

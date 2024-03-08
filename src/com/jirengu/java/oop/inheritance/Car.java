package com.jirengu.java.oop.inheritance;

public class Car extends Vehicle{
    public Car(String name, String color, int year, String model, int maxSpeed) {
        //调用父类的构造器
        super(name, color, year, model, maxSpeed);
    }


    //名称参数都要相同
    //返回类型要和父类一样，或者是父类的子类
    //访问权限必须要大于等于上方的访问权限
    @Override
    void getPrintInform(){
        //要写清楚是用什么来调用的
        super.getPrintInform();
    }
    //protected,继承的访问权限,可以被同包中的继承权限来进行使用
    //final  修饰的类不能被继承，修饰的方法不能被重写，修饰的变量不能被修改 , 可以被重载


    //Object 是所有类的父类，没有父类的类，都是继承Object
    //两个核心方法 equals toString
    public static void main(String[] args) {
        Car car = new Car("BMW", "red", 2017, "X5", 300);
        //只有父类为public的时候才能使用
        System.out.println(car.getName());
        car.getPrintInform();
        //instanceof 判断实例
        System.out.println(car instanceof Car);
        //super 用于在子类中找父类的属性 区分this
        //再构造子类的时候，会先构造父类，会往上找，找到object,一个super就行，就能找到父类的构造器
    }
    //单继承 多继承   菱形继承问题 因此不允许使用extends来进行使用
    // extend A,B

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
         //判断是否是同一个对象
          if (this == obj) {
                return true;
          }
          //判断是否是同一个类
          if (obj == null || getClass() != obj.getClass()) {
                return false;
          }
          //强制类型转换
          Car car = (Car) obj;
          //判断属性是否相同
          return this.getName().equals(car.getName()) &&
                 this.getColor().equals(car.getColor()) &&
                 this.getYear() == car.getYear() &&
                 this.getModel().equals(car.getModel()) &&
                 this.getMaxSpeed() == car.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }

}

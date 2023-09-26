package com.systechafrica.interface1;

public class InterfaceDemo {
    public static void main(String[] args) 
    {
        //? upcasting
        ThreePlugPin mc = new MobileCharger();
        ThreePlugPin lc = new LaptopCharger();
        ThreePlugPin cp = new CookerPlug();

        mc.plugIn();
        mc.plugOut();

        lc.plugIn();
        lc.plugOut();

        cp.plugIn();
        cp.plugOut();

       
        CalculateArea sq = new Square();
        System.out.println(sq.calculateArea(5, 5));
        CalculatePerimeter sqp = new Square();
        System.out.println(sqp.calculatePerimeter(5, 5));

        //or
        //Square sq = new Square();
        //System.out.println(sq.calculateArea(5, 5));
        //System.out.println(sq.calculatePerimeter(5, 5));

      //System.out.println(Square.MY_NAME);
      //System.out.println(Square.MY_NAME_Full);

      System.out.println(sqp.sum(2,3));

      UserController uc = new UserControllerimpl();
        User user = new User("001","Ivy");
        User createdUser = uc.createUser(user);


        System.out.println(createdUser);
    }
    
}

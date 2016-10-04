/**
 * Created by Мария on 03.10.2016.
 */


public class Calculator {

    public static void main(String[] args)
    {
        System.out.println("Put your numbers:");
        if (args.length == 2)
        {




            System.out.println("First number:" + args[0] + ",second number:" + args[1]);




            String argument0 = args[0];


            double arg0 = Double.valueOf(args[0]);

            System.out.println(arg0);
            System.out.println(argument0);

            double a = Double.valueOf(args[0]) + Double.valueOf(args[1]);
            System.out.println(a);
            double b = Double.valueOf(args[0]) - Double.valueOf(args[1]);
            System.out.println(b);
            double d = Double.valueOf(args[0]) * Double.valueOf(args[1]);
            System.out.println(d);
            double c = Double.valueOf(args[0])/ Double.valueOf(args[1]);
            System.out.println(c);

        }
        else
        {
            System.out.println("Couldn't be done");

        }
    }
}


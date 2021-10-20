package Homework;

public class PositiveNegativeZero
{
    public static void main(String[] args) {
        int  number = -10;
        System.out.println(+number);

        if(number>=1)
            System.out.println(number+ " is positive number");
        else if(number==0)
            System.out.println(number+ " is zero number");
        else
            System.out.println(number+ " is negative number");
    }
}


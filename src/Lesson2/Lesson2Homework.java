package Lesson2;

public class Lesson2Homework {
    public static void main(String[] args) {
        int square = 450;
        int height = 12;
        int volume = 23;
        System.out.println("max V= " + ((square*height) -volume ));
        calculateMaxOilVolume();
        int amountMC = 41;
        int firstPur=3;
        int secondPur = 6;
        int thirdPur = 12;
        int AmountMS = 350;
        System.out.println("Amount of money left ="+ ((amountMC-firstPur-secondPur-thirdPur+AmountMS)));
        calculateMoney();
        printout();
    }
        public static void calculateMoney()
        {
            System.out.println("Amount of Money left:="+ ((41-3-6-12+350)));
        }
        public static void calculateMaxOilVolume()
        {
            System.out.println("max V:=" + ((450*12)-23));
        }
        public static void printout()
        {
            System.out.println("    V   A   V     V  J       ");
            System.out.println("    V  A A   V   V  J J    ");
            System.out.println("V   V A A A   V v  J J J");
            System.out.println(" VVV A     A   V  J     J");
        }
    }


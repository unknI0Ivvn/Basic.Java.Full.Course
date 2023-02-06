package Lesson7;

public class Lesson7HomeWorkCheat {
    public static void main(String[] args) {
        printFromAtoBWithStepC(2, 7, 2);
        System.out.println(sumFromAtoBwithStepC(2, 7, 2));
        //int a = 1,c = 3,d=5;
        /*
        int a = 1;
        int c = 3;
        int d = 5;

         */
        printAllDividedBy3Or7Or13(100);
        System.out.println(complexPercent(1000, 1, 10));
        System.out.println(factorial(4));
        System.out.println(decrypt('A'));
        System.out.println(calculate(2, 2, '*'));
        System.out.println(reverse("Alexander"));
        printNChars(5,'*');
        System.out.println();
        printNChars(3,'#');
        ;
    }

    public static void printFromAtoBWithStepC(int a, int b, int c) {
        /*
        for (int i =a; i <b;i+=c)
        {
            System.out.println(i);
        }

         */
        for (; a <= b; a += c) {
            System.out.println(a);
        }
    }

    //Первое домашнее задание.Подпункт 2
    /*
    public static int sumFromAtoBwithStepC(int a,int b,int c)
    {
        int sum = 0;
        for(;a<=b;a+=c)
        {

            sum+=a;
        }
        return sum;
    }
    */
    public static int sumFromAtoBwithStepC(int a, int b, int c) {
        int sum = 0;
        for (; a <= b; sum += a, a += c)
            ;

        return sum;
    }

    public static void printAllDividedBy3Or7Or13(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0)
                System.out.println(i);
        }
        int b = 1;
    }

    //
    public static double complexPercent(double money, double percent, int years) {
        for (int i = 0; i < years; i++) {
            money = money * (percent / 100 + 1);   /// 10 раз возвращается и умнождает предыдушую сумму на 1 01
        }
        return money;
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static int decrypt(char c) {
        int result = 0;
        switch (c) {
            case 'A':
            case 'B':
            case 'C':
                result = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                result = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                result = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                result = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                result = 6;
                break;
            case 'P':
            case 'R':
            case 'S':
                result = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                result = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
                result = 9;
                break;
            default:
                result = 0;


        }
        return result;
    }

    public static double calculate(double a, double b, char op) {
        return switch (op) {
            case '*' -> a * b;
            case '+' -> a + b;
            case '/' -> a / b;
            case '-' -> a - b;
            default -> 0;
        };
    }

    public static String reverse(String text) {
        String result = "";
        //Alexander
        for (int i = text.length() - 1; i >= 0; i--) {
            String sub = text.substring(i, i + 1);
            result += sub;
        }
        return result;
    }

/*
            public static void pyramid (int rows)
            {
                for(int r = 0; r < rows; r++)
                {
                    for(int c1= rows - r - 1;c1 >=1; c1--)
                    {
                        System.out.println("_");
                    }
                    for(int c2 = 1;c2<=2*r+1;c2++)
                    {
                        System.out.println("*");
                    }
                    System.out.println();
                }
            }

 */
    public static void printNChars(int n,char c)
    {
        for (int i =0;i<n;i++)
        {
            System.out.println(c);
        }
    }
        }



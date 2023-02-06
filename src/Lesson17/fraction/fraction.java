package Lesson17.fraction;

public class fraction {

    private int num;
    private int den;

    public static void main(String[] args) {
        fraction f1 = new fraction(350, 140);
        fraction f2 = new fraction(2, 3);
        f1.print();

        fraction f3 = f1.multiply(f2);
        f3.print();
        f2.devide(f2).print();

       // f1.add(f2).print();

        f1.multiply(f2).print();

        //System.out.println(gcd(80, 120));
    }

    public static int gcd(int f, int s) {
        // 1071 = 2x462 + 147
        //f         s
        //462 = 3 x 147 +21.
        int r = f % s;
        while (r != 0) {
            f = s;
            s = r;
            r = f % s;
        }
        return s;
    }

    public fraction(int num, int den) {
        int n = gcd(num, den);
        if (n != 1) {
            num /= n;
            den /= n;
        }
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public fraction multiply(fraction f)
    {
        int n = getNum() * f.getNum();
        int d = getDen() * f.getDen();
        return new fraction(n, d);
    }
    public fraction devide(fraction f)
    {
        int n = getNum() * f.getNum();
        int d = getDen() * f.getDen();
        return new fraction(n, d);
    }

    public fraction add(fraction f) {
        int n = getNum() * f.getDen() + getDen() * f.getNum();
        int d = getDen() * f.getDen();
        return new fraction(n, d);

    }
    public fraction subtract(fraction f) {
        int n = getNum() * f.getDen() - getDen() * f.getNum();
        int d = getDen() * f.getDen();
        return new fraction(n, d);

    }

    public void print()
    {
        System.out.println("" + num + "/" + den);
    }
}

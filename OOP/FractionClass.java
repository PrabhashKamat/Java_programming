package OOP;
class Fraction {
    int num;
    int deno;

    Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
        simplify();
    }

    void print() {
        System.out.println(this.num + "/" + this.deno);
    }

    void add(Fraction f) {
        this.num = this.num * f.deno + this.deno * f.num;
        this.deno = this.deno * f.deno;
        simplify();
    }

    void subtraction(Fraction f) {
        this.num = this.num * f.deno - this.deno * f.num;
        this.deno = this.deno * f.deno;
        simplify();
    }

    void mul(Fraction f) {
        this.num = this.num * f.num;
        this.deno = this.deno * f.deno;
        simplify();
    }

    void divide(Fraction f) {
        this.num = this.num * f.deno;
        this.deno = this.deno * f.num;
        simplify();
    }

    void simplify() {
        int gcd = hcf(num, deno);
        num = num / gcd;
        deno = deno / gcd;
    }

    int hcf(int a, int b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }
}

public class FractionClass {
    public static void main(String[] arg) {

        Fraction f1 = new Fraction(2, 2);
        Fraction f2 = new Fraction(2, 2);

        f1.add(f2);

        f1.print();
    }
}
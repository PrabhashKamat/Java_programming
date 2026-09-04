package OOP;
class ComplexNum{
    int x;
    int y;

    ComplexNum(int x,int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>=0)  System.out.println(x+" + "+y+"i");
        else   System.out.println(x+" - "+(-y)+"i");

    }
    void add(ComplexNum z){
        this.x+=z.x;
        this.y+=z.y;
    }
    void mul(ComplexNum z){
        this.x=this.x*z.x - this.y*z.y;
        this.y=this.x*z.y + this.y*z.x;
    }
}

public class ComplexNumberClass {
    static void main() {
        ComplexNum z1 = new ComplexNum(3,4);
        ComplexNum z2 = new ComplexNum(3,4);
        z1.mul(z2);
        z1.print();
    }
}

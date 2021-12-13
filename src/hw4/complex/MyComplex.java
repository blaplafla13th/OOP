package hw4.complex;

public class MyComplex {
    private double real = 0.0;
    private double imagine = 0.0;

    public MyComplex(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public MyComplex() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagine() {
        return imagine;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

    public void setValue(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public String toString() {
        if (imagine > 0)
            return "(" + real + "+" + imagine + "i)";
        else if (imagine < 0)
            return "(" + real + imagine + "i)";
        else if (real == 0)
            return "(" + imagine + "i)";
        else if (imagine == 0)
            return "(" + real + ")";
        else return "";
    }

    public boolean isReal() {
        return imagine == 0;
    }

    public boolean isImagine() {
        return real == 0;
    }

    public boolean equals(double real, double imagine) {
        return this.real == real && this.imagine == imagine;
    }

    public boolean equals(MyComplex another) {
        return this.equals(another.getReal(), another.getImagine());
    }

    public double magnitude() {
        return Math.sqrt(real * real + imagine * imagine);
    }

    public MyComplex add(MyComplex another) {
        real += another.getReal();
        imagine += another.getImagine();
        return this;
    }

    public MyComplex subtract(MyComplex another) {
        real -= another.getReal();
        imagine -= another.getImagine();
        return this;
    }

    public MyComplex addNew(MyComplex another) {
        return new MyComplex(real + another.getReal(),
                imagine + another.getImagine());
    }

    public MyComplex subtractNew(MyComplex another) {
        return new MyComplex(real - another.getReal(),
                imagine - another.getImagine());
    }

    public double argument() {
        return Math.atan2(imagine, real);
    }

    public MyComplex multiply(MyComplex right) {
        double realNew = real * right.getReal() - imagine * right.getImagine();
        double imagineNew = real * right.getImagine() + imagine * right.getReal();
        this.setValue(realNew, imagineNew);
        return this;
    }

    public MyComplex multiplyNew(MyComplex right) {
        double realNew = real * right.getReal() - imagine * right.getImagine();
        double imagineNew = real * right.getImagine() + imagine * right.getReal();
        return new MyComplex(realNew, imagineNew);
    }

    public MyComplex divide(MyComplex right) {
        MyComplex temp = this.multiplyNew(right.conjugate());
        double mau = right.getReal() * right.getReal()
                + right.getImagine() * right.getImagine();
        temp.setValue((temp.getReal() / mau), (temp.getImagine() / mau));
        this.setValue(temp.getReal(), temp.getImagine());
        return this;
    }

    public MyComplex divideNew(MyComplex right) {
        MyComplex temp = this.multiplyNew(right.conjugate());
        double mau = right.getReal() * right.getReal()
                + right.getImagine() * right.getImagine();
        temp.setValue((temp.getReal() / mau), (temp.getImagine() / mau));
        return temp;
    }

    public MyComplex conjugate() {
        imagine = -imagine;
        return this;
    }
}

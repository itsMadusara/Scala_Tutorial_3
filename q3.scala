object q3 extends App{
    def VolSphere(x: Double):Double={
        return Math.PI*x*x*x*4/3;
    }
    printf("%.2f",VolSphere(5));
}

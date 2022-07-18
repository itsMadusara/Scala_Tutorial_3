object q3 extends App{
    def VolSphere(x: Double):Double={
        return 4.0/3.0*Math.PI*x*x*x;
    }
    printf("%.2f",VolSphere(5));
}

object q4 extends App{
    def Tot(x: Integer):Double=x*24.95;
    def discount(tot: Double):Double=tot*0.4;
    def shipping(x: Double):Double={
        x>50 match{
            case true => 3+(x-50)*0.75;
            case false => 3.0;
        }
    }
    var y:Double = 0;
    y=Tot(60)-discount(Tot(60))+shipping(60);
    printf("%.2f",y);
    //printf(Tot(60)-discount(Tot(60))+shipping(60));
}
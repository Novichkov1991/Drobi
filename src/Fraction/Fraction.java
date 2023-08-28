package Fraction;

public class Fraction {
    // числитель
    private int numenator;
    //знаминатель
    private int denumenator;

    public Fraction() {
        this.numenator = 1;
        this.denumenator = 1;

    }
    public Fraction(int numenator, int denumenator){
        this.numenator = numenator;
        this.denumenator = denumenator;
        this.reduction();
    }

    public Fraction plus(Fraction fraction){
        this.commonDen(fraction);
        Fraction result = new Fraction(this.numenator + fraction.numenator, this.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }

    public Fraction minus(Fraction fraction){
        this.commonDen(fraction);
        Fraction result = new Fraction(this.numenator-fraction.numenator, this.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }
    private void commonDen(Fraction fraction){
        int commonDen  = this.denumenator * fraction.denumenator;
        this.numenator *= fraction.denumenator;
        fraction.numenator *= this.denumenator;
        this.denumenator = commonDen;
        fraction.denumenator = commonDen;
    }

    public void reduction(){
        int div = 0;
        if (this.numenator<this.denumenator){
            div = this.numenator;
        } else {
            div = this.denumenator;
        }
        for (int i = div; i>1; i--){
            if(this.numenator%i == 0 && this.denumenator%i==0){
                this.denumenator /=i;
                this.numenator /=i;
            }
        }
    }

    public Fraction delenie(Fraction fraction){
        this.commonDen(fraction);
        Fraction result = new Fraction(this.numenator*fraction.denumenator, this.denumenator*fraction.numenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }

    public Fraction umnojenie(Fraction fraction){
        this.commonDen(fraction);
        Fraction result = new Fraction(this.numenator*fraction.numenator, this.denumenator*fraction.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }

    @Override
    public String toString() {
        return numenator+"/"+denumenator;
    }
}

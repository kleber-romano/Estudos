package application;



public abstract class Triangulo {
    private double catetoAdj,
            catetoOposto,
            hipotenusa;

    protected Triangulo(double catetoAdj, double catetoOposto, double hipotenusa) {
        this.catetoAdj = catetoAdj;
        this.catetoOposto = catetoOposto;
        this.hipotenusa = hipotenusa;
    }

    public Boolean AnalisaSeEtriangulo(){

    }



    public void Calcular(Level FLevel){
       if ( AnalisaSeEtriangulo() ){
        if (FLevel == Level.Nenhum){

        }
         }else{
           FLevel = Level.NaoeTringulo;
       }
    };

    public void SetValues(double catetoAdj,
                     double catetoOposto,
                     double hipotenusa){

    };

    public Level GetLevel(){

    }



}

class tringuloAcutangulo extends  Triangulo{

    tringuloAcutangulo() {
        super(catetoAdj, catetoOposto, hipotenusa);

    }

    @Override
    public void Calcular() {
        super.Calcular();


    }

}
class trianguloObtusangulo extends  Triangulo{

    trianguloObtusangulo() {
        super(catetoAdj, catetoOposto, hipotenusa);

    }

    @Override
    public void Calcular() {
        super.Calcular();

    }
}

class trianguloRetangulo extends Triangulol{

    trianguloRetangulo() {
        super(catetoAdj, catetoOposto, hipotenusa);
    }

    @Override
    public void Calcular() {
        super.Calcular();
    }
}

class trianguloIsosceles extends  Triangulol{

    trianguloIsosceles() {
        super(catetoAdj, catetoOposto, hipotenusa);
    }

    @Override
    public void Calcular() {
        super.Calcular();
    }
}

class Proxy {

    private double catetoAdj,
            catetoOposto,
            hipotenusa;
    public Proxy(){
        Level FLevel = Level.Nenhum;
        FLevel = new trianguloIsosceles(catetoAdj,catetoOposto,hipotenusa);
        FLevel = new trianguloRetangulo();
        FLevel = new trianguloObtusangulo();
        FLevel = new tringuloAcutangulo();

        public String GetResul(){

            switch (FLevel) {
                case Isosceles:
                    break;

                case Retangulo:
                    break;

                case Acutangulo:
                    break;

                case Obtusangulo:
                    break;
                case NaoeTringulo:
                    break;

                case Nenhum:
                    break;
            }
        }
    }


    printf(new Proxy().GetResul())
}

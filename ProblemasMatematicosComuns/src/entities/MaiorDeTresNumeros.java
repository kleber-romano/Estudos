package entities;

public class MaiorDeTresNumeros {
    private double x, y, z, maior, medio, menor;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public double getMedio() {
        return medio;
    }

    public void setMedio(double medio) {
        this.medio = medio;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    public MaiorDeTresNumeros() {

    }

    public void MaiorDeTresNumeros(double x, double y, double z) {
        if(x > y && x > z){
            if(y > z) {
                maior = x;
                medio = y;
                menor = z;
            } else{
                maior = x;
                medio = z;
                menor = y;
            }
        } else if(y > x && y > z){
            if(x > z){
                maior = y;
                medio = x;
                menor = z;
            }else{
                maior = y;
                medio = z;
                menor = x;
            }
        }else if (z > x && z > y){
            if (x > y){
                maior = z;
                medio = x;
                menor = y;
            }else{
                maior = z;
                medio = y;
                menor = x;
            }
        }else{
            maior = x;
            medio = y;
            menor = z;
        }



    }
}

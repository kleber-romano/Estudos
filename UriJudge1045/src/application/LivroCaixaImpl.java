package application;

import java.sql.Time;
import java.util.Date;
import java.util.List;

 class Livroprops{

      Date Data;
      Time Hora;
      String Ocorrencia;
      Double Entrada;
      Double Saida;
      Double Saldo;

 }


public class LivroCaixaImpl extends LivroCaixa {
   private Livroprops FLinha;
   private List<Livroprops> FList;
    @Override
    public void Abertura() {

    }

    @Override
    public void Enderramento() {

    }

    @Override
    public void Entrada(double AValor) {
        FLinha = new Livroprops();
        FLinha.Entrada = AValor;
        FList.add(FLinha) ;
    }

    @Override
    public void Saida(double ASaida) {
        FLinha = new Livroprops();
        FLinha.Saida = AValor;
        FList.add(FLinha) ;
    }

    @Override
    public void ImprimeLivro() {

    }

    @Override
    public double Saldo() {
        return 0;
    }

    @Override
    public void GravarLivro() {

    }

    @Override
    public void ConsultaCruzada(Date Datainicio, Date DataFinal) {

    }

    @Override
    public void TranformaEmPaginaHtml() {

    }
}

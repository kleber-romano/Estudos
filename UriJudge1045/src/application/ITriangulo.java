package application;


import java.util.Date;

enum Level {
    Nenhum,
    NaoeTringulo,
    Acutangulo,
    Obtusangulo,
    Retangulo,
    Isosceles
}

public interface ILivrocaixaEspecial{
    void ConsultaCruzada(Date Datainicio,Date DataFinal);
    void TranformaEmPaginaHtml();
}


public interface ILivroCaixa {
    void Abertura();
    void Enderramento();
    void Entrada(double AValor);
    void Saida(double ASaida);
    void ImprimeLivro();
    double Saldo();
    void GravarLivro();

}

abstract class LivroCaixa implements ILivroCaixa,ILivrocaixaEspecial{


}

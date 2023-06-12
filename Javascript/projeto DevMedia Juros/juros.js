import entData from 'readline-sync';

let valorDevido = entData.questionFloat('Informe o valor devido em reais (R$): ');
let diasAtraso = 0;
let juros = 0;
let valorComJuros = 0;

if(valorDevido <= 0){ 
    console.log('O valor digitado deve ser superior a 0!')
}else
{
    diasAtraso = entData.questionInt('Dias em atraso: ');

if(diasAtraso <= 0){
    console.log('Você está em dia!');
}else{
    if(diasAtraso > 0 && diasAtraso <= 15){
        juros = 0.05;
        valorComJuros = (valorDevido + (juros * valorDevido)).toFixed(2);
        
        console.log(`Taxa de juros: ${juros*100}%`);
        console.log(`O valor devido acrescido de juros é de R$ ${valorComJuros}.`);
    } else if(diasAtraso > 15 && diasAtraso <= 60){
        juros = 0.10;
        valorComJuros = (valorDevido + (juros * valorDevido)).toFixed(2);
        
        console.log(`Taxa de juros: ${juros*100}%`);
        console.log(`O valor devido acrescido de juros é de R$ ${valorComJuros}.`)
    }else{
        console.log('Entre em contato com sua instituição financeira!');
    }

    
}

}




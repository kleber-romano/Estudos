import entDados from 'readline-sync';

//let nome = entDados.question('Digite seu nome: ');
//let idade = entDados.question('Digite sua idade: ');

//console.log(`Olá, ${nome}, você tem ${idade}. Espero que possamos nos dar bem!`);


console.log('********* CONVERSOR DE UNIDADE **********');
let milhas = entDados.question('Digite o valor em milhas que deseja converter para kilômetros: ')

let km = (milhas/0.62).toFixed(2);

console.log(`${milhas} milhas correspondem a ${km} km.`);
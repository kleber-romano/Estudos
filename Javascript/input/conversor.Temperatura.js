import entData from 'readline-sync';

let celsius = entData.question('Digite a temperatura em Celsius: ');

let kelvin = Number(celsius) + 273.15

console.log(`${celsius}º celsius correpondem a ${kelvin}º kelvin`);
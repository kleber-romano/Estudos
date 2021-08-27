using System;

namespace LoopFor
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero, soma;

            soma = 0;

            numero = int.Parse(Console.ReadLine());

            for (int i = 0; i < numero; i++){
                
                int x = int.Parse(Console.ReadLine());
                soma += x;
            }

            Console.WriteLine(soma);
            

        }
    }
}

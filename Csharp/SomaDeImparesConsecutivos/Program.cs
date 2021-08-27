using System;

namespace SomaDeImparesConsecutivos
{
    class Program
    {
        static void Main(string[] args)
        {
            int min = 0;
            int max = 0;
            int soma = 0;
            int numero1 = int.Parse(Console.ReadLine());
            int numero2 = int.Parse(Console.ReadLine());

            if(numero1 < numero2)
            {
                min = numero1;
                max = numero2;
            } else {
                min = numero2;
                max = numero1;
            }

            for(int i = min + 1; i < max; i++)
            {
                if(i%2 != 0){
                    soma += i;
                }
            }
            Console.WriteLine(soma);
        }
    }
}

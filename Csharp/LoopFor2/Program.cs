using System;

namespace LoopFor2
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = int.Parse(Console.ReadLine());
            int soma = 0;

            for (int i = 1; i <= numero; i++)
            {
                int x = int.Parse(Console.ReadLine());
                soma = soma + x;
            }
            Console.WriteLine(soma);
            //Console.ReadLine();
        }
    }
}

using System;

namespace Tabuada
{
    class Program
    {
        static void Main(string[] args)
        {
            int numero = int.Parse(Console.ReadLine());

            for(int i = 0; i < 10; i++){
                Console.WriteLine((i + 1) + " x " + numero + " = " + numero * (i + 1));
            }
        }
    }
}

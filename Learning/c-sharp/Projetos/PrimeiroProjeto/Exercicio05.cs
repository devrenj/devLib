using System;

namespace PrimeiroProjeto
{
    internal class Exercicio05
    {
        static void Main(string[] args)
        {
            int entrada = 6;
            for (int i = 1; i <= entrada; i++)
            {
                if (entrada % i  == 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
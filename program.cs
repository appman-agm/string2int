using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {
            String input = "abc573";
            List<Char> outputList = new List<Char>();
            foreach (var var in input.ToList())
            {
                if ("0123456789".ToList().Contains(var))
                {
                    outputList.Add(var);
                }
            }
            String output = new String(outputList.ToArray());
            Console.WriteLine(output);
        }
    }
}

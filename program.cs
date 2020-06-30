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
            int total = 0;                          
            int factor = 1;                        
            List<Char> output = input.ToList().FindAll(c => "0123456789".ToList().Contains(c)); // Get a list of characters that are a number
            output.Reverse();                                                                   // Reverse the order to apply a factor
            output.ForEach(cr => {                                                              
                    total += (cr - '0') * factor;                           // Retrieve the integer value, apply the factor and add to total
                    factor *= 10;
            });
            Console.WriteLine(total);
        }
    }
}

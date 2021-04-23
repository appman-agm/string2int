using System;
using System.Text.RegularExpressions;

namespace string2int
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please Input any string or int");
            var intput = Console.ReadLine().ToString();
            string output = Regex.Replace(intput, "\\D+", "").Trim();    
            Console.Write("Result : ");
            Console.WriteLine(StrToInt(output));

            int StrToInt(string str)
            {
                int response = 0;
                foreach (char c in str)
                {
                    response *= 10;
                    response += c - '0';
                }
                return response;
            }
        }
    }
}

using System;

namespace string2int
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please Input any string or int");
            var str = Console.ReadLine().ToString();
            string numericString = string.Empty;
            foreach (var c in str)
            {
                // Check for numeric characters
                if ((c >= '0' && c <= '9'))
                {
                    numericString += c.ToString();
                }
            }
            Console.Write("Result : ");
            Console.WriteLine(StrToInt(numericString));


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

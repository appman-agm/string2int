using System;

namespace string2int
{
    class Program
    {
        static void Main(string[] args)
        {
            var inputValue = Console.ReadLine();
            int output = 0;
            string tmp = "";
            for (int i = 0; i < inputValue.Length; i++)
            {
                if (inputValue[i]>= 48 && inputValue[i] <= 57)
                {
                    tmp += inputValue[i];
                }
            }
            foreach (char ascii in tmp)
            {
                output *= 10;
                output += ascii - 48;
            }
            Console.WriteLine("Interger is : " + output);
        }
        
    }
    
}

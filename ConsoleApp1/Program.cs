using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("string2int Challenge");
            Console.WriteLine("Plaese Input => ");

            string _strInput = Console.ReadLine();

            _strInput = _strInput.Replace(" ", string.Empty);

            string _strOutput = string.Empty;
           
            foreach (var item in _strInput)
            {
                if (item >= '0' && item <= '9')
                {
                    _strOutput += item;
                }             
            }

            Console.WriteLine("int Oput => " + _strOutput);
            Console.ReadLine();
        }
    }
}

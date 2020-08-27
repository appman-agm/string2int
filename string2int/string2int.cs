using System;
using System;

public class string2int
{
    public static void Main()
    {
        string str = Console.ReadLine();
        int num = 0;
        bool[] chk = new bool[128];
        foreach (char c in str)
        {
            if (c>=48 && c <= 57)
            {
                Console.WriteLine(c);
                num *= 10;
                num += c - '0';
            }


        }
        Console.WriteLine(num);
    }
}


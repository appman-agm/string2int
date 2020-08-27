using System;
using System;

public class string2int
{
    public static void Main()
    {
        string str = Console.ReadLine();
        string st = "";
        int num = 0;
        bool[] chk = new bool[128];
        int index = str.Length();
        for (int i = 0; i < index; i++)
        {
            if (chk[(int)str[i]])
            {
                st += x;
            }
        }
        num = num * 10 + valueOf(st);
        Console.WriteLine(num);
    }
}


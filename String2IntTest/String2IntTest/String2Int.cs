using System;
/**
 * Fillter all integers in given string, build whole integer and return it
 * 
 * Note: The reason it doesn't have Main function is, it is supposed to be a
 * converter and used as utility function.
 * 
 * **/
namespace String2IntTest
{
    public class String2Int
    {
        int _Integer;
        public int GetInteger
        {
            get { return _Integer; }
        }
        public void FillterInteger(string strinput)
        {
            int output = 0 ;
            bool IsHasDigit = false;

            if (strinput.Length == 0)
            {
                throw new ArgumentException("No input data");
            }

            foreach (char i in strinput)
            {   
                if (IsDigit(i))
                {
                    IsHasDigit = true;
                    output = (output * 10) + ((int)i - 48);
                }
            }

            if (!IsHasDigit && output == 0)
            {
                throw new ArgumentException("Output is null");
            }

            _Integer = output;
        }
        private bool IsDigit(char c)
        {
            return (int)c >= 48 && (int)c <= 57 ;
        }
    }

}

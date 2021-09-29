using System;

namespace String2IntTest
{

    public class String2Int
    {
        int _StrInput;
        public int GetStr2Int
        {
            get { return _StrInput; }
        }
        public void GetOnlyDigit(string strinput)
        {
            int output = 0 ;
            bool IsHasDigit = false;

            if (strinput.Length == 0)
            {
                throw new ArgumentException("No input data");
            }

            foreach (char i in strinput)
            {
        
                if ((int)i >= 48 && (int)i <= 57)
                {
                    IsHasDigit = true;
                    output = (output * 10) + ((int)i - 48);
                }
            }

            if (IsHasDigit == false && output == 0)
            {
                throw new ArgumentException("Output is null");
            }

            _StrInput = output;
        }

    }

}

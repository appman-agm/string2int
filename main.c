#include <stdio.h>
#include <stdlib.h> // string to int convertion
#include <string.h> // String

int String2Int(char *string) // use pointer to get string
{
    int a, b, c = 0;
    int length = strlen(string);

    for (a = 0; a < length; a++)                                // Going through each alphabet
    {
        for (b = 0; b < length; b++)                            // For each letter
        {
            if (!(string[b] >= '0' && string[b] <= '9'))		// Check for non-number
			{
				for (c = b; c < length; c++)         
				{
					string[c] = string[c + 1];					// If not number overwrite non number with next character for all letter in alphanumeric
				}
				length--;
			}
		
        }
    }
    int x = atoi(string);										// Convert to Int
	printf("%i",x);
}

int main()
{
	char input[100] = {0};		// create hold value of input
	gets(input);				// get input
	String2Int(input);			// put input into function
	system("pause");			// pause system
	return 0;					// close program
}
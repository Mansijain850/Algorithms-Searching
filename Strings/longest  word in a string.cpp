/*Using the C++ language, have the function longest(str) take the sen parameter being passed and return the largest word in the string.
If there are two or more words that are the same length, return the first word from the string with that length. 
Ignore punctuation and assume sen will not be empty.
 ---------------------------
Sample Test Cases

Input:"fun&!! time"
Output:"time"

Input:"I love dogs"
Output:"love"
*/
#include<iostream>
using namespace std;
string longest(string str)
{

    string  s,temps;
    for(int i=0;i<str.size();i++)
    {

        if(str[i]>='A'&&str[i]<='Z' || str[i]>='a'&&str[i]<='z')
        {
            temps +=str[i];

        }
        else
        {
            if(temps.size()>s.size())
            {

                s=temps;



            }
             temps.clear();
        }

    }
    if(temps.size()>s.size())
    {
        s=temps;
    }
    return s;
}
int main()
{
    cout<<longest("will be used to store and return output");
    return 0;
}

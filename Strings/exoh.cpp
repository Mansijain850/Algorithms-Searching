/*determine if the number of x's in the string is equal to the number of o's.
 For example, if the string were "xoox" then your program should return the string true.
*/
#include<iostream>
#include<string>
using namespace std;
string validate(string str)
{
    int exes=0;
    int ohs=0;
  string found;
    for(int i=0;i<str.length();i++)
    {

        if(str[i]=='x'|| str[i]=='X')
        {
            exes++;
        }
        else
        {
            ohs++;
        }

    }
    if(exes==ohs)
    {
        found="yay";

        }
        else
        {
            found="nay";
        }
        return found;


}

int main()

{
    string str = "xoxo";
    cout<<validate(str);
    return 0;
}

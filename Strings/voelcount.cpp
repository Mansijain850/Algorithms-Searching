/*This challenge requires you to return the number of vowels (a, e, i, o, u) in a string.
For example, if the string is "All cows eat grass" then your program should return the integer 5.
*/
#include<iostream>
#include<string>
using namespace std;

bool vowel(char ch)
{

    ch =toupper(ch);
    return(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');

}
int countfunc(string str)
{
    int count=0;

    for(int i=0;i<str.length();i++)
    {

        if(vowel(str[i]))
        {
            //if(count==temp)
            count++;
        }
    }
    return count;
}
int main()
{
    cout<<countfunc("aeiou");
    return 0;
}

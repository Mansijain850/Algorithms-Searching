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

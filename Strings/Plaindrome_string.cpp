/*palindrome string
*/
#include<bits/stdc++.h>
#include<string>
using namespace std;
string rev(string &str)
{

    int n=str.length();
    for(int i=0;i<n/2;i++)
    {

        swap(str[i],str[n-1]);
    }
    return str;
}
int main()
{

    string orignal = "naman";
    string cop = rev(orignal);
    if(strcmp(orignal,cop))
        cout<<"nah";
    else
        cout<<"yaa";
    return 0;
}

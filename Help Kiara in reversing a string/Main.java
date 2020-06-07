#include <iostream>
#include <cstring>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, i;    
cin.getline(str,100);
 for(i=strlen(str)-1;i>=0;i--)
  {
    rev[count]=str[i];
    count++;
  } 
cout<<rev;
}
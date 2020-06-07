#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[100];
  int i,c=0;
  cin>>str;
  for(i=0;i<strlen(str);i++)
    c++;
  cout<<"The number of letters in the name is "<<c;
  
}
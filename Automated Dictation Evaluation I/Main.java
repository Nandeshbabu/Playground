#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[100],str1[100];
  cin>>str>>str1;
  if(strcmp(str,str1)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50],str1[50],i,j,temp;
  cin>>str>>str1;
  j = strlen(str) - 1;
  for (i = 0; i < j; i++,j--)
    {
        temp = str1[i];
        str1[i] = str1[j];
        str1[j] = temp;
    }
  if(strcmp(str,str1)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
}
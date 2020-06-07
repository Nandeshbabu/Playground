#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   char str[100];
  int b=0,i;
   cin.getline(str,100);
  for(i=0;i<strlen(str);i++)
    if(str[i]==' ')
      b++;
  if(b<10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}
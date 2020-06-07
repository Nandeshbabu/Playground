#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[500];
  int v=0,w=0,d=0,c=0,s=0,i;
  cin.getline(str,500);
  for(i=0;i<strlen(str);i++){
    if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'|| str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U' )
      v++;
    else if(str[i]==' ')
      w++;
    else if(str[i]>='0' && str[i]<='9')
      d++;
    else if(str[i]>=65 && str[i]<=90 || str[i]>=97 && str[i]<=122 && !(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'|| str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'))
      c++;
    else
      s++;
  }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<s;
     
}
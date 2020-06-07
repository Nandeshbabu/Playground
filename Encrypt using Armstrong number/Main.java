#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int n,temp,digit,arm=0,count;
    cin>>n;
    temp=n;
    count = (n == 0) ? 1  : (log10(n) + 1);
    while(n>0)
    {
      digit=n%10;
      arm=arm+pow(digit,count);
      n=n/10;}
    if(arm==temp)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";
    
}
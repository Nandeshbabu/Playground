#include<iostream>
using namespace std;
int main()
{
  int n1, n2,a,b;
  cin>>n1>>n2;
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = ";
  while(n1!=n2)
   {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }
   cout<<n1;

    return 0;
}
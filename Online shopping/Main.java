#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int   fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  string ans;
  fa=fa-((fa*fd)/100);
  fa=fa+fs;
  sa=sa-((sa*sd)/100);
  sa=sa+ss;
  aa=aa-((aa*ad)/100);
  aa=aa+as;
  ans=(fa<=sa)?(fa<=aa)?"Flipkart":"Amazon":(sa<=aa)?"Snapdeal":"Amazon";
  cout<<"In Flipkart Rs."<<fa;
  cout<<"\nIn Snapdeal Rs."<<sa;
  cout<<"\nIn Amazon Rs."<<aa;
  cout<<"\nHe will prefer "<<ans;
  
}
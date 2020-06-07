#include<iostream>
using namespace std;
int main()
{
  int h1,h2,m1,m2,s1,s2,h,m,s;
  cin>>h1>>m1>>s1>>h2>>m2>>s2;
  if(s2>s1){
    --m1;
    s1+=60;}
  s=s1-s2;
  if(m2>m1)
  {
    --h1;
    m1+=60;}
  m=m1-m2;
  h=h1-h2;
  cout<<h<<":"<<m<<":"<<s;
}
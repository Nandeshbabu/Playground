#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thu,fri,sat;
  cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
  int week=mon+tue+wed+thu+fri;
  int s=0;
  int w[5]={mon,tue,wed,thu,fri};
  s+=sun*150;
  s+=sat*125;
  for(int i=0;i<5;i++)
  {
    s+=w[i]*100;
    if(w[i]>8)
      s+=(w[i]-8)*15;
  }
  if(week>40)
    s+=(week-40)*25;
  cout<<s;
}
arr=input()
s=10
i=1
flag=0
for j in arr:
  if(s<i):
    flag=1
    break
  elif(j=='W'):
    s+=i
    i=(i-1)//2+1
  else:
    s-=i
    i*=2
if(flag==1):
  print("-1")
else:
  print(s)
ni=int(input())
for ti in range(ni):
  n=int(input())
  l=list(map(int,input().split()))
  fi=0
  fj=0
  i1=0
  j1=0
  for i in range(0,n-1):
    if(l[i]<=l[i+1]):
      j1=i+1
    else:
      if((j1-i1)>(fj-fi)):
        fj=j1
        fi=i1
      i1=i+1
  if((j1-i1)>(fj-fi)):
        fj=j1
        fi=i1    
  for i in range (fi,fj+1):
      print(l[i],end=" ")
  print() 
      
      
    
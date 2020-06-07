def problem(n):
  if(n==0):
    return 0
  elif(n==1):
    return 1
  else:
    return (problem(n-1)+1)%n+1
n=int(input())
print(problem(n)-1)
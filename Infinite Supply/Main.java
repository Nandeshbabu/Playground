n=int(input())
coins=list(map(int,input().split()))
amount=int(input())
l=[[0 for i in range(amount+1)] for j in range(n+1)]
for i in range(0,n+1):
	for j in range(1):
		l[i][j]=1
k=0
coins.sort()
for j in coins:
    k+=1
    for i in range(1,amount+1):
        if(i-j<0):
            l[k][i]=l[k-1][i]
        elif(k==1):
            l[k][i]=l[k][i-j]
        else:
            l[k][i]=l[k-1][i]+l[k][i-j]
print(l[n][amount])            
            
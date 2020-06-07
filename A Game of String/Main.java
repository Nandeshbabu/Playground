s=input()
stack=[]
h=""
for i in s:
	stack.append(i)
for i in range(len(stack)):
	h+=stack.pop()
print(h)    
	
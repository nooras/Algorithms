a = input()
num = []
capL = []
smallL =[]
for i in range(len(a)):
    if(a[i].isdigit()):
        num.append(a[i])
    elif(a[i].isupper()):
        capL.append(a[i])
    elif(a[i].islower()):
        smallL.append(a[i])
num1 = []
num2 = []
for i in range(len(num)): 
    if(int(num[i]) % 2 == 0):
        num1.append(num[i])
    else:
        num2.append(num[i])
num = num2 + num1
capL.sort()
smallL.sort()
print(''.join(smallL)+''.join(capL)+''.join(num))


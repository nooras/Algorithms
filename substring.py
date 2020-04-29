#Finding string in another string
x=input()
y=input()
i=0
flag=0
j=0
while(j != len(y)):
    if(x[i]==y[j]):
        i += 1
        j += 1
        if(i==len(x)):
            flag=1
            break
        continue
    else:
        i=0
        if(x[i]==y[j]):
            continue
        else:
            j += 1
if(flag == 1):
    print("Substring")
else:
    print("Not Substring")

'''
Output:
xyz
xaxyz
Substring
---------
xyz
xxyz
Substring
---------
abcabc
aabbcc
Not Substring
'''
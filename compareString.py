#Cpmaring String If 2 string is same return 0 ,if 1 string laxicographically greter than 2 string return 1 else return -1

def compareString(x,y):
    l=0
    m=0
    n=0
    if(len(x) == len(y)):
        for j in range(len(x)):
            if(x[j] == y[j]):
                l+=1
                #print("IFFF")
                #print(l)
                continue
            else:
                if(x[j]>y[j]):
                    return 1
                else:
                    return -1
        if((l) == len(x)):
            return 0
    else:
        if(len(x)>len(y)):
            for j in range(len(y)):
                if(x[j]==y[j]):
                    m+=1
                    continue
            if(m+1 == len(y)):
                return 1
        else:
            for j in range(len(x)):
                if(x[j]==y[j]):
                    n+=1
            if (n + 1 == len(y)):
                return -1

x=input()
y=input()
call=compareString(x,y)
if(call==0):
    print("Same")
else:
    if(call==1):
        print("1st string is greater than 2nd")
    else:
        print("2nd string is greater than 1st")


'''
Output:
abc
abc
Same
-----
abca
abcb
2nd string is greater than 1st
-----
abcb
abca
1st string is greater than 2nd

'''
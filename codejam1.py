import numpy
n=int(input())
case = []
for number in range(n):
    arr = []
    x = int(input())
    for mat in range(x):
        arr.append(list(map(int,input().rstrip().split())))
    arr2 = [[arr[j][i] for j in range(len(arr))] for i in range(len(arr[0]))]
    #arr2 = numpy.transpose(arr)
    print(arr)
    print(arr2)
    innercase = []
    col = 0
    row = 0
    trace = 0
    for mat in range(x):
        flagr = 0
        flagc = 0
        for mat2 in range(x):
            print(arr[mat][mat2])
            if( arr[mat].count(arr[mat][mat2])>1 and flagr==0):
                row += 1
                flagr = 1
            print(arr2[mat][mat2], "----", arr2[mat])
            print(arr2[mat].count(arr2[mat][mat2]))
            if(arr2[mat].count(arr2[mat][mat2])>1 and flagc==0):
                col += 1
                flagc = 1
            if(mat==mat2):
                trace += arr[mat][mat2]
    innercase.append(trace)
    innercase.append(row)
    innercase.append(col)
    case.append(innercase)
for in1 in range(x):
    print("Case #",in1+1,": ",case[in1][0]," ",case[in1][1]," ",case[in1][2])
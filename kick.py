t = int(input())
out = []
for i in range(t):
    n, k = list(map(int, input().split()))
    li = list(map(int, input().split()[:n]))
    li = li[::-1]
    var = 1
    count = 0
    for j in range(len(li)):
        if li[j] == var:
            var +=1
        elif li[j] == 1:
            var = 2
        else:
            var = 1
        if var == k:
            var = 1
            count += 1
    #print(count)
    out.append(count)

for x,y in enumerate(out):
    n = x+1
    print("Case #",n,": ", y)


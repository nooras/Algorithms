def main():
    # Write code here
    t = int(input())
    final = []
    for tt in range(t):
        n = int(input())
        G = list(map(int, input().strip().split()))
        O = list(map(int, input().strip().split()))
        G.sort()
        O.sort()
        temp = 0
        m = 0
        x = 0
        while x < n:
            if G[x] > O[m]:
                temp += 1
                x += 1
                m += 1
            else:
                x += 1
        final.append(temp)
    for x in final:
        print(x)

main()

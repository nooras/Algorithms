import string

def print_rangoli(size):
    # your code goes here

    alpha = string.ascii_lowercase

    L = []

    for i in range(size):
        s = "-".join(alpha[i:size])
        L.append(s[::-1]+s[1:])

    width = len(L[0])

    for i in range(size-1, 0, -1):
        print(L[i].center(width, "-"))

    for i in range(size):
        print(L[i].center(width, "-"))

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)

'''
5

--------e--------
------e-d-e------
----e-d-c-d-e----
--e-d-c-b-c-d-e--
e-d-c-b-a-b-c-d-e
--e-d-c-b-c-d-e--
----e-d-c-d-e----
------e-d-e------
--------e--------

'''

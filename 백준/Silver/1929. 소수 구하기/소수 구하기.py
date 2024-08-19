def search_primes(M, N):
    temp = [True] * (N + 1)
    temp[0] = temp[1] = False

    for i in range(2, int(N**0.5) + 1):
        if temp[i]:
            for j in range(i * i, N + 1, i):
                temp[j] = False

    for i in range(M, N + 1):
        if temp[i]:
            print(i)


M, N = map(int, input().split())
search_primes(M, N)
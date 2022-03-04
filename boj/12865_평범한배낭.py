def knap_sack(n, k, items):
    dp = [[0]*(k+1) for _ in range(n+1)]

    for i in range(1, n+1):
        for j in range(1, k+1):
            w = j - items[i-1][0]
            dp[i][j] = dp[i-1][j]
            if w >= 0:
                dp[i][j] = max(dp[i][j], dp[i-1][w]+items[i-1][1])

    print(dp)
    return max(map(max, dp))




# input
n, k = map(int, input().split())
items = []
for _ in range(n):
    a, b = map(int, input().split())
    items.append((a, b))

print(knap_sack(n, k, items))
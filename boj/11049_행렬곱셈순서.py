import sys

Input = sys.stdin.readline
n = int(Input())
matrix = [[0] for _ in range(n)]
dp = [[0] * n for _ in range(n)]

for i in range(n):
    matrix[i] = tuple(map(int, Input().split()))

for l in range(1, n):
    for i in range(n-l):
        j = i + l

        dp[i][j] = sys.maxsize + 1
        for k in range(i, j):
            dp[i][j] = min(dp[i][j], dp[i][k] + dp[k+1][j] + matrix[i][0] * matrix[k][1] * matrix[j][1])

print (dp[0][n-1])
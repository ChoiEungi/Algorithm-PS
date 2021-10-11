import sys
Input = sys.stdin.readline

n, m = map(int, Input().split())
space = [[0] * m for _ in range(n)]
dp = [[-1] * m for _ in range(n)]
dp[n-1][m-1] = 1

for i in range(n):
    j = 0
    for item in map(int, Input().split()):
        space[i][j] = item
        j += 1

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(space):
    stack = [(0,0)]
    while stack:
        x, y = stack.pop()
        if dp[x][y] == -1:
            dp[x][y] = 0
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue
                if space[nx][ny] < space[x][y]:
                    if dp[nx][ny] != -1:
                    stack.append((nx, ny))

    return dp[n-1][m-1]

print (dfs(space))
print (dp)

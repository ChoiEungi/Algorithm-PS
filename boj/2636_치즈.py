from collections import deque
import sys
Input = sys.stdin.readline

n, m = map(int, Input().split())

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
space = [[0] * m for _ in range(n)]
cheeses = []

for i in range(n):
    j = 0
    for item in map(int, Input().split()):
        space[i][j] = item
        j += 1


def bfs(space):
    q = deque([(0, 0)])
    visited = [[False] * m for _ in range(n)]
    ret = 0
    while len(q):
        x, y = q.popleft()
        visited[x][y] = True
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if space[nx][ny] == 1 and not visited[nx][ny]:
                ret += 1
                space[nx][ny] = 0
                visited[nx][ny] = True

            if not space[nx][ny] and not visited[nx][ny]:
                q.append((nx, ny))
                visited[nx][ny] = True

    return ret


last, cnt = 0, 0

while True:
    temp = bfs(space)
    if temp == 0:
        print (cnt)
        print (last)
        break
    last = temp
    cnt += 1
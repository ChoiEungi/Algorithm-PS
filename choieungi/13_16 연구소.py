import sys
from collections import deque
from itertools import combinations
import copy

Input = sys.stdin.readline

n, m = map(int, Input().split())
space = [list(map(int, Input().split())) for _ in range(n)]
blank = []

for i in range(n):
    for j in range(m):
        if space[i][j] == 0:
            blank.append((i, j))

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def bfs(space,a,b):
    q = deque([(a,b)])
    while len(q):
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and not space[nx][ny]:
                space[nx][ny] = 2
                q.append((nx,ny))


ans = 0
for walls in combinations(blank,3):
    new_space = copy.deepcopy(space)
    for x, y in walls:
        new_space[x][y] = 1

    for i in range(n):
        for j in range(m):
            if new_space[i][j] == 2:
                bfs(new_space, i, j)
    cnt = 0
    for i in range(n):
        for j in range(m):
            if not new_space[i][j]:
                cnt += 1
    ans = max(ans, cnt)
    # ans = max(ans, sum(list(map(lambda x: x.count(0), new_space))))

print(ans)

#print(list(map(lambda x: x.count(0), space)))
#print(reduce(lambda x, y: x + y , map(lambda x: x.count(0) , space)))
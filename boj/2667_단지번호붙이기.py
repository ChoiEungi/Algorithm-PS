from collections import deque

def bfs(start, graph):
    q = deque([start])
    ret = 1
    while len(q):
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >=n:
                continue
            if graph[nx][ny] == "1":
                q.append((nx, ny))
                graph[nx][ny] = "0"
                ret += 1
    
    return ret

n = int(input())

graph = [list(input()) for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

result = []

for i in range(n):
    for j in range(n):
        if graph[i][j] != "0":
            graph[i][j] = "0"
            result.append(bfs((i, j), graph))

result.sort()
print(len(result))
for i in result:
    print(i)

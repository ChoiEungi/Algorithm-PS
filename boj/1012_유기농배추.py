from collections import deque

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def bfs(start, graph, n, m):
    q = deque([start])
    while len(q):
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >=m:
                continue
            if graph[nx][ny]:
                q.append((nx, ny))
                graph[nx][ny] = 0
    

def solution():
    m, n, k = map(int, input().split())
    graph = [[0] * m for _ in range(n)]
    for _ in range(k):
        j, i = map(int, input().split())
        graph[i][j] = 1
    
    ret = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] != 0:
                graph[i][j] = 0
                bfs((i, j), graph, n, m)
                ret += 1
    return ret

t = int(input())
for _ in range(t):
    print(solution())

    


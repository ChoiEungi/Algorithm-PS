from collections import deque

def bfs(start,visited, graph):
    ret = 0

    q = deque([start])

    while len(q):
        v = q.popleft()
        for i in graph[v]:
            if not visited[i]:
                q.append(i)
                visited[i] = True

    return visited.count(True) - 1




n = int(input())
v = int(input())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
for _ in range(v):
    p, q  = map(int, input().split())
    graph[p].append(q)
    graph[q].append(p)

print(bfs(1, visited, graph))
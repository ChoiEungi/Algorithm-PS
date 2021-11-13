import sys
Input = sys.stdin.readline

n = int(input())
space =[]
for _ in range(n):
    space.append(int(Input()))

max_val =0
stack = []
for i in range(n):
    min_idx = i
    while stack and stack[-1][0] >= space[i]:
        h, min_idx = stack.pop()
        max_val = max(max_val, h * (i - min_idx))

    stack.append((space[i], min_idx))

for h, idx in stack:
    max_val = max(max_val, (n-idx)*h)

print(max_val)
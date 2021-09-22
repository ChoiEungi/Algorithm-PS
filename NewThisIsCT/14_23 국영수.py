import sys


n = int(input())
info = [sys.stdin.readline().split() for _ in range(n)]
info.sort(key=lambda x: (-int(x[1]), int(x[2]), -(int(x[3])), x[0]))

for student in info:
    print(student[0])
import sys

Input = sys.stdin.readline

n = int(Input())
meeting = []
for _ in range(n):
    meeting.append(tuple(map(int, Input().split())))

meeting.sort(key=lambda x: (x[1], x[0]))

end_time = meeting[0][1]
ret = 1
for i in range(1, n):
    if end_time <= meeting[i][0]:
        end_time = meeting[i][1]
        ret += 1

print (ret)
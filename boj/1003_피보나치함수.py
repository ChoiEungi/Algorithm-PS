def fibo(n):
    dp_zero = [0] * (n+1)
    dp_one = [0] * (n+1)

    for i in range(n+1):
        if i == 0:
            dp_zero[i] += 1
            continue
        if i == 1:
            dp_one[i] += 1
            continue
        dp_zero[i] = dp_zero[i-1] + dp_zero[i-2]
        dp_one[i] = dp_one[i-1] + dp_one[i-2]
    print(dp_zero[-1], dp_one[-1])
        
if __name__ == "__main__":
    test_case = int(input())
    for _ in range(test_case):
        n = int(input())
        fibo(n)


# return 0 and 1 number count
# dp: 0과 1을 호출한 횟수
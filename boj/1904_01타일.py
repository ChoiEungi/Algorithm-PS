def tile(n):
    dp = [0] * (n+1)
    for i in range(n+1):
        if i == 1:
            dp[i] = 1
        elif i == 2:
            dp[i] = 2
        else:
            dp[i] = (dp[i-1] + dp[i-2]) % 15746
    return dp[n] % 15746


n = int(input())
print(tile(n))
        
        
    
    
# 00, 1 tile로만 DP 

# N = 1 -> 1 
# N = 2 -> 00, 11
# N = 3 -> 001, 100, 111 
# N = 4 -> 0000, 0011 1001, 1100, 1111 -> 
# N = 5 -> 
# f(n) = f(n-1) + f(n-2)
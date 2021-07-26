import sys
import heapq

Input = sys.stdin.readline

n = int(Input())
cards = [0] * n  # O(n)

for i in range(n):
    cards[i] = int(Input())  # O(1)

heapq.heapify(cards)  # O(n)
ans = 0

while len(cards) != 1:
    a = heapq.heappop(cards)
    b = heapq.heappop(cards)
    card = a + b
    ans += card
    heapq.heappush(cards, card)

print(ans)

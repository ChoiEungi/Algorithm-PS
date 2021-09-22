def solution(words, queries):
    answer = []

    for query in queries:
        cnt = 0
        length = len(query)

        if query[0] == "?":
            for word in words:
                cnt += 1

                if length != len(word):
                    cnt -= 1
                    continue

                for i in range(length - 1, -1, -1):
                    if query[i] == "?":
                        break

                    if word[i] != query[i]:
                        cnt -= 1
                        break

        if query[-1] == "?":
            for word in words:
                cnt += 1

                if length != len(word):
                    cnt -= 1
                    continue

                for i in range(length):
                    if query[i] == "?":
                        break

                    if word[i] != query[i]:
                        cnt -= 1
                        break

        answer.append(cnt)

    return answer
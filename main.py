from bisect import bisect_left, bisect_right


def check_by_range(arr, left, right):
    right_idx = bisect_right(arr, right)
    left_idx = bisect_left(arr, left)
    return right_idx - left_idx


def solution(words, queries):
    answer = []

    arr = [[] for _ in range(10001)]
    reverse_arr = [[] for _ in range(10001)]

    for word in words:
        _len = len(word)
        arr[_len].append(word)
        reverse_arr[_len].append(word[::-1])

    for i in range(10001):
        arr[i].sort()
        reverse_arr[i].sort()

    for query in queries:
        ret = 0



        length = len(query)
        if query[0] == "?" and query[-1] == "?":
            answer.append(len(arr[length]))
            continue

        if query[-1] == "?":
            start_query = query.replace("?", "a")
            end_query = query.replace("?", "z")
            ret = check_by_range(arr[length], start_query, end_query)

        if query[0] == "?":
            start_query = query[::-1].replace("?", "a")
            end_query = query[::-1].replace("?", "z")
            ret = check_by_range(reverse_arr[length], start_query, end_query)

        answer.append(ret)

    return answer
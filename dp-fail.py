

def partition(start, end, arr):
    pivot_idx = start
    pivot = arr[start]
    left, right = start, end

    while left < right:

        while arr[left] <= pivot and left < end:
            left += 1

        while arr[right] > pivot:
            right -= 1

        if (left < right):
            arr[left], arr[right] = arr[right], arr[left]

    # else
    arr[right], arr[pivot_idx] = arr[pivot_idx], arr[right]
    return right

def quick_sort(start, end, arr):

    if start < end :

        pi = partition(start, end, arr)

        quick_sort(start, pi-1, arr)
        quick_sort(pi+1, end, arr)

arr = [4, 5, 10, 3 , 1, -1, 7, 14, 10]

quick_sort(0, len(arr)-1, arr)
print (arr)


def get_pivot(source_list, left, right):
    i = left
    j = right - 1
    pivot = source_list[right]
    while i < j:
        while source_list[i] < pivot and i < right:
            i += 1
        while source_list[j] > pivot and j > left:
            j -= 1
        if i < j:
            source_list[j], source_list[i] = source_list[i], source_list[j]
    
    if source_list[i] > pivot:
        source_list[i], source_list[right] = source_list[right], source_list[i]
    return i


def quick_sort(source_list, left, right):
    if left < right:
        pivot = get_pivot(source_list, left, right)
        quick_sort(source_list, left, pivot - 1)
        quick_sort(source_list, pivot + 1, right)
    

def main():
    test_data = [1, 6, 4, 10, 2, 4, -1, -100, 12]
    quick_sort(test_data, 0, len(test_data) - 1)
    print(test_data)


if __name__ == "__main__":
    main()


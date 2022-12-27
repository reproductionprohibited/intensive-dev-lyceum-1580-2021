def binary_search(source_list, target):
    left = 0
    right = len(source_list) - 1
    while left <= right:
        mid = (left + right) // 2
        if source_list[mid] == target:
            return mid
        elif source_list[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    raise Exception(f"No such value as {target} in the list")
    # alternative:
    # return None
    

def main():
    test_list = [1, 2, 3, 4, 6, 7, 8]
    # Бин поиск применим только в случае, если массив, в котором производится поиск, отсортирован
    target = 8

    print(f'The index of `{target}` in source list is: {binary_search(test_list, target)}')


if __name__ == "__main__":
    main()


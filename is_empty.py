def is_empty(entity):
    if type(entity) in [list, tuple, set, dict, str]:
        return len(entity) == 0
    return True


def main():
    test_values = [None, True, 1, [1, 2, 3], {'a' : 1}, '123', 123, '', 0]
    assert_values = [True, True, True, False, False, False, True, True, True]
    for test_value, assert_value in zip(test_values, assert_values):
        print(f'Expected: {assert_value}; Received: {is_empty(test_value)}')


if __name__ == "__main__":
    main()

def fuzzy_search(substring, string):
    current_substring_index = 0
    for letter in string:
        if substring[current_substring_index] == letter:
            current_substring_index += 1
            if current_substring_index == len(substring):
                return True
    return False


def main():
    test_values = [
        ('car', 'cartwheel'), 
        ('cwhl', 'cartwheel'), 
        ('cwhee', 'cartwheel'), 
        ('cartwheel', 'cartwheel'), 
        ('cwheeel', 'cartwheel'), 
        ('lw', 'cartwheel')
    ]
    assert_values = [True] * 4 + [False] * 2
    for test_value, assert_value in zip(test_values, assert_values):
        print(f'Expected: {assert_value}; Received: {fuzzy_search(test_value[0], test_value[1])}')


if __name__ == "__main__":
    main()

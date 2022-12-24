def is_palindrome(string):
    formatted_string = ''.join(filter(str.isalpha, string)).lower()
    length = len(formatted_string)
    for i in range(length):
        if formatted_string[i] != formatted_string[length - i - 1]:
            return False
    return True
    

def main():
    test_values = [
        'Казак',
        'А роза упала на лапу Азора', 
        'Do geese see God?', 
        'Madam, I’m Adam',
        'nonPalindromicString',
        'WhatIsThisTest'
    ]
    assert_values = [True, True, True, True, False, False]
    for test_val, assert_val in zip(test_values, assert_values):
        print(f'Expected: {assert_val}; Received: {is_palindrome(test_val)}')


if __name__ == "__main__":
    main()

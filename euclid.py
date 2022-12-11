def euclidForTwo(a, b):
    while b != 0:
        a, b = b, a % b
    return a


def euclid(*nums):
    for c in nums:
        if not(isinstance(c, int)) or (c <= 0):
            # print("[ERROR] Invalid Data")
            return -1
    gcd = -1
    a = nums[0]
    for i in range(1, len(nums)):
        b = nums[i]
        gcd = euclidForTwo(a, b)
        a = b
    return gcd


def main():
    # lst = [6, 10, 2, 25]  #  --> 1
    # lst = ['a', 'b', 5]   #  --> -1
    # lst = [2, 6, 10, 14]  #  --> 2
    lst = [5, 8, -8, 10]    #  --> -1
    print(euclid(*lst))


if __name__ == "__main__":
    main()

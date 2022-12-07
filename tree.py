def tree(n):
    if not (type(n) is int or type(n) is str):
        raise TypeError(f"{n} is not a number")
    else:
        try:
            n = int(n)
            if n < 3:
                return None

            tree = ''
            star_count, space_count = 1, n - 2
            for _ in range(n - 1):
                tree += (space_count * ' ' + star_count * '*') + '\n'
                space_count -= 1
                star_count += 2
            tree += (n - 2) * ' ' + '|'
            return tree
        except ValueError as e:  # Если строка не является числом ("12", "185")
            print("Illegal Parameter")
            return None


def main():
    n = "12"
    result = tree(n)
    print(result)


if __name__ == "__main__":
    main()

def namespace(string: str):
    obj = {}
    for key in string.split('.')[::-1]:
        obj = {key : obj}
    return obj


def main():
    string = "a.b.c.d.e"
    ans = namespace(string)
    print(ans)


if __name__ == "__main__":
    main()

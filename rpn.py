from string import digits


operations = ['+', '-', '*', '/']
allowed_symbols = digits + '+-/*'


def operation_result(a: int, b: int, sign: str):
    return eval(f"{a}{sign}{b}")


def is_valid(char):
    return char in allowed_symbols


def rpn_count(elements):
    elements = elements.split()
    st = []
    for it in elements:
        if not is_valid(it):
            return "Error in Operands"
        if it in operations:
            if len(st) < 2:
                return "Error in Syntax"
            a = st.pop()
            b = st.pop()
            st.append(operation_result(b, a, it))
        else:
            st.append(int(it))
    if len(st) == 1:
        return st.pop()
    return "Error in Syntax"


def main():
    print(rpn_count('7 2 * 3 +')) # 17
    print(rpn_count('7 2 3 * -')) # 1
    print(rpn_count('1 1 + +')) # Error in Syntax
    print(rpn_count('1 b + c -')) # Error in Operands


if __name__ == "__main__":
    main()

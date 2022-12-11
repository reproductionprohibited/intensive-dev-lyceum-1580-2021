def zip(*objects):
    result_object = {}
    for obj in objects:
        for key, value in obj.items():
            if key not in result_object:
                result_object[key] = value
    return result_object

def main():
    obj1 = {1: 2, 3: 5}
    obj2 = {1: 3, 4: 10}
    print(zip(obj1, obj2))


if __name__ == "__main__":
    main()

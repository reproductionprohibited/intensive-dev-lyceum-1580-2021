from random import choice


def shuffle(source_list):
    indices = list(range(len(source_list)))
    result_list = []
    for i in range(len(source_list)):
        random_index = choice(indices)
        indices.remove(random_index)
        result_list.append(source_list[random_index])
    return result_list


def main():
    list = [5, 1, 9, 8, 123, 1, 1]
    print(shuffle(list))


if __name__ == "__main__":
    main()

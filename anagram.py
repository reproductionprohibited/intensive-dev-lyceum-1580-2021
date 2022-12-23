def anagram(input):
    map = {}
    for it in input:
        sortedItem = "".join(sorted(list(it.lower())))
        if sortedItem not in map.keys():
            map.update({sortedItem: [it]})
            continue
        map[sortedItem].append(it)
    resultMap = {}
    for key, value in map.items():
        if len(value) >= 2:
            resultMap.update({key: sorted(map[key])})
    return resultMap.values()


def main():
    input = [
	    'кот', 'пила', 'барокко', 'апил',
	    'стоп', 'ток', 'кошка',
	    'липа', 'коробка', 'пост'
    ]
    result = list(anagram(input))
    print(result)


if __name__ == "__main__":
    main()

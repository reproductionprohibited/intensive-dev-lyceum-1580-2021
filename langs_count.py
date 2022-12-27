def langs_count(object_list):
    language_set = set()
    result_list = []
    for object in object_list:
        if object['language'] not in language_set:
            language_set.add(object['language'])
            new_object = {
                'language': object['language'],
                'count': 1
            }
            result_list.append(new_object)
        else:
            for count_object in result_list:
                if count_object['language'] == object['language']:
                    count_object['count'] += 1
                    break
    return result_list
    

def main():
    test_list = [
        { 'language': 'JavaScript' },
        { 'language': 'JavaScript' },
        { 'language': 'TypeScript' },
		    { 'language': 'C++' },
        { 'language': 'Python'}
    ]
    result = langs_count(test_list)
    print(result)


if __name__ == "__main__":
    main()


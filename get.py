def get(src_object, path):
    for item in path.split('.'):
        if item in src_object:
            src_object = src_object[item]
            continue
        return None
    return src_object


def main():
    src_object = {
        'foo': 'bar',
        'deep': {
            'nested': {
                'field': 'baz'
            }
        }
    }
    """
    TESTING
    
    print(get(src_object, 'deep.nested.field')) -> baz
    print(get(src_object, 'foo')) -> bar
    print(get(src_object, 'deep')) -> {'nested': {'field': 'baz'}}
    print(get(src_object, 'nonexisting')) -> None
    print(get(src_object, 'foo.nonexisting')) -> None
    """
    

if __name__ == "__main__":
    main()

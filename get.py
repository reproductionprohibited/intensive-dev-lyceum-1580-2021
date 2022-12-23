def get(srcObject, path):
    for item in path.split('.'):
        if item in srcObject:
            srcObject = srcObject[item]
            continue
        return None
    return srcObject


def main():
    srcObject = {
        'foo': 'bar',
        'deep': {
            'nested': {
                'field': 'baz'
            }
        }
    }
    """
    TESTING
    
    print(get(srcObject, 'deep.nested.field')) -> baz
    print(get(srcObject, 'foo')) -> bar
    print(get(srcObject, 'deep')) -> {'nested': {'field': 'baz'}}
    print(get(srcObject, 'nonexisting')) -> None
    print(get(srcObject, 'foo.nonexisting')) -> None
    """
    

if __name__ == "__main__":
    main()

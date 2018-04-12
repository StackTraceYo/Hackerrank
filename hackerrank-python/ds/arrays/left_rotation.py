def rotate(a, d):
    for _ in range(0, d):
        pop = a.pop(0)
        a.append(pop)
    return a


if __name__ == '__main__':
    nd = input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))
    print(' '.join(map(str,rotate(a, d))))

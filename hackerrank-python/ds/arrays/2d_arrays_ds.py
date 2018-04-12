#
# Complete the array2D function below.
#
def array2D(arr):
    #
    # Write your code here.
    #
    size = len(arr) - 1
    max = -9 * 9
    for i in range(0, size):  # for each row
        for j in range(0, size):
            if j + 2 > size or i + 2 > size:
                break
            m = sum([arr[i][j], arr[i][j + 1], arr[i][j + 2],
                     arr[i + 1][j + 1],
                     arr[i + 2][j], arr[i + 2][j + 1], arr[i + 2][j + 2]]
                    )
            if m > max:
                max = m
    return max


if __name__ == '__main__':

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = array2D(arr)

    print(str(result) + '\n')

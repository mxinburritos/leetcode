def searchMatrix(matrix,target):
    for i in range(len(matrix)):
        if target in matrix[i]:
            return True

matrix = [
  [1],
  [3]
]

print(searchMatrix(matrix,3))

def shiftGrid(grid, k):
    for rep in range(k):
        ans = [[0]*len(grid[0]) for i in range(len(grid))]
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if i == len(grid)-1 and j == len(grid[0])-1:
                    ans[0][0] = grid[i][j]
                elif j == len(grid[0])-1:
                    ans[i+1][0] = grid[i][j]
                else:
                    ans[i][j+1] = grid[i][j]
        grid = ans
    return grid

print(shiftGrid([[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4))

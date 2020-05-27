def allCellsDistOrder(R, C, r0, c0):
    coordinates = []
    for i in range(R):
        for j in range(C):
            pair = (abs(i-r0)+abs(j-c0),[i,j])
            print(pair)
            coordinates.append(pair);
    coordinates = sorted(coordinates, key=lambda coordinate: coordinate[0])
    ans = []
    for coordinate in coordinates:
        ans.append(coordinate[1])
    return ans


print(allCellsDistOrder(2,3,1,2))


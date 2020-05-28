def openOrSenior(data):
    ans = []
    for datum in data:
        if datum[0] >= 55 and datum[1] > 7:
            ans.append("Senior")
        else:
            ans.append("Open")
    return ans


print(openOrSenior([[45, 12],[55,21],[19, -2],[104, 20]]))
print(openOrSenior([[16, 23],[73,1],[56, 20],[1, -1]]))

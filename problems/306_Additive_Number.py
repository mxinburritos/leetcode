def isAdditiveNumber(num):
    for i in range(0,len(num)-2):
        if(int(num[i])+int(num[i+1])!=int(num[i+2])):
            print(num[i],num[i+1],num[i+2])
            return False
    return True

print(isAdditiveNumber("112358"))

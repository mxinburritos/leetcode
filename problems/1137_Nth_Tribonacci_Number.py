exists = [False for i in range(40)]
entries = [0 for i in range(40)]
def tribonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    if n == 2:
        return 1
    else:
        if self.exists[n] == True:
            return self.entries[n]
        else:
            self.exists[n] = True
            ans = self.tribonacci(n-1) + self.tribonacci(n-2) + self.tribonacci(n-3)
            self.entries[n] = ans
            print(self.entries)
            return ans

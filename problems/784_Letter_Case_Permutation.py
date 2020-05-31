def letterCasePermutation(S):
    res = []
    backtrack(S,0,res)
    return res


def backtrack(s, i, res):
    if i == len(s):
        res.append(s)
        return
    backtrack(s, i+1, res)
    if s[i].isalpha():
        s = list(s)
        s[i] = s[i].swapcase()
        s = "".join(s)
        backtrack(s,i+1,res)

print(letterCasePermutation("a1b2"))

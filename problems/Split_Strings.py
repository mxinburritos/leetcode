def solution(s):
    ans = []
    for i in range(0,len(s),2):
        ans.append(s[i:i+2])
    if len(s) % 2 == 1:
        ans[len(ans)-1] = ans[len(ans)-1] + "_"
    return ans

print(solution("asdff"))

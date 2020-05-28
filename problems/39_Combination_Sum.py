def combinationSum(candidates, target):
    ans = []
    if(target == 0):
        return [[]]
    if(all(i>target for i in candidates)):
        return []
    else:
        for i, candidate in enumerate(candidates):
            results = combinationSum(candidates, target-candidate)
            for result in results:
                if result != None:
                    new = ([candidate]+result)
                    new.sort()
                    if new not in ans:
                        ans.append(new)
    return ans
        
print(combinationSum([1,2,3,4],8))
        

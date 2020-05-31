def permute(nums):
    res = []
    if len(nums) == 1:
        return [[nums[0]]]
    else:
        for i in nums:
            copy = nums.copy()
            copy.remove(i)
            permuted = permute(copy)
            for new in permuted:
                new.insert(0,i)
                res.append(new)
        return res

print(permute([1,2,3,4]))

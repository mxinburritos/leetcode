def toGoatLatin(S):
    ans = ""
    vowels = ['a','e','i','o','u']
    for i,word in enumerate(S.split(" ")):
        if word[0] in vowels:
            ans += word + "ma" + ("a"*(i+1)) + " "
        else:
            ans += word[1:] + word[0] + "ma" + ("a"*(i+1)) + " "
    return ans

print(toGoatLatin("I speak Goat Latin"))




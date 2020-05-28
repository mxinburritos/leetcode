def alphabet_position(text):
    ans = ""
    for letter in text.lower():
        if letter.isalpha():
            ans += str(ord(letter)-96) + " "
    return ans.strip()

print(alphabet_position("The sunset sets at twelve o' clock."))

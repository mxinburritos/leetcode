def firstNonRepeatingCharacter(string):
    freq = {}
    for letter in string:
        if letter not in freq:
            freq[letter] = 0
        freq[letter] += 1
    for letter, app in freq.items():
        if app == 1:
            return letter

print(firstNonRepeatingCharacter(""))


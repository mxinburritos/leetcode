#!/usr/bin/env python
# -*- coding: utf-8 -*-

def arrangeWords(text):
    ans = [];
    for word in text.split(" "):
        ans.append(word.lower())
    ans.sort(key=len)
    ans[0] = ans[0].capitalize()
    ansStr = ""
    for word in ans:
        ansStr = ansStr + word + " "
    return ansStr.strip()

print(arrangeWords("Leetcode is cool"))

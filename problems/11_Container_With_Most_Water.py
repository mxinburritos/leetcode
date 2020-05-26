#!/usr/bin/env python
# -*- coding: utf-8 -*-

def maxArea(height):
    maxInt = 0
    for i in range(0,len(height)//2):
        for j in range(i+1,len(height)):
            area = abs(i-j)*min(height[i],height[j]);
            if area > maxInt:
                maxInt = area
    return maxInt

containers = [1,8,6,2,5,4,8,3,7]
print(maxArea(containers))

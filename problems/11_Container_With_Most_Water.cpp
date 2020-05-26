#include <bits/stdc++.h>

using namespace std;

int maxArea(vector<int>& height) {
  int water = INT_MIN;
  int i = 0, j = height.size()-1;
  while(i<j) {
    water = max(water, (j-i)*min(height[i],height[j]));
    if(height[i]<height[j]) {
      i++;
    } else {
      j--;
    }
  }
  return water;
}

int main() {
  vector<int> heights;
  heights.push_back(1);
  heights.push_back(2);
  heights.push_back(8);
  heights.push_back(7);
  cout << maxArea(heights);
  
}

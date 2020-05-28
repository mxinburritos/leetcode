#include <bits/stdc++.h>

using namespace std;

int searchInsert(vector<int>& nums, int target) {
  for(int i=0; i<(int)nums.size(); i++) {
    if(nums[i]==target||nums[i]>target) {
      return i;
    }
  }
  return nums.size();
}

int main() {
  vector<int> test = {1,3,5,6};
  cout << searchInsert(test,5) << "\n"; 
  cout << searchInsert(test,2) << "\n"; 
  cout << searchInsert(test,7) << "\n"; 
  cout << searchInsert(test,0) << "\n"; 
}

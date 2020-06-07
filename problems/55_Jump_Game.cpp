#include <bits/stdc++.h>
using namespace std;

bool canJump(vector<int>& nums) {
  vector<bool> poss(nums.size(), false);
  poss[0] = true;
  for(int i=0; i<nums.size()-1; i++) {
    if(poss[i] && !poss[i+nums[i]]) {
      for(int j=1; j<=nums[i]; j++) {
        poss[i+j] = true;
      }
    }
  }
  return poss[nums.size()-1];
}

int main() {
  vector<int> nums = {2,5,0,0};
  cout << canJump(nums);

}

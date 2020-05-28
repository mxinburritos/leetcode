#include <bits/stdc++.h>

using namespace std;

vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
  vector<vector<int>> ans;
  for(int b=0; b<(1<<candidates.size()); b++) {
    vector<int> subset;
    for(int i=0; i<(int)candidates.size(); i++) {
      if(b&(1<<i)) {
        subset.push_back(i);
      }
    }
    sort(subset.begin(), subset.end());
    cout << find(ans.begin(),ans.end(), subset) != ans.end()&&accumulate(subset.begin(),subset.end(),0)!=target;
    if(find(ans.begin(),ans.end(), subset) != ans.end()&&accumulate(subset.begin(),subset.end(),0)!=target){
      ans.push_back(subset);
    }
  }
  return ans;
}

int main() {
  vector<int> test = {2,3,6,7};
  vector<vector<int>> ans = combinationSum(test,7);
  for(auto sub : ans) {
    for(auto num : sub) {
      cout << num << " ";
    }
    cout << "\n";
  }
  return 0;
}

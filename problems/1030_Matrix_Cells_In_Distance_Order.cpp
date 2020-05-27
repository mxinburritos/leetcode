#include <bits/stdc++.h>

using namespace std;

vector< vector<int> > allCellsDistOrder(int R, int C, int r0, int c0) {
  set< pair <int, vector<int> > > coordinates;
  pair< int, vector<int> > pairing;
  vector<int> coordinate;
  for(int i=0; i<R; i++) {
    for(int j=0; j<C; j++) {
      coordinate.clear();
      coordinate.push_back(i);
      coordinate.push_back(j);
      pairing = make_pair(abs(i-r0)+abs(j-c0),coordinate);
      coordinates.insert(pairing);
    }
  }
  vector< vector<int> > ans;
  for(auto pair : coordinates) {
    ans.push_back(pair.second);
  }
  return ans;
}

int main() {
  vector< vector<int> > list = allCellsDistOrder(2,3,1,3);
  for(auto item : list) {
    for(auto num : item) {
      cout << num << " ";
      
    }
  }
}

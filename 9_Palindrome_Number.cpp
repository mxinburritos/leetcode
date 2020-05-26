#include <bits/stdc++.h>

using namespace std;

bool isPalindrome(int x) {
  string numString = to_string(x);
  for (int i=0; i<numString.size(); i++) {
    if(numString[i] != numString[numString.size()-1-i]) {
      return false;
    }
  }
  return true;
}

int main() {
  cout << isPalindrome(1234321);
}

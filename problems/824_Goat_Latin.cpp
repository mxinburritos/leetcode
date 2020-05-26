#include <bits/stdc++.h>

using namespace std;

string toGoatLatin(string S) {
  stringstream ss(S);
  string word;
  string ans;
  vector<string>vowels = {"a","e","i","o","u"};
  string a = "a";
  int i;
  while(ss>>word) {
    string fl(1,word[0]);
    if (find(vowels.begin(), vowels.end(), fl) != vowels.end()) {
      size_t ti = i;
      string aa = a * ti;
      ans += word + "ma" + aa + " ";
    } else {
      ans += word.substr(1,word.size()) + word[0] + "ma" + aa + " ";
    }
    i++;
  }
  ans.pop_back();
  return ans;
}

int main() {
  cout << toGoatLatin("I speak Goat Latin");
}

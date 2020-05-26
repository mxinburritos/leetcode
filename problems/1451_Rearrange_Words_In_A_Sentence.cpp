#include <bits/stdc++.h>

using namespace std;

string arrangeWords(string text) {
  text[0] = tolower(text[0]);
  stringstream ss(text), rs;
  string word;
  map<int, string> m;
  while(ss>>word) m[word.size()] += word + " ";

  for(const auto& pair : m) rs<<pair.second;
  string result = rs.str();
  result.pop_back();
  result[0] = toupper(result[0]);
  return result;
}

int main() {
  cout << "test" << "\n";
  cout << arrangeWords("This is a test"); 
}

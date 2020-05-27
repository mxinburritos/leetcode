#include <bits.stdc++.h>

using namespace std;
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
  ListNode head = new ListNode(0);
  ListNode $headCopy = &head;
  while(l1!=NULL && l2!=NULL) {
    if(l1->val<l2->val) {
      headCopy->next = l1;
      l1=l1->next;
    }
    else {
      headCopy->next = l2;
      l2=l2->next;
    }
    headCopy=headCopy->next;
  }
  headCopy->next = l1 ? l1 : l2;
  return headCopy;

}

int main() {

}

def addTwoNumbers(l1,l2):
    head = ListNode()
    tempHead = head
    while l1!=None or l2!=None:
        if l1==None:
            head.val+=l2.val
            l2 = l2.next
        elif l2==None:
            head.val+=l1.val
            l1 = l1.next
        else:
            print(head.val)
            head.val += (l1.val+l2.val)
            print(head.val)
            l1 = l1.next
            l2 = l2.next
        elif l1!=None or l2!=None:
            head.next = ListNode()
        if head.val >= 10:
            head.val = head.val % 10
            head.next = ListNode(1)
        head = head.next
    return tempHead

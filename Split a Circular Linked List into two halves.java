class gfg
{
    void splitList(circular_LinkedList list)
    {
        Node head = list.head;
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=head && fast.next.next!=head)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node mid = slow;
        
        Node last = mid.next;
        
        while(last.next!=head)
        {
            last = last.next;
        }
        
        list.head2 = mid.next;
        list.head1 = head;
        last.next = mid.next;
        mid.next = head;
	}
}

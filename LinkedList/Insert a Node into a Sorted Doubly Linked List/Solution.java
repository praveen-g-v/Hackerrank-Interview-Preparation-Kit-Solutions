

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode start=head,prev=head;
        while(start!=null){
            if(start.data>data){
                DoublyLinkedListNode newNode=new DoublyLinkedListNode(data);
                if(start.prev==null){
                    newNode.prev=null;
                    start.prev=newNode;
                    newNode.next=start;
                    head=newNode;
                }
                else{
                    prev.next=newNode;
                    newNode.prev=prev;
                    start.prev=newNode;
                    newNode.next=start;
                }
                break;
            }
            else if(start.next==null){
                DoublyLinkedListNode newNode=new DoublyLinkedListNode(data);
                start.next=newNode;
                newNode.prev=start;
                break;
            }
            if(start==prev){
                start=start.next;
            }
            else{
            start=start.next;
            prev=prev.next;
            }
        }
        
        return head;
    }


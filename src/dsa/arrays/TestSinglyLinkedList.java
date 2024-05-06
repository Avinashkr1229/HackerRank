package dsa.arrays;

public class TestSinglyLinkedList{

    //method to reverse the List
    public static SinglyLinkedListTest reverse(SinglyLinkedListTest head){
        SinglyLinkedListTest prev= null;
        SinglyLinkedListTest cur = head;
        SinglyLinkedListTest next = null;

        while (cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head = prev;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListTest list = new SinglyLinkedListTest(1);
        list.next = new SinglyLinkedListTest(4);
        list.next.next = new SinglyLinkedListTest(5);
        list.next.next.next = new SinglyLinkedListTest(7);

        SinglyLinkedListTest current = list;
        while (current!=null){
            System.out.println(current.res);
            current = current.next;
        }

        //after the reversal

        list = reverse(list);

        current = list;
        while (current!=null){
            System.out.println(current.res);
            current = current.next;
        }
    }


}

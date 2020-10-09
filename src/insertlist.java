import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// linked list
class Node
{
    int data;
    Node next;

}

class insertlist
{
    // insert at tail
    Node head;
    public void insert_element(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insert_element_at_head(int data){
        Node n1 = head;
        Node n2 = n1.next;
        n1.next = null;

        head = n2;
        Node n = head;
        while(n.next != null){
            n  = n.next;
        }
        n.next = n1;
    }

    public void display_linked_list()
    {
        Node n = head;
        if(n == null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            //Node n = head;
            while(n != null)
            {
                System.out.print(n.data+"->");
                n = n.next;
            }
            System.out.print("NULL");
        }
    }

    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        //node.next = null;

        node.next = head;
        head = node;
    }

    public void reverse()
    {
        System.out.println("make reverse() linked list");
        Node curr = head;
        Node prev = null;
        Node nextnode = head;

        if(curr == null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            while(curr != null)
            {
                nextnode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextnode;
            }
            head = prev;
        }
    }
    public void delete_dupli()
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            Node n = head;
            while(n != null)
            {

                Node comp = n.next;
                Node prev = n;
                while(comp != null)
                {

                    if(n.data == comp.data)
                    {
                        prev.next = comp.next;
                        comp=null;
                        comp =prev.next;
                    }
                    else
                    {
                        prev =comp;
                        comp=comp.next;
                    }

                }
                n=n.next;
            }
        }
    }



    public void deleteAtPosition(int position)
    {
        Node n = head;
        Node prev = null;
        int count = 0;
        while(n != null)
        {
            if(position == 0) {
                //n = n.next;
                //head = n;
                head.data = head.next.data;
                head.next = head.next.next;
                break;
            } else if(position == count && position != 0) {
                prev.next = n.next;
                break;
            } else {
                prev = n;
                count++;
                n = n.next;
            }
        }
    }

    public void insertAtKey(int key,int data)
    {
        //int count;
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        if(n == null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            int count=0;
            Node prev = head;
            while(n != null)
            {

                if(count == key)
                {
                    if(count == 0)
                    {
                        node.next = head;
                        head = node;
                        break;
                    }
                    else
                    {
                        node.next = n;
                        prev.next = node;
                        //node = n.next;
                    }

                }
                count++;
                prev = n;
                n = n.next;
            }
        }

    }

    public void del_element()
    {
        Node n = head;
        if(n == null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            //Node n = head;
            Node prev_node = head;
            while(n.next != null)
            {
                prev_node = n;
                n = n.next;
            }

            //Node last = n;
            prev_node.next = null;
            //last = prev_node;
            //last.next = null;

        }
    }
    public int size()
    {
        int count=0;
        Node n = head;
        while(n!=null)
        {
            count++;
            n = n.next;
        }
        return count;
    }

    public void sort(Node n)
    {
        Node compare = n.next;
        while(compare != null)
        {
            if(n.data > compare.data)
            {
                int temp = n.data;
                n.data = compare.data;
                compare.data = temp;
            }
            compare = compare.next;
        }
    }

//    public void sortmain()
//    {
//        swap ob1 = new swap();
//        Node n = head;
//        while(n != null)
//        {
//            ob1.sort(n);
//            n=n.next;
//        }
//    }
	/*
	public void swap(Node n,Node swapnode)
	{
		int temp = n.data;
		n.data = swapnode.data;
		swapnode.data = temp;
	}

	public void swapmain()
	{
		swap ob1 = new swap();

		Node n = head;
		Node swapnode = n.next;
		while( (n!= null) && (swapnode != null) )
		{
			ob1.swap(n,swapnode);
			n=swapnode.next;
			swapnode = swapnode.next.next;
		}
	}
	*/
    public void searchElement(int a) {
        Node n = head;
        Node prev = head;

        List<Integer> decreaseList = new ArrayList<>();

        List<Integer> increaseList = new ArrayList<>();


        int count =0;
        while(n!=null) {

            if(n.data == a) {
                System.out.println(a +" found at position "+count);
                n = n.next;
                //break;
            } else if(n.data < a) {
                decreaseList.add(n.data);
                deleteAtPosition(count);
                continue;
            } else if(n.data > a) {
                increaseList.add(n.data);
                deleteAtPosition(count);
                continue;
            }
            count++;
            prev = n;

        }
    }
    public void swaptwopairs()
    {
        Node n = head;
        insertlist ob = new insertlist();
        int size = ob.size();

        Node prev = head;

        int temp = 0;
        while(n!= null)
        {
            prev = n.next;
            temp = prev.data;
            prev.data = n.data;
            n.data = temp;

            n = n.next.next;
            prev = prev.next.next.next;

        }

    }

    public void oddEvenNodes() {
        Node n = head;
        int size=1;
        while(n.next != null) {
            n = n.next;
            size++;
        }

        Node tailNode = n;



        Node n2 = head;
        Node prev = null;
        int count = 1;



        while(n2 != null) {
                if(count <= size){
                if (count % 2 == 0) {
                    Node tempNode = n2;

                    Node nextNode = n2.next;

                    prev.next = n2.next;

                    tailNode.next = tempNode;
                    tempNode.next = null;

                    tailNode = tempNode;

                    n2 = nextNode;
                    prev = nextNode;

                } else {
                    prev = n2;
                    n2 = n2.next;
                }

                count++;
                } else {
                    break;
                }

        }
    }

    public void checkSwap() {
        Node n = head;
        Node n2 = head;
        int len =0;
        while(n2!=null) {
            len++;
            n2=n2.next;
        }
        System.out.println("len ="+len);
        int temp = n.data;
        n.data = n.next.data;
        n.next.data = temp;


    }
    public void combineElements() {
        Node n = head;
        int a =0;
        while(n != null) {
            System.out.println("n.data = "+n.data);
            System.out.println("a = "+(a*10));
            a = (a*10) + n.data;
            System.out.println(a);
            n = n.next;
        }


        System.out.println("a = "+a);
    }


    public void reverseTwo(){
        Node n = head;

        int m = 2;
        int k = 4;
        Node prev = n;
        while(n!= null){
            if(n.data == m){
                Node n2 = n;
                Node prev1 = prev;
                while(n2.data != k) {
                    System.out.println("loop - prev1 = "+prev1.data);
                    System.out.println("loop - n2 = "+n2.data);

                    prev1 = n2;
                    n2 = n2.next;
                }
                System.out.println("loop - prev1 = "+prev1.data);
                System.out.println("loop - n2 = "+n2.data);
                n = n2;
            }
            else{
                System.out.println("prev = "+prev.data);
                System.out.println("n = "+n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    public void smallerElementList(){
        int k =3;
        List<Integer> a = new ArrayList<>();
        Node n = head;
        while(n != null){
            if(n.data > k){
                a.add(n.data);
            }
            n = n.next;
        }

        for(int i:a){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        insertlist obj = new insertlist();
        // 3 0 5 2 1 4
        obj.insert_element(3);
        obj.insert_element(0);
        obj.insert_element(5);
        obj.insert_element(2);
        obj.insert_element(1);
        obj.insert_element(4);

        //obj.display_linked_list();

        //System.out.println();
        System.out.println("size = "+obj.size());


        //obj.reverseTwo();
        obj.display_linked_list();

        System.out.println();
        //obj.insert_element_at_head(99);
        //obj.display_linked_list();
        obj.smallerElementList();
    }
}

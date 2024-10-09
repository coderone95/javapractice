import java.util.*;

public class ConvertArrayToLinkedList{


public static void main(String[] args){
System.out.println("Enter array len : ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int[] arr = new int[n];
for(int i = 0 ; i < n; i++){
arr[i] = sc.nextInt();
}

System.out.println("Your Array :: ");
for(int i = 0 ; i < n; i++){
System.out.print(" "+arr[i]);
}

//LinkedList
convertToLL(arr);

}

private static void convertToLL(int[] arr){
if(arr.length == 0){
return;
}
Node headNode = new Node(arr[0]);
Node mover = headNode;
for(int i = 1; i < arr.length; i++){

Node tempNode = new Node(arr[i]);
mover.next = tempNode;
mover = mover.next;
}

System.out.println("LinkedList Nodes : ");
while(headNode.next != null){
System.out.print(" " + headNode.value);
headNode = headNode.next;
}
System.out.print(" " + headNode.value);


}

}

class Node{
int value;
Node next;

public Node(int value){
this.value = value;
this.next = null;
}

public Node(int value, Node next){
this.value = value;
this.next = next;
}


}

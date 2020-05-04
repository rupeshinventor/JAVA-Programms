class Node
{
	int data;
	Node next;
	Node(int data)
	{
		data=data;
	}
	public static void main(String...ru)
	{
		Node nodeA=new Node(6);
		Node nodeB = new Node(7);
		nodeA.next=nodeB;
		System.out.println(nodeB);

	}
}
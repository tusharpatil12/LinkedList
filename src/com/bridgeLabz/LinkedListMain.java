package com.bridgeLabz;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("welcome to Linked List");
		System.out.println("creat Linked List of 56,30,70s");

		System.out.println("\norder LinkedList 56->30->70");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        list1.push(30);
        list1.print();

        System.out.println("\nLinkedList in appending  56<-30<-70");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.push(56);
        list2.push(30);
        list2.push(70);
        list2.print();

	}

}

package com.metacube.AlgorithmDesignAss1;

import org.junit.*;

public class LinkedlistTest {

	@Test(expected = AssertionError.class)
	public void EmptyList() {
		linkedList l1 = new linkedList();
		l1.printList(l1.head);
	}

	@Test
	public void Middletest() {
		linkedList l1 = new linkedList();
		l1.push(15000, 20);
		l1.push(20000, 23);
		l1.push(12000, 21);
		l1.head = l1.mergeSort(l1.head);
		l1.head = l1.reverse(l1.head);
		Assert.assertEquals(15000, linkedList.getMiddle(l1.head).sal);
		Assert.assertEquals(20, linkedList.getMiddle(l1.head).age);
	}

	@Test
	public void Sorttest() {
		linkedList l1 = new linkedList();
		l1.push(15000, 26);
		l1.push(14500, 24);
		l1.push(12000, 20);
		l1.push(20000, 24);
		l1.push(12000, 22);
		l1.push(22000, 22);
		l1.head = l1.mergeSort(l1.head);
		l1.head = l1.reverse(l1.head);
		Assert.assertEquals(22000, l1.head.sal);
	}

	@Test
	public void Sortest1() {
		linkedList l1 = new linkedList();
		l1.push(15000, 26);
		l1.push(14500, 24);
		l1.push(12000, 20);
		l1.push(20000, 24);
		l1.push(12000, 22);
		l1.push(22000, 22);
		l1.head = l1.mergeSort(l1.head);
		l1.head = l1.reverse(l1.head);
		Assert.assertFalse(15000 == l1.head.sal);
	}
	
	@Test
	public void Sortest2() {
		linkedList l1 = new linkedList();
		l1.push(15000, 26);
		l1.push(14500, 24);
		l1.push(12000, 20);
		l1.push(20000, 24);
		l1.push(12000, 22);
		l1.push(22000, 22);
		l1.head = l1.mergeSort(l1.head);
		l1.head = l1.reverse(l1.head);
		Assert.assertTrue(22 == l1.head.age);
	}
}

package com;

public class Test {
public static void main(String[] args) {
//	Normal Object Creation! , and Accessing Method
	Tom t = new Tom();
	t.Work();
//	+++++++--++++++++
//	Providing Upcasting
	person p=new Tom();
	p.Work();
}
}

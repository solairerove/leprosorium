package com.github.solairerove.leprosorium.old.generic.simple;

public class TwoGen<T, V> {

	T ob1;
	V ob2;

	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	void showTypes() {
		System.out.println("Type of T is " + ob1.getClass().getName());

		System.out.println("Type of V is " + ob2.getClass().getName());
	}

	T getob1() {
		return this.ob1;
	}

	V getob2() {
		return this.ob2;
	}
}
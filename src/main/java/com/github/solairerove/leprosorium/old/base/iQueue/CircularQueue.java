package com.github.solairerove.leprosorium.old.base.iQueue;

class CircularQueue implements Charable {
	private char q[];
	private int putloc, getloc;

	public CircularQueue(int size) {
		q = new char[size + 1];
		putloc = getloc = 0;
	}

	//
	public void put(char ch) {
		if (putloc + 1 == getloc | (putloc == q.length - 1) & (getloc == 0)) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;

		if (putloc == q.length)
			putloc = 0;
		q[putloc] = ch;
	}

	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is emplty.");
			return (char) 0;
		}

		getloc++;

		if (getloc == q.length)
			getloc = 0;
		return q[getloc];
	}
}
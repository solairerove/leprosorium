// Реализация очереди фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
	private char q[];
	private int putloc, getloc;
	
	// создать пустую очередь заданного размера
	public FixedQueue(int size) {
		
		// выделить память для очереди
		q = new char[size+1];
		
		putloc = getloc = 0;
	}
	
	// поместить символ в очередь
	public void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	// извлечь символ из очереди
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

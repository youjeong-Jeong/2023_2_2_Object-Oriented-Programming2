import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class myVector {
	
	public static void printAll(Vector<Integer> v) {
		System.out.println("----------개수: " +v.size());
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
	}
	//위 함수와 아래 함수 서로 구현 하는 법 알아야 함
	public static void printAllIterator(Vector<Integer> v) {
		System.out.println("----------개수: " +v.size());
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.print(n + " ");
		}
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(200);
		
		System.out.println("컨테이너 크기: " +v.capacity());
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<11;i++) {
			int n = scanner.nextInt();
			v.add(n); // -> v.add(Integer.valueOf(n)); : 자동 박싱 코드로 바꿔봐라
		}
		
		System.out.println("컨테이너 크기: " +v.capacity());
		System.out.println("개수: " +v.size());
		
		printAllIterator(v);
		
		Integer obj = v.get(1);
		Integer obj2 = v.remove(1);
		v.add(obj2);
		
		printAllIterator(v);
		
		v.removeAllElements();
		printAllIterator(v);
	}

}

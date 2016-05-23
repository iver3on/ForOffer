package net.getOffer;


//调整数组 使得奇数位于偶数前面
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		reorderOddEven(a);
		print(a);
	}

	private static void reorderOddEven(int[] a) {
		int length = a.length;
		if(length==0) return;
		int begin = 0;
		int end = length - 1;
		while(begin<end){
			//向后移动begin指针 ，直到它指向偶数
			while(begin<end&&(a[begin]%2!=0)){
				begin++;
			}
			//向前移动end指针，直到它指向奇数
			while(begin<end&&(a[end]%2==0)){
				end--;
			}
			if(begin<end){
				int temp = a[begin];
				a[begin] = a[end];
				a[end] = temp;
				
			}
		}
		
	}
	public static void print(int[] a){
		for(int x:a)System.out.print(x+" ");
	}
	
}

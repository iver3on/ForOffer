package net.getOffer;


//�������� ʹ������λ��ż��ǰ��
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
			//����ƶ�beginָ�� ��ֱ����ָ��ż��
			while(begin<end&&(a[begin]%2!=0)){
				begin++;
			}
			//��ǰ�ƶ�endָ�룬ֱ����ָ������
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

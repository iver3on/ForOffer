package net.getOffer;

public class Test3 {

	
	//�������εĶ����Ʊ�ʾ�� 1�ĸ��� 11��1011 �򷵻�3  ������λ��˼��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 11;
		System.out.println(getNumber1(x));
		int y = 8;
		System.out.println(isA(y));
	}
	public static int getNumber(int n){
		int count = 0;
		int flag = 1;
		while(flag!=0){
			if((n & flag)!=0){
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}
	
	//��һ��������ȥ1���ٺ�ԭ�����������㣬��Ѹ��������ұߵ�һ��1���0����ô��������Ķ����Ʊ�ʾ���ж��ٸ�1�Ϳ��Խ��ж��ٴ������Ĳ���
	public static int getNumber1(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = (n -1)& n;
		}
		return count;
	}
	
	//�ж�һ�������ǲ���2�������η�  �����������Ǹ����� ������ۺ���Ҫ
	
	public static boolean isA(int n){
		int x = (n - 1)&n;
		if(x==0)return true;
		return false;
	}
}

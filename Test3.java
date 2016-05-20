package net.getOffer;

public class Test3 {

	
	//计算整形的二进制表示中 1的个数 11是1011 则返回3  采用移位的思想
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
	
	//把一个整数减去1，再和原整数做与运算，会把该整数最右边的一个1变成0，那么这个整数的二进制表示中有多少个1就可以进行多少次这样的操作
	public static int getNumber1(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = (n -1)& n;
		}
		return count;
	}
	
	//判断一个整数是不是2的整数次方  还是用上面那个理论 这个理论很重要
	
	public static boolean isA(int n){
		int x = (n - 1)&n;
		if(x==0)return true;
		return false;
	}
}

/**
 * ��ת�������С����{3,4,5,1,2}����{1,2,3,4,5}��һ����ת
 */
package net.getOffer;

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016��5��13��
 */
public class Test2 {

	/**
	 * @param args
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,2,2,2,2};
		System.out.println(getMin(array));
	}

	/**
	 * @param array
	 * @return 1
	 * ֻ��Ӧ����ȫ���������� ���� ����{1,1,1,0,1} ����{1,0,1,1,1}�����ķ���ȫ����������˵ ����ķ�������Ҫ�Ľ�����Ϊ
	 * �޷��ж��м�������Ƿ�λ��ǰ����������л��Ǻ�����������У�Ҳ���޷��ƶ�����ָ������С���ҵķ�Χ
	 * ��ʱ�ò���˳����ҵķ�ʽ
	 */
	private static int getMin(int[] array) {
		
		if(array.length==0)return 0;
		int start = 0;
		int end = array.length - 1;
		if(array[start]<=array[end]) return array[start];
		while(start !=end -1){
			int mid = (start + end)/2;
			if(array[start] == array[end]&&array[mid] == array[start]){
				return minInOrder(array,start,end);
			}	
			if(array[mid]>=array[start]){
				start = mid;
			}else if(array[mid]<=array[end]){
				end = mid;
			}
		}
		return array[end];
	}

	/**
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	private static int minInOrder(int[] array, int start, int end) {
		int result = array[start];
		for(int i =start +1;i<=end;i++){
			if(result>array[i]){
				result = array[i];
			}
		}
		return result;
	}

}

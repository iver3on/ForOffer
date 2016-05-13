/**
 * 旋转数组的最小数字{3,4,5,1,2}就是{1,2,3,4,5}的一个旋转
 */
package net.getOffer;

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月13日
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
	 * 只能应用完全递增的数组 查找 对于{1,1,1,0,1} 或者{1,0,1,1,1}这样的非完全递增数组来说 下面的方法还需要改进，因为
	 * 无法判断中间的数字是否位于前面的子数组中还是后面的子数组中，也就无法移动两个指针来缩小查找的范围
	 * 此时得采用顺序查找的方式
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

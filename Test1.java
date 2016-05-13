/**
 * 
 */
package net.getOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author IVER3ON
 * @email grepzwb@qq.com
 * 2016年5月10日
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "google";
		System.out.println(deleteRepeat(s));
		String s1 = "newbee";
		String s2 = "weeenbn";
		System.out.println(isAnagram(s1, s2));
	}

	/**
	 * @param s
	 * @return
	 * 去掉字符串中重复的字符
	 */
	private static String deleteRepeat(String s) {
		Map<Character,Boolean> map = new HashMap<>();	
		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				continue;
			}else{
				sb.append(c[i]);
				map.put(c[i],true);
			}	
		}
		return sb.toString();
	}

	//判断两个字符串是不是变位词  就比如live 和evil  或者happy 和ppyah
	public static boolean isAnagram(String s1,String s2){
		Map<Character,Integer> map = new HashMap<>();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(int i=0;i<c1.length;i++){
			if(map.containsKey(c1[i]))
			map.put(c1[i],map.get(c1[i])+1);
			else
				map.put(c1[i],1);
		}
		
		for(int i=0;i<c2.length;i++){
			if(map.containsKey(c2[i]))
				map.put(c2[i],map.get(c2[i])-1);
		}
		for(int x:map.values()){
			if(x!=0)
				return false;
		}
		return true;
	}
}

/**
 * 
 */
package com.qhit.lh.grs.sym.exam.common.utils;

import java.util.HashSet;
import java.util.Random;


public class RandomUtil {
	
	public static int[] randomCommon(int max,int min,int n){
		if(n > (max - min + 1) || max < min){
			return null;
		}
		int[] result = new int[n];
		int count = 0;
		while(count < n){
			int num = (int) (Math.random() * (max - min)) + min;
			boolean flag = true;
			for(int j = 0; j < n ; j++){
				if(num == result[j]){
					flag = false;
					break;
				}
			}
			if(flag){
				result[count] = num;
				count++;
			}
		}
		return result;
	}
	
	/**
	 * éå¿æº?é¸å§ç¾é¼å¨æ´¿éå©æ¶îç¬é²å¶î²é¨å¬æ?
	 * éâæ¤HashSeté¨å­å£å¯°ä¾ç´éîç¨éå¥ç¬éå²æ®éï¿?
	 * @param min é¸å§ç¾é¼å¨æ´¿éï¿½çå¿ï¿½ï¿½
	 * @param max é¸å§ç¾é¼å¨æ´¿éï¿½æ¾¶Ñï¿½ï¿?
	 * @param n éå¿æº?éé¢ééï¿?
	 * @param HashSet<Integer> set éå¿æº?ç¼æ´çéï¿?
	 */
	public 	static void randomSet(int min, int max ,int n,HashSet<Integer> set){
		if(n > (max - min + 1) || max < min){
			return;
		}
		for(int i = 0;i < n; i++){
			//çåªæ¤Math.random()éè§ç¡?
			int num = (int) (Math.random() * (max - min)) + min;
			set.add(num);//çåç¬éå²?æ®éæ¿ç¨éîashSetæ¶ï¿½
		}
		int setSize = set.size();
		//æ¿¡åçç?æ¨ºåé¨å¬æçå¿ç°¬é¸å§ç¾é¢ç¸åé¨åªééå¸®ç´éæ¬çé¢ã©ï¿½æç¶éå¶æé´æ¬å¢¿æµ£æ¬åæ¶îæ®¢éçæéå±½î§å§ãæéî¤ç´é©æåææ§åé¸å§ç¾æ¾¶Ñç¬
		if(setSize < n){
			randomSet(min, max, n-setSize, set);//é«æç¶?
		}
	}
	
	public static int[] randomArray(int min,int max,int n){
		int len = max - min + 1;
		
		if(max < min || n > len){
			return null;
		}
		
		//éæ¿îéæ «ç²°ç¹æ°³å¯é¥å¯¸æ®å¯°å´ï¿½å¤æç¼ï¿?
		int[] source = new int[len];
		for(int i = min; i < min + len; i++){
			source[i-min] = i;
		}
		
		int[] result = new int[n];
		Random rd = new Random();
		int index = 0;
		for(int i = 0; i < result.length; i++){
			//å¯°å´ï¿½å¤æç¼ï¿?0éå¸®ç´len - 2éå¤æ®¢éè½°ç¬æ¶ï¿½æ¶îæ´°éï¿?
			index = Math.abs(rd.nextInt() % len--);
			//çåæ®¢éååé¨å¬æéæ§åç¼æ´çéï¿?
			result[i] = source[index];
			//çåç·é«å¤æç¼åªèçî¦æ®¢éååé¨å¬æéå²æ¤å¯°å´ï¿½å¤æç¼å¶ç´len-1éå¤ç¬éå§î®æ´ææ®éæå´²
			source[index] = source[len];
		}
		return result;
	}
}

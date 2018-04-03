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
	 * 闅忔�?鎸囧畾鑼冨洿鍐匩涓笉閲嶅鐨勬�?
	 * 鍒╃敤HashSet鐨勭壒寰侊紝鍙瓨鏀句笉鍚岀殑鍊�?
	 * @param min 鎸囧畾鑼冨洿鏈�灏忓��
	 * @param max 鎸囧畾鑼冨洿鏈�澶у��?
	 * @param n 闅忔�?鏁颁釜鏁�?
	 * @param HashSet<Integer> set 闅忔�?缁撴灉闆�?
	 */
	public 	static void randomSet(int min, int max ,int n,HashSet<Integer> set){
		if(n > (max - min + 1) || max < min){
			return;
		}
		for(int i = 0;i < n; i++){
			//璋冪敤Math.random()鏂规�?
			int num = (int) (Math.random() * (max - min)) + min;
			set.add(num);//灏嗕笉鍚�?殑鏁板瓨鍏ashSet涓�
		}
		int setSize = set.size();
		//濡傛灉�?�樺叆鐨勬暟灏忎簬鎸囧畾鐢熸垚鐨勪釜鏁帮紝鍒欒皟鐢ㄩ�掑綊鍐嶇敓鎴愬墿浣欏嚑涓殢鏈烘暟锛屽姝ゅ惊鐜紝鐩村埌杈惧埌鎸囧畾澶у皬
		if(setSize < n){
			randomSet(min, max, n-setSize, set);//閫掑�?
		}
	}
	
	public static int[] randomArray(int min,int max,int n){
		int len = max - min + 1;
		
		if(max < min || n > len){
			return null;
		}
		
		//鍒濆鍖栫粰瀹氳寖鍥寸殑寰呴�夋暟缁�?
		int[] source = new int[len];
		for(int i = min; i < min + len; i++){
			source[i-min] = i;
		}
		
		int[] result = new int[n];
		Random rd = new Random();
		int index = 0;
		for(int i = 0; i < result.length; i++){
			//寰呴�夋暟缁�?0鍒帮紙len - 2锛夐殢鏈轰笅涓�涓洰鏍�?
			index = Math.abs(rd.nextInt() % len--);
			//灏嗛殢鏈哄埌鐨勬暟鏀惧叆缁撴灉闆�?
			result[i] = source[index];
			//灏嗗緟閫夋暟缁勪腑琚殢鏈哄埌鐨勬暟锛岀敤寰呴�夋暟缁勶紙len-1锛変笅鏍囧搴旂殑鏇挎崲
			source[index] = source[len];
		}
		return result;
	}
}

package cn.spark.study.core;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class set {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<HashSet<String>> arrayList = new ArrayList<>();
		
        int n = Integer.parseInt(bf.readLine().toString());
        for(int i = 0;i < n ;i++){
            String[] strs = bf.readLine().toString().split(" ");
            HashSet<String> result = new HashSet<String>();
            for(String t :strs) {
            	result.add(t);
            }
            boolean flag = true;
            for(HashSet<String> set: arrayList) {
            	HashSet<String> tmp = (HashSet<String>) set.clone();
            	tmp.retainAll(result);
            	if(tmp.size() > 0) {
            		set.addAll(result);
            		flag = false;
            		break;
            	}
            }
            if(flag == true) {
            	arrayList.add(result);
            }
        }
        int max = 0;
        for(HashSet<String> set: arrayList) {
        	if(set.size() > max) {
        		max = set.size();
        	}
        }
        System.out.println(arrayList.size());
        System.out.println(max);
	}
}

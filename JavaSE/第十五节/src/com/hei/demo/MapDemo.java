package com.hei.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;





/**
 * 
 * 	HashMap以键值对的形式存储元素；
	对于HashMap来说，不存在索引，也就是说不可以通过索引来访问元素，只能通过键去访问值
	由于没有索引，所以HashMap中元素的存放是没有顺序的；
	HashMap类继承了AbstractMap类，并实现了Map接口。
 * MapDemo类
 * 创建人:黑有有
 * 时间：2016年6月3日-下午6:48:22 
 * @version 1.0.0
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		//面试题：随机10个不重复的100以内的数字
//		HashSet<Integer> set = new HashSet<Integer>();
//		Random random = new Random();
//		int i = 0;
//		方法一：
////		while(i<10){
////			int value = random.nextInt(101);
//////			判断是否成功添加不重复的元素进set集合，如果成功添加则i自增1，否则不自增
////			if(set.add(value))i++;
////		}
//		方法二：
//		while(true){
//			int value = random.nextInt(101);
//			set.add(value);
////			判断是否成功添加了10个不重复的元素进set集合，如果成功添加到10个不重复的元素则跳出循环
//			if(set.size()>=10)break;
//			i++;
//		}
//		System.out.println(set);
		
		
		//key由Set维护关系(key不重复且可以为null)，value由LinkedList去维护关系（可以重复也可以值为null）
		HashMap<String,Object> map = new HashMap<String,Object>();

//		boolean isEmpty()判断HashMap对象是否为空，为空返回true，否则返回false
		System.out.println(map.isEmpty());//true

//		Object put(Object key, Object value)向HashMap对象中添加一个元素，必须指定该元素的键和值
		map.put("1","黑有有");
		map.put("2",null);
		map.put("3",null);
//		键值相同的键对象，后面的键值会将前面的覆盖掉，而且值对象也会被覆盖掉
		map.put("2","abcd");
		map.put("4","Jery");
		map.put(null,"133");
		map.put("5","123");
		
//		int size()返回HashMap对象的大小，即元素的个数
		System.out.println(map.size());//6
//		HaspMap集合输出的顺序为无序输出
//		System.out.println(map);//{null=133, 1=黑有有, 2=abcd, 3=null, 4=Jery, 5=123}

//		keySet()返回的是一个由键值对象组成的Set集合
		for(String key : map.keySet()){
//			Object get(Object key)通过键对象查找相对应的值对象
			System.out.println("Mapd的key为："+key+"值为："+map.get(key));
		}
		
		System.out.println(map.get("4"));//Jery
//		Object remove(Object key)通过键对象删除相对应的值对象，并且返回删除的对象
		System.out.println(map.remove(null));//123
//		boolean containsKey(Object key)查找指定的键对象在HashMap对象中是否存在，存在返回true
		System.out.println(map.containsKey("4"));//true
//		boolean containsValue(Object value)查找指定的值对象在HashMap对象中是否存在，存在返回true
		System.out.println(map.containsValue("123"));//true
//		void clear()清空HashMap对象中的所有元素
//		map.clear();
//		System.out.println(map.size());//0
		
//		Collection<E> values()返回的是由HashMap集合中的值对象组成的一个Collection集合
//		Collection<Object> vals = map.values();
//		System.out.println(vals);//[黑有有, abcd, null, Jery, 123]

//		entry循环：map.entrySet()返回的由键和值对象组成的一个类型为Map.Entry()接口的Set集合
//		for(Entry<String, Object> m : map.entrySet()){
////			 K getKey()返回与此项对应的键；  V getValue()返回与此项对应的值。 
//			System.out.println(m.getKey()+":"+m.getValue());
//		}
		
//		迭代器循环输出HashMap集合的元素对象
//		通过keySet()拿到每个键对象放在Set集合中
//		Set<String> keySet = map.keySet();
//		调用iterator()，注意Map集合类没有迭代器的方法，只有List和Set集合类有该方法
//		Iterator<String> iterator = keySet.iterator();
//		while(iterator.hasNext()){
//			String key = iterator.next();
//			System.out.println(key+"："+map.get(key));
//		}
//		LinkedHashMap与HashMap的唯一区别就是：前者属于什么顺序添加元素就什么顺序输出，而后者属于无序输出
//		LinkedHashMap<Integer,String> map1 = new LinkedHashMap<Integer,String>();
//		map1.put(1, "123");
//		map1.put(2, "abc");
//		map1.put(5, "223");
//		map1.put(4, "heihei");
//		map1.put(3, "efd");
////		Map.Entry<Interger,String>可以简写成Entry<Integer,String>
//		for(Map.Entry<Integer,String> i : map1.entrySet()){
//			System.out.println(i.getKey()+":"+i.getValue());
//		}
		
//		解决TreeMap按Key值排序
//		TreeMap<Integer,String> map2 = new TreeMap<Integer,String>();
//		map2.put(1,"和反复");
//		map2.put(4,"hehe");
//		map2.put(2,"abc");
//		map2.put(5,"heiyou");
//		map2.put(6,"黑有有");
//		map2.put(3,"def");
////		TreeMap集合默认以key值升序的形式进行输出
//		System.out.println(map2);
		
//		TreeMap<Integer,Object> maps = new TreeMap<Integer,Object>(new Comparator<Integer>() {
//		
//				@Override
//				public int compare(Integer o1, Integer o2) {
//					return o2.compareTo(o1);
//				}
//				
//			});
//		TreeMap<Integer,Object> map2 = new TreeMap<Integer,Object>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
////				key值降序排序输出，调用了Integer类默认重写的compareTo方法来比较
//				return o2.compareTo(o1);
////				key值升序排序输出
////				return o1.compareTo(o2);
//			}	
//		});									
//		map2.put(1,"和反复");
//		map2.put(4,"hehe");
//		map2.put(2,"abc");
//		map2.put(5,"heiyou");
//		map2.put(6,"黑有有");
//		map2.put(3,"def");
//		for(Map.Entry<Integer,Object> m : map2.entrySet()){
//			System.out.println(m.getKey()+":"+m.getValue());
//		}
		
//		如果在Treemap里面想按照value进行排序，我们必须借助工具类Collections.sort(List,Comparator);
		TreeMap<String,Object> map3 = new TreeMap<String,Object>();
		map3.put("a","aa");
		map3.put("b","bbb");
		map3.put("d","dddd");
		map3.put("f","ffffff");
		map3.put("c","ccc");
		map3.put("e","eeeee");
//		System.out.println(map3);
//		list是一个类型为Map.Entry<String,Object>元素对象的ArrayList集合类
		ArrayList<Map.Entry<String,Object>> list = new ArrayList<Map.Entry<String,Object>>(map3.entrySet());
//		调用Collections工具类中的sort(List l,Comparator e)进行值排序输出
		Collections.sort(list,new Comparator<Map.Entry<String,Object>>(){
			@Override
			public int compare(Entry<String, Object> o1, Entry<String, Object> o2) {
				// TODO Auto-generated method stub
//				值对象按按ASCII编码升序排序，并且调用String类重写的compareTo()方法进行比较
//				return o1.getValue().toString().compareTo(o2.getValue().toString());
//				值对象按ASCII编码降序排序
				return o2.getValue().toString().compareTo(o1.getValue().toString());
				
//				Integer o11 = o1.getValue().toString().length();
//				Integer o22 = o2.getValue().toString().length();
////				按值对象的长度由小到大排序输出
////				return o11.compareTo(o22);
////				按值对象的长度由大到小排序输出
//				return o22.compareTo(o11);
			}
			
		});
//		遍历输出装有了键值的ArrayList集合list的对象值
		for(Map.Entry<String,Object> l : list){
			System.out.println(l.getKey()+":"+l.getValue());
		}
	}
}

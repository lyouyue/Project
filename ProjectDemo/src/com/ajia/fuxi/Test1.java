package com.ajia.fuxi;

public class Test1 {
	public static void main(String[] args) {
       /**
        * 基本数据类型
        * 整数型  默认值 0
        *   byte short int long 
        * 浮点型  0.0  默认double 
        *   flaot double 
        * 字符型  ‘/u0000’
        *   char 
        * 布尔型  false
        *   boolean
        *  
        *  定义一个基本数据类型
        *    数据类型  变量名称 = 初始值 ;
        *    数据类型  变量名称  ;
        *   
        *   float money = 10.0f;
        *   long lg =125L;
        *   
        *   从小大大
        *   byte < short <int <long
        *   flaot<double
        *   
        *   数据转换
        *   自动转型
        *     小转大
        *   强制转型
        *     大转小  数据转换是不安全的
        *  
        *  数据溢出
        *     
        *   数据在转换的时候的应用场景
        *     定义一个整数数据类型的时候用int
        *     定义小数默认使用double
        *     定义时间、文件大小、内存大小使用long
        *     处理中文用char
        *     判断真假用boolean类型
        *   
        *   java的引用数据类型
        *     类   String  Scanner JFrame JPanle
        *     数组  
        *     接口  interface 规则 
        *     
        *    方法（函数）
        *      普通方法（自定义方法/自定义函数）
        *      构造方法
        *       
        *    普通方法
        *    //void 是一种返回类型，但是什么都没有返回
        *    //如果返回类型是void ，则不需要写返回return
        *    public 返回类型  方法名称(参数类型  参数,参数类型  参数,...){
        *        // 方法执行的语句
        *        // return 
        *    }
        *    
        *  构造方法
        *      1、方法名称与类名称一致
        *      2、无返回类型
        *      3、使用public修饰
        *      
        *  方法的重载
        *     	 	方法名称相同,参数类型不同，
        *      		返回类型不同，参数个数不同。
        *  运算符
        *  逻辑运算符
        *  && 且  ||或  ！非 
        *  
        *  > < >= <= !=  =  %  + - * / 
        *  
        *  程序控制
        *  for(循环的初始条件;循环的结束条件;改变循环的条件){
        *     // 循环的语句
        *  }
        *  
        *  循环的初始条件;
        *  while(循环的结束条件){
        *     循环语句;
        *     循环的改变条件;
        *  }
        *  
        *  循环的初始条件;
        *  do{
        *      循环语句;
        *     循环的改变条件;
        *  }while(跳出循环的条件);
        *  
        *  if(条件语句){
        *     // 条件成立的时候执行
        *  }
        *  
        *  if(条件语句){
        *     // 条件成立的时候执行
        *  }else{
        *    // 当条件不成立的时候执行
        *  }
        *  
        *   if(条件语句){
        *     // 条件成立的时候执行
        *  }else{
        *    // 当条件不成立的时候执行
        *  }
        *  
        *  
        *  if(){
        *  
        *  }else if(){
        *  
        *  }else if(){
        *  
        *  }
        *  ...
        *  else{
        *  
        *  }
        *   
        *   三目运算
        *   条件语句 ? 条件成立执行语句：条件不成的时候执行
        *   
        *   contuin 跳出当前循环
        *   break  跳出所有的循环
        *   
        *   数组
        *   定义一个数组
        *     	数据类型  []数组名称 = new 数据类型[数组长度];
        *   分布式
        *      	数据类型  []数组名称 =null;
        *      	数组名称 = new 数据类型[数组长度];
        *   静态数组的初始化
        *    	数据类型  []数组名称 = new 数据类型[]{值,值,...};
        *    	数据类型  []数组名称 ={值,值,...};
        *    
        *  数组的下标是从零开始
        *    for(int i=0;i<数组名称.length;i++){
        *       System.out.println(data[i]);
        *    }
        *    
        *    数组的赋值
        *      数组名称[下标]=值;
        *      或者通过静态初始化赋值
        *   
        *   二维数组定义
        *   数据类型  数组名称[][] = new  数据类型[行的长度][列的长度];
        *   二维数的输出
        *     for(int i=0;i<数组名称){
        *     }
        *   
        *   面向对象
        *     类 
        *       类是一个抽象的概念，是一类共有的属性集合。构造房屋的设计图纸，汽车的制造图纸
        *     对象
        *       对象只的是一个具体事物
        *    
        *    类定义
        *      class  类名称{
        *         属性;
        *         方法();
        *      }
        *      
        *    定义对象
        *    两种方法
        *      声明并实例化对象
        *      类名称  对象名称 = new 类名称();
        *      分步式对象
        *        (1)、声明对象
        *        类名称  对象名称 = null;
        *        (2)、实例化对象
        *        对象名称 = new 类名称();
        *        
        *    调用类中属性和方法
        *      对象名称.属性;
        *      对象名称.方法();
        *      
        *     类在内存中
        *     栈：保存的是对象名称
        *     堆：保存的是堆中的地址数值。一个栈对应一个堆
        *      
        *        
        */
		
		
		float d =12.5f;
		
		
		byte min=Byte.MIN_VALUE;
		byte max =Byte.MAX_VALUE;
		
		System.out.println(min); //-128
		System.out.println(max);  // 127
		
		byte min2 = (byte)(min-2);
		int min1 =min-2;
		System.out.println(min1);
		System.out.println(min2);
	}

	
	public void prints(){
	}
	
	public String  hh(int d){
	  return "";
	}
	
	public int hh(double a){
		return 2;
	}
	public void data(int a){
		if(a%3==0 || a%5==0){
			System.out.println(a+"既能被3整除又能5整除");
		}else{
			
		}
		
	}
	
	
	
	public int  add(){
		int sum =0; // 和的相加存储的值
		// 1+2+3+...100
		for(int i=1;i<=100;i++){
			//sum+=i;
			sum=sum+i;
		}
		return sum ;
	}
	
	public int add1(){
		int sum=0;
		int i=1;
		while(i<=100){
			sum+=i;
			i++;
		}
		return sum ;
	}
}

package com.ajia.fuxi;

public class Test2 {
    public String kk;
	public static void main(String[] args) {
		/*isDatas(90);
		isData();*/
		copyArray();
		array();
	}
	
	public static void isData(int a){
		System.out.println(a%3==0&&a%5==0?a+"�ܱ�3��5����":a+"����3��5����");
	}
	
	public static void isDatas(int a){
		if(a%3==0&&a%5==0){
			System.out.println(a+"�ܱ�3��5����");
		}
	    if(a%2==0){
	    	System.out.println(a+"��һ��ż��");
	    }
	}
	
//	data  data1
	public static void  isData(){
		for(int i=0;i<=10;i++){
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void copyArray(){
		int data[]={23,45,8,34,26};
		int data1[]=new int[data.length];
		data1=data;
		/*for(int i=0;i<data.length;i++){
			data1[i]=data[i];
		}
		*/
		for(int j=0;j<data1.length;j++){
			System.out.println(data1[j]);
		}
	}
	
	public static void array(){
		int data[][]={
					{4,8,7},
					{5,9,23},
					{22,45,58}
				};
		int data1[][] = new int[data.length][3];
		for(int i=0;i<data.length;i++){ //�����
			for(int j=0;j<data[i].length;j++){ // ���Ƶ���
			//	System.out.println(data[i][j]);
				data1[i][j]=data[i][j];
			}
		}
		for(int i=0;i<data1.length;i++){ //�����
			for(int j=0;j<data1[i].length;j++){ // ���Ƶ���
				System.out.println(data1[i][j]);
			}
		}
	}

}

package com.briup.day3;
import java.util.Date;
public class Socend
{	/**
	 这是一个无参数的方法
	 */
	public  void showHello(){
		System.out.println("HelloMyWorld"+"\n"+new Date());
	}/**
	  调用方法
	 */
	public static void main(String args[]){
	
		Socend socend=new Socend();
		socend.showHello();
	}
}
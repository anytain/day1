package com.briup.day3;
import java.util.Date;
public class Socend
{	/**
	 ����һ���޲����ķ���
	 */
	public  void showHello(){
		System.out.println("HelloMyWorld"+"\n"+new Date());
	}/**
	  ���÷���
	 */
	public static void main(String args[]){
	
		Socend socend=new Socend();
		socend.showHello();
	}
}
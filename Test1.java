package jiekou1;

import java.util.Scanner;

public class Test1 {

	public static void main(String args[]) {
		Yanjiusheng li;
		li = new Yanjiusheng("李明","男");
		li.age = 22;
		li.nianshouru = (li.getFaXinShui(22)-li.getJiaoXueFei(22))*12;
		li.yingjiaojine = li.yingJiaoJinE();
		
		try{
			 Scanner a = new Scanner(System.in);
			 li.age(a.nextInt());
		System.out.println("姓名："+args[0]+","+"性别:"+args[2]+","+"年龄"+li.age);
		System.out.println("查到的学费："+li.setChaXueFei(22));
		System.out.println("应缴的学费："+li.getJiaoXueFei(22));
		System.out.println("查到的月薪水："+li.setChaXinShui(22));
		System.out.println("应发的月薪水："+li.getFaXinShui(22));
		     li.nianshouru(a.nextDouble());
		System.out.println("年收入："+li.nianshouru);
			 li.yingjiaojine(a.nextDouble());
		System.out.println("年应缴纳税金额:"+li.yingjiaojine);
		
		Yanjiusheng zhang;
		zhang = new Yanjiusheng("张华","女");
		zhang.age = 19;
		zhang.nianshouru = (zhang.getFaXinShui(19)-zhang.getJiaoXueFei(19))*12;
		zhang.yingjiaojine = zhang.yingJiaoJinE();
		
		
			Scanner b = new Scanner(System.in);
			zhang.age(b.nextInt());
		System.out.println("姓名："+args[1]+","+"性别:"+args[3]+","+"年龄"+zhang.age);
		System.out.println("查到的学费："+zhang.setChaXueFei(19));
		System.out.println("应缴的学费："+zhang.getJiaoXueFei(19));
		System.out.println("查到的月薪水："+zhang.setChaXinShui(19));
		System.out.println("应发的月薪水："+zhang.getFaXinShui(19));
			zhang.nianshouru(b.nextDouble());
		System.out.println("年收入："+zhang.nianshouru);
			zhang.yingjiaojine(b.nextDouble());
		System.out.println("年应缴纳税金额："+zhang.yingjiaojine);
		 }
		catch (NumberFormatException a){
			 System.out.println("math only"); 
		 }
		
		catch (Exception e){
			 System.out.println("math only");
		 }
		
		
		
				
				
		
	}

}

package jiekou1;

import java.util.Scanner;

public class Test1 {

	public static void main(String args[]) {
		Yanjiusheng li;
		li = new Yanjiusheng("����","��");
		li.age = 22;
		li.nianshouru = (li.getFaXinShui(22)-li.getJiaoXueFei(22))*12;
		li.yingjiaojine = li.yingJiaoJinE();
		
		try{
			 Scanner a = new Scanner(System.in);
			 li.age(a.nextInt());
		System.out.println("������"+args[0]+","+"�Ա�:"+args[2]+","+"����"+li.age);
		System.out.println("�鵽��ѧ�ѣ�"+li.setChaXueFei(22));
		System.out.println("Ӧ�ɵ�ѧ�ѣ�"+li.getJiaoXueFei(22));
		System.out.println("�鵽����нˮ��"+li.setChaXinShui(22));
		System.out.println("Ӧ������нˮ��"+li.getFaXinShui(22));
		     li.nianshouru(a.nextDouble());
		System.out.println("�����룺"+li.nianshouru);
			 li.yingjiaojine(a.nextDouble());
		System.out.println("��Ӧ����˰���:"+li.yingjiaojine);
		
		Yanjiusheng zhang;
		zhang = new Yanjiusheng("�Ż�","Ů");
		zhang.age = 19;
		zhang.nianshouru = (zhang.getFaXinShui(19)-zhang.getJiaoXueFei(19))*12;
		zhang.yingjiaojine = zhang.yingJiaoJinE();
		
		
			Scanner b = new Scanner(System.in);
			zhang.age(b.nextInt());
		System.out.println("������"+args[1]+","+"�Ա�:"+args[3]+","+"����"+zhang.age);
		System.out.println("�鵽��ѧ�ѣ�"+zhang.setChaXueFei(19));
		System.out.println("Ӧ�ɵ�ѧ�ѣ�"+zhang.getJiaoXueFei(19));
		System.out.println("�鵽����нˮ��"+zhang.setChaXinShui(19));
		System.out.println("Ӧ������нˮ��"+zhang.getFaXinShui(19));
			zhang.nianshouru(b.nextDouble());
		System.out.println("�����룺"+zhang.nianshouru);
			zhang.yingjiaojine(b.nextDouble());
		System.out.println("��Ӧ����˰��"+zhang.yingjiaojine);
		 }
		catch (NumberFormatException a){
			 System.out.println("math only"); 
		 }
		
		catch (Exception e){
			 System.out.println("math only");
		 }
		
		
		
				
				
		
	}

}

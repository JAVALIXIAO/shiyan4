package jiekou1;

public class Yanjiusheng implements Teacher,Student {
	String name;
	String sex;
	String gjns;
	int age;
	int x;
	int y;
	int nianshouru;
	float m;
	float yingjiaojine;
	final float n = (float) 0.03;
	Yanjiusheng(String name,String sex) {
		
	}
	public float yingJiaoJinE() {
		
		m = (float) (nianshouru*n);
		return m;
	}

	public int setChaXueFei(int age1) {
		// TODO Auto-generated method stub
		age1 = 20;
		if(age<age1) {
			return 4600;
		}
		else{
			return 5000;
		}
	}
	public int getJiaoXueFei(int age2) {
		// TODO Auto-generated method stub
		age2 = 20;
		if(age<age2){
			return 4600;
			}
		else {
			return 5000;
		}
	}
	public int setChaXinShui(int age3) {
		// TODO Auto-generated method stub
		age3 = 20;
		if(age<age3) {
			return 8000;
			}
		else {
			return 7000;
		}
	}
	public int getFaXinShui(int age4) {
		// TODO Auto-generated method stub
		age4 = 20;
		if(age<age4) {
			return 8000;
			}
		else {
			return 7000;
		}
		}
	@Override
	public int setFaXinShui(int age4) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void age(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	public void nianshouru(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	public void yingjiaojine(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	}

	

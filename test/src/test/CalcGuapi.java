package test;

public class CalcGuapi {

	public static void main(String[] args) {
//		guosoufu();
//		syys();asdfsadf
		lichi();
	}
	
	private static void lichi() {
		double balance = 500000;
		for (int i = 1; i <= 60; i++) {
			balance *= 1.045;
			System.out.println(i+"�� ��"+(int)balance);
		}
	}
	
	private static void syys() {
		double[] fenhong = {};
		double prof = 1.045;
		double balance = 0;
		double userbalance = 0; 
		double returnbalance = 0;
		for (int i = 1; i <= 105; i++) {
			if(i <= 5) {
				balance += 10000;
				userbalance += 10000;
			}
			balance *=prof;
			
			if(i == 5) {
				balance -= 10000;
				returnbalance += 10000;
				System.out.println("��5�귵��5��");
			}
			if(i >= 6 && i <=59) {
				balance -= 744.2;
				returnbalance += 744.2;
				System.out.println("��"+i+"�귵��3721");
			}
			if(i == 60) {
				balance -= 50000;
				returnbalance += 50000;
				System.out.println("��"+i+"�귵��25��");
			}
			if(i >= 61) {
				balance -= 111.63;
				returnbalance += 111.63;
				System.out.println("��"+i+"�귵��558.15");
			}
			System.out.println(""+i+"��, Ͷ�룺"+(int)userbalance+" , ����ƺ��ۼ����ã�"+(int)balance+" , �ۼƷ�����"+(int)returnbalance);
		}
	}

	private static void guosoufu() {
		double prof = 1.05;
		double balance = 0;
		for (int i = 1; i <= 50; i++) {
			if(i <= 20) {
				balance += 6000;
			}
			balance *=prof;
			System.out.println("year "+i+" , "+(int)balance);
		}
	}
}

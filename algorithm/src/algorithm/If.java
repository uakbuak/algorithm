package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class If {
	
	//4344 ����� �Ѱ���
	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int count = Integer.parseInt(bf.readLine());
			
			// �ܺ� for�� 
			for (int i=1; i<=count; i++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int innerCount = Integer.parseInt(st.nextToken());
				int[] group = new int[innerCount];
				int sum = 0;
				// ���� for��
				for (int j=0; j<innerCount; j++) {
					group[j] = Integer.parseInt(st.nextToken());
					sum += group[j];
					}
				int avg = sum/innerCount;
				int check = 0;
				for (int k : group) {
					if(Integer.compare(k, avg) > 0) {
						check += 1;
					}
				} // ���� for�� end
				bw.write(String.format("%.3f", check*100.000/innerCount)+"%\n");	
			} // �ܺ� for�� end
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//1547 ���� �����ϱ� 2
	//Scanner ��ü ��� �� ���� �ð� : 160 ms
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//        int count = scan.nextInt();
//        int [] grades = new int[count];
//        for(int i=0; i<count; i++) {
//            grades[i] = scan.nextInt();
//        }
//        Arrays.sort(grades);
//        double M = grades[grades.length-1];
//        double sum = 0;
//        for(int i=0; i<count; i++) {
//            sum += grades[i]/M*100;
//        }
//        System.out.println(sum/count);
//	}
	
	//1547 ���� �����ϱ� 1
	//Buffered ��ü ��� �� ���� �ð� : 84 ms
//	public static void main(String[] args) {
//		try {
//			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			int count = Integer.parseInt(bf.readLine());
//			StringTokenizer st = new StringTokenizer(bf.readLine());
//			int[] grades = new int[count];
//			
//			for(int i=0; i<count; i++) {
//				grades[i] = Integer.parseInt(st.nextToken());
//			}
//			Arrays.sort(grades);
//			double M = grades[grades.length-1];
//			double sum = 0;
//			for(int i=0; i<count; i++) {
//				sum += grades[i]/M*100;
//			}
//			bw.write(Double.toString(sum/count));
//			bw.flush();
//			bw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	
	//10871 X���� ���� �� ����ϱ�
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int X = scan.nextInt();
//		ArrayList <Integer> list = new ArrayList();
//		for (int i=1; i<=N; i++) {
//			int temp = scan.nextInt();
//			if (temp < X) {
//				list.add(temp);
//			}
//		}
//		for (int i : list) {
//			System.out.print(i+" ");
//		}
//	}
	
	//10817 �� ���� ��
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int C = scan.nextInt();
//		if (A>B && A>C) {
//			if (B>=C) {
//				System.out.println(B);
//			} else {
//				System.out.println(C);
//			}
//		} else if (A<B && A<C) {
//			if (B>=C) {
//				System.out.println(C);
//			} else {
//				System.out.println(B);
//			}
//		} else {
//			System.out.println(A);
//		}
//	}
	
	
//	// 9498 ���� ���� �ű��
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
//		String grade = "";
//		if (score <= 100 && score >=90) {
//			grade = "A";
//		} else if (score < 90 && score >= 80) {
//			grade = "B";
//		} else if (score < 80 && score >= 70) {
//			grade = "C";
//		} else if (score < 70 && score >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		System.out.println(grade);
//	}

}

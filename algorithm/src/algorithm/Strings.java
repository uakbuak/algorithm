package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Strings {
	
	//2941 크로아티아 알파벳
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		
		for (int i = 1; i <= word.length(); i++) {
			if (word.contains("c=")) {
				word = word.replace("c=", "1");
			} else if (word.contains("c-")) {
				word = word.replace("c-", "2");
			} else if (word.contains("dz=")) {
				word = word.replace("dz=", "3");
			} else if (word.contains("d-")) {
				word = word.replace("d-", "4");
			} else if (word.contains("lj")) {
				word = word.replace("lj", "5");
			} else if (word.contains("nj")) {
				word = word.replace("nj", "6");
			} else if (word.contains("s=")) {
				word = word.replace("s=", "7");
			} else if (word.contains("z=")) {
				word = word.replace("z=", "8");
			}
		}
		bw.write(Integer.toString(word.length()));
		bw.flush();
		bw.close();
	}
	
	//5622 다이얼 돌리기
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String word = br.readLine();
//		int temp = 0;
//		for(int i=0; i<word.length(); i++) {
//			if(word.charAt(i) >= 87) {
//				temp += 10;
//			} else if(word.charAt(i) >= 84) {
//				temp += 9;
//			} else if(word.charAt(i) >= 80) {
//				temp += 8;
//			} else if(word.charAt(i) >= 77) {
//				temp += 7;
//			} else if(word.charAt(i) >= 74) {
//				temp += 6;
//			} else if(word.charAt(i) >= 71) {
//				temp += 5;
//			} else if(word.charAt(i) >= 68) {
//				temp += 4;
//			} else {
//				temp += 3;
//			} 
//		}
//		bw.write(Integer.toString(temp));
//		bw.flush();
//		bw.close();
//	}
	
	//2675 문자열 반복
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int count = Integer.parseInt(br.readLine());
//		for(int i=1; i <= count; i ++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int repeat = Integer.parseInt(st.nextToken());
//			String word = st.nextToken();
//			for(int j=0; j<=word.length()-1; j++) {
//				String temp = Character.toString(word.charAt(j));
//				for(int k=1; k<=repeat; k++) {
//					bw.write(temp);					
//				}
//			}
//			bw.write("\n");
//		}
//		bw.flush();
//		bw.close();
//	}
	
	//2908 거꾸로 숫자 크기 비교
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		int a = (A/100) + ((A%100)-(A%10)) + (A%10)*100;
//		int b = (B/100) + ((B%100)-(B%10)) + (B%10)*100;
//		if (a>b) {
//			bw.write(Integer.toString(a));
//		} else {
//			bw.write(Integer.toString(b));
//		}
//		bw.flush();
//		bw.close();
//	}
	
	
	//1316 그룹 단어 체크
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int wordCount = Integer.parseInt(br.readLine());
//		int resultCount = 0;
//		
//		for(int i=1; i<=wordCount; i++) {
//			String word = br.readLine();
//			int[] alphabets = new int [26];
//			for(int j=0; j<word.length(); j++) {
//				alphabets[word.charAt(j)-97] += 1;
//				if(alphabets[word.charAt(j)-97] >= 2 && word.charAt(j-1) != word.charAt(j)) {
//						break;
//				} else if (j == word.length()-1) {
//					resultCount += 1;					
//				}
//			}
//		}		
//		bw.write(Integer.toString(resultCount));
//		bw.flush();
//		bw.close();
//	}

	//1157 많이 사용된 알파벳 찾기
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String word = br.readLine().toUpperCase();
//		int[] alphabets = new int [26];
//		int max = 0;
//		char index = '0';
//		
//		for(int i=0; i<word.length(); i++) {
//			alphabets[word.charAt(i)-65] += 1;
//		}
//		
//		for(int i = 0; i < 26; i ++) {
//			if (max<alphabets[i]) {
//				max = alphabets[i];
//				index = (char)(i+65);
//			} else if(max==alphabets[i]) {
//				index = '?';
//			} 
//		}
//		bw.write(index);
//		bw.flush();
//		bw.close();
//	}
	 
	//10809 ���ĺ� ã��
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		int[] alphabets = new int [26];
//		Arrays.fill(alphabets, -1);
//
//		for(int i=0; i<s.length(); i++) {
//			if (alphabets[s.charAt(i)-97] == -1) {
//				alphabets[s.charAt(i)-97] = i;				
//			}
//		}
//		for(int i : alphabets) {
//			System.out.print(i + " ");
//		}
//	}
	
	//11654 �ƽ�Ű �ڵ�
//	public static void main(Strings[] args) {
//		Scanner scan = new Scanner(System.in);
//		char a  = scan.next().charAt(0);
//		System.out.println((int) a);
//	}
}

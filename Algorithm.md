# Algorithm



## #2557

### 	Hello World 출력하기

```java
public class Main {
    public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

> ``` 
> "Hello World!"
> ```



## #1000

### 	두 정수 A+B값 구하기

```java
import java.util.Scanner;

pulbic class Main {
    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             int A = scan.nextInt();
             int B = scan.nextInt();
             System.out.println(A+B);
    }
}
```

> ```  
> 5 7
> ```
>
> ``` 
> 5 7
> ```



## #7287

### 	내가 맞춘 문제 수와 ID 출력하기

```java
public class Main {
    public static void main(String[] args) {
		System.out.println(3);
		System.out.println("pch7678");
	}
}
```

> ``` 
> 3
> pch7678
> ```



## #10172

### 	강아지 모양 문자열 출력하기

```java
public class Main {
    public static void main(String[] args) {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
}
```

> ``` 
> |\_/ |
> |q p|   /}
> ( 0 )"""\
> |"^"`    |
> ||_/=\\__|
> ```



## #11718

### 여러 줄의 문자열 출력하기

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  		Scanner scan = new Scanner(System.in);
    	while (scan.hasNextLine()) {
      		String input = scan.nextLine();
    		System.out.println(input);
		}
	}
}
```

> 입력=출력
>
> ```
> Hello
> Baekjoon
> Online Judge
> ```



## #10430

### 몫과 나머지 계산하기

- (A+B)%C는 (A%C + B%C)%C 와 같을까?

  (A×B)%C는 (A%C × B%C)%C 와 같을까?

  세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C*B%C)%C);
		}
	}
}
```

> ```
> 5 8 4
> ```
>
> ``` 
> 1
> 1
> 0
> 0
> ```



## #2839

### 설탕 배달 알고리즘 짜기

- 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

  상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

  상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sugar = scan.nextInt();
		int n = -1;
		int a = sugar/5;
		int b = sugar/3;
		boolean check = false;
		
		for (int i = a; i >=0; i--) {
			for (int j = b; j >=0; j--) {
				if (5*i+3*j == sugar) {
					n = i + j;
					check = true;
					break;
				}
			}
		if (check) break;
		}
		System.out.println(n);
	}
```

> ```
> 18
> 4
> 6
> 9
> 11
> ```
>
> ```
> 4
> -1
> 2
> 3
> 3
> ```



### 문제 접근 방식

- 처음에는 주어진 수(int sugar)가 -1로 출력되는 경우와 아닌 경우로 구분하여 생각해보았다.
- 먼저 큰 수인 5로 나누었을 때의 나머지를 a라고 하자. 이 a가 3으로도 나누어 떨어지는 경우에만 봉지의 수가 계산될 수 있다. 

> 1) a = sugar%5 
>
> ​	1-a) a%3 == 0 ... n=sugar/5 + a/3
>
> ​	1-b ) a%3 != 0 ... n=-1

- 그런데 11의 경우, 5로 나눈 나머지가 1이기 때문에 1-b에 해당하여 n=-1이라는 값이 도출된다. 
- 11을 5x1과 3x2로 나누어 생각하려면, 11을 5로 나눈 나머지(2)만 생각할 것이 아니라, 그보다 더 작은 값(1, 0)도 생각해보아야 한다.
- 이때 for문을 사용해야겠다는 생각이 떠올랐다.

> 1) sugar을 5와 3으로 나눈 나머지를 각각 a, b로 둔다.
>
> 2) 큰 수인 a에 대하여 -> 바깥 for문을 구성한다. (int i는 a부터 0까지 점점 작아지도록 설정한다.)
>
> ​	2-a) 작은 수인 b에 대하여 -> 내부 for문을 구성한다. (int j는 b부터 0까지 점점 작아지도록 설정한다.)
>
> ​		for문 내부에서 5*i+3*j=sugar가 되는 경우 (5의 배수 + 3의 배수 조합)를 캐치한다.
>
> ​		이때 i와 j는 각각 5와 3으로 나눈 '몫'에 해당하므로, 곧 설탕 봉지의 개수가 된다.
>
> ​		n = i + j 값을 부여하고  break 한다.

- 그러나 위의 중첩 for문에서 사용한 break에서 문제가 발생했다. 18의 경우, 5x3과 3x1이 되는 경우(n=4)에서 멈추어야 하는데, 5x0과 3x6인 경우까지 진행되어 n이 6으로 출력된 것이다.
- 찾아보니 내부 for문의 break는 바깥 for문에 영향을 주지 못하기 때문에 발생하는 오류였다.
- 따라서 내부 for문에서 원하는 결과물을 찾아낼 경우에 외부 for문까지 break할 수 있도록 임의의 boolean값 check 변수를 설정했다.

> 1) 내부 for문에서 원하는 n값을 도출
>
> 2) check값이 true로 변경
>
> 3) 외부 for문에서 check가 true일 경우 break

- 위와 같은 이중 점검 장치를 통해 n이 최소가 되는 경우를 도출해낼 수 있었다.
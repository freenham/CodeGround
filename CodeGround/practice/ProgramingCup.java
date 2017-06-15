package practice;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class ProgramingCup {
	static int Answer;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			int N = sc.nextInt();
			int temp=N;
			int array[] = new int[N];
			int cnt = 0;
			int max = 0;

			for (int i = 0; i < N; i++)
				array[i] = sc.nextInt();
			Arrays.sort(array);
			for (int i = 0; i < N; i++) {
				if (array[i] + temp-- >= max)
					max = array[i] + (temp+1);
			}
			for (int i = 0; i < N; i++) {
				if (array[i]+N >= max)
					cnt++;
			}
			Answer = cnt;
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
}
import java.util.Scanner;

public class ���_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N+5];
		int[] P = new int[N+5];
		int[] DP = new int[N+5];
		for (int i=0; i<N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		int max = 0; // �ִ� ���ͱ�
		for (int i=0; i<=N; i++) {
			DP[i] = Math.max(DP[i], max);
			DP[i+T[i]] = Math.max(DP[i+T[i]], DP[i]+P[i]);
			max = Math.max(max, DP[i]); // ������� �߿� ���� ū �ָ� ���� ��
		}
		System.out.println(DP[N]);

	}

}

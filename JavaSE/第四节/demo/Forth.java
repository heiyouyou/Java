import java.util.Scanner;
public class Forth
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ¼����Ϣ��������");
		int num = input.nextInt();
		/*����һ��
		String[][] arr = new String[num][];
		for(int i =0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"����Ա��������");
			String name = input.next();
			System.out.print("�������"+(i+1)+"����Ա�����䣺");
			String age = input.next();
			System.out.print("�������"+(i+1)+"����Ա����ߣ�");
			String height = input.next();
			System.out.print("�������"+(i+1)+"����Ա���Ա�");
			String sex = input.next();
			arr[i] = new String[]{name,age,height,sex};
		}
		System.out.println("=====================");
		System.out.println("���\t����\t����\t���\t�Ա�\t");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t"+arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]+"\t");
		}*/
		//��������
		//��������
		int[] arr = new int[num];
		//��������
		String[] nameArr = new String[num];
		//��������
		int[] ageArr = new int[num];
		//�������
		double[] heightArr = new double[num];
		//�Ա�����
		String[] sexArr = new String[num];
		for(int i=0;i<arr.length;i++){ 
			System.out.print("�������"+(i+1)+"����Ա��������");
			String name = input.next();
			nameArr[i] = name; 
			System.out.print("�������"+(i+1)+"����Ա�����䣺");
			int age = input.nextInt();
			ageArr[i] = age;
			System.out.print("�������"+(i+1)+"����Ա����ߣ�");
			double height = input.nextDouble();
			heightArr[i] = height;
			System.out.print("�������"+(i+1)+"����Ա���Ա�");
			String sex = input.next();
			sexArr[i] = sex;
			System.out.println("<------------>");
		}
		System.out.println("<------------>");
		for(int i=0;i<arr.length;i++){
			System.out.println("��"+(i+1)+"����Ա��������"+nameArr[i]+"\n���䣺"+ageArr[i]+"\n��ߣ�"+heightArr[i]+"cm\n�Ա�"+sexArr[i]);
			System.out.println("<------------>");
		}

	}
}
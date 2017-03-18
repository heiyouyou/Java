import java.util.Scanner;
public class Forth
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要录入信息的人数：");
		int num = input.nextInt();
		/*做法一：
		String[][] arr = new String[num][];
		for(int i =0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个人员的姓名：");
			String name = input.next();
			System.out.print("请输入第"+(i+1)+"个人员的年龄：");
			String age = input.next();
			System.out.print("请输入第"+(i+1)+"个人员的身高：");
			String height = input.next();
			System.out.print("请输入第"+(i+1)+"个人员的性别：");
			String sex = input.next();
			arr[i] = new String[]{name,age,height,sex};
		}
		System.out.println("=====================");
		System.out.println("编号\t姓名\t年龄\t身高\t性别\t");
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+"\t"+arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]+"\t");
		}*/
		//做法二：
		//人数数组
		int[] arr = new int[num];
		//名字数组
		String[] nameArr = new String[num];
		//年龄数组
		int[] ageArr = new int[num];
		//身高数组
		double[] heightArr = new double[num];
		//性别数组
		String[] sexArr = new String[num];
		for(int i=0;i<arr.length;i++){ 
			System.out.print("请输入第"+(i+1)+"个人员的姓名：");
			String name = input.next();
			nameArr[i] = name; 
			System.out.print("请输入第"+(i+1)+"个人员的年龄：");
			int age = input.nextInt();
			ageArr[i] = age;
			System.out.print("请输入第"+(i+1)+"个人员的身高：");
			double height = input.nextDouble();
			heightArr[i] = height;
			System.out.print("请输入第"+(i+1)+"个人员的性别：");
			String sex = input.next();
			sexArr[i] = sex;
			System.out.println("<------------>");
		}
		System.out.println("<------------>");
		for(int i=0;i<arr.length;i++){
			System.out.println("第"+(i+1)+"个人员的姓名："+nameArr[i]+"\n年龄："+ageArr[i]+"\n身高："+heightArr[i]+"cm\n性别："+sexArr[i]);
			System.out.println("<------------>");
		}

	}
}
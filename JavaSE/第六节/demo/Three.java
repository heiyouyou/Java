public class Three
{
	public static void main(String[] args){
		//�žų˷���
		System.out.println("����");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
		System.out.println("����");
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
		//�������ֽ�������һ��
		int a = 10;
		int b = 44;
		int c;
		c = a;//c = 10;
		a = b;//a = 44;
		b = c;//b = 10;
		System.out.println(a+"==="+b+"==="+c);//44===10===10
		//�������ֽ�����������
		/*int a = 10;
		int b = 44;
		a = a + b;//a = 44 + 10 = 55
		b = a - b;//b = 54 - 44 = 10
		a = a - b;//a = 55 - 10 = 44 
		System.out.println(a+"==="+b);//44===10*/
	}
} 

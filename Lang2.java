import java.util.*;

// For reference, I utilized MDBG and Google Translate for English to Chinese [simplified] translations

public class Lang2 implements UserPrompts 
{

	public static Scanner invalue = new Scanner(System.in);
	public static int lang;
	
	//@Override
	public int menu() 
	{
	 int selection = 1;
	 
	 System.out.println("\n第 5 章演示程序");
	 System.out.println("行动                   选项");
	 System.out.println("交换两个数字:\t\t1");
	 System.out.println("交换两个数组中的数字:\t2");
	 System.out.println("更改语言:\t\t\t3");
	 System.out.println("重新加载阵列:\t\t4");
	 System.out.println("打印数组:\t\t\t5");
	 System.out.println("退出:\t\t\t0");
	 System.out.print("输入选项:  ");
	 selection = invalue.nextInt();
	 if ((selection < 0) || (selection > 5))
	 {
	  System.out.println("无效的选择，故意违约，交换两个数字");
	  selection = 1;
	 }
		return selection;
	}

//	@Override
	public int idSwapNrs(int[] intlist) 
	{
	 int itemindex = 0;
	 System.out.print("\n输入要交换的数量指标: ");
	 itemindex = invalue.nextInt();
	 if ((itemindex < 0) || (itemindex > 19))
	 {
		System.out.println("默认情况下将索引为 3 的输入无效");
		itemindex = 3;
	 }
		return itemindex;
	}

//	@Override
	public String printHeader() 
	{
		String headstring = new String("数组");
		// TODO Auto-generated method stub
		return headstring;
	} // end of header string

//	@Override
	public String beforeSwap() 
	{
		String localstring = "\n ...交换前...";
		return localstring;
	}  // end of beforeSwap

//	@Override
	public String afterSwap() {
		String localstring = "\n ...换用之后...";
		return localstring;
	} // end of afterSwap
	
	
	public int changeLanguage() {
		System.out.println("对于英语，输入0");
		System.out.println("对于挪威，输入1.");
		lang = invalue.nextInt();
		return lang;
	}// end of changeLanguage

}

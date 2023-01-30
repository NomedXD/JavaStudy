import java.util.Date;
public class First{
	public static void main(String[] args)
	{
		Date curr = new Date();
		System.out.printf("Hello Ivan! Today is %s\n",curr);
		System.out.printf("Hello %s! Today is %s",args[0],args[1]);
	}
}


public class Sample {

	public static void main(String[] args) {
		String Words="Wellcome";
		String Word=Words.toLowerCase();
		char[] array=Word.toCharArray();
		int Wcount=0;
		int Ccount=0;
		String w=null;
		String c=null;
		for(char ret:array)
		{
			if(ret=='a'||ret=='e'||ret=='i'||ret=='o'||ret=='u')
			{
			Wcount++;
			w=w+ret;
			
			}
			else
			{
				Ccount++;
				c=c+ret;
			}
			
			
		}
		
		System.out.println("Wovel count="+Wcount+"="+w);
		System.out.println("Consonent count="+Ccount+"="+c);

for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("*"+" ");
}
System.out.println("");
}


	}

}

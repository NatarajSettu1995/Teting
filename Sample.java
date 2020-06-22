

public class Sample {

	public static void main(String[] args) {
		String Words="Wellcomes";
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

	}

}

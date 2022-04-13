
public class runner
{

	public static void main(String[] args) 
	{
	
//		
//		ILamda ilam=()->{ 
//			System.out.println("implementation is done");
//		};
//		ilam.m1();
		
		ILamda ilam=new ILamda()
		{

			@Override
			public void m1() 
			{
				System.out.println("IMPLEMENTATION IS DONE");
				
			}
			
			
		};
		ilam.m1();
		
	}

	}



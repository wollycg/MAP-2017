
public class Giant
{	
	public static final String Giant = null;
	public Giant(){
		m_id = s_next++;
	}
	
	public final void fee(){
		System.out.print(m_id);
		System.out.print("-fee");
	}
	
	public final void phi(){
		System.out.print(m_id);
		System.out.print("-phi");
	}
	
	public final void pheaux(){
		System.out.print(m_id);
		System.out.print("-pheaux");
	}
	
	private int m_id;
	private static int s_next = 0;
	public static Object fee;
	public static Object pheaux;
	public static Object phi;
}



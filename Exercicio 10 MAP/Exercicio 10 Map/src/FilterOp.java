import java.awt.Image;

public abstract class FilterOp 
{
	private FilterOp nextOp;

	public FilterOp nextOp (FilterOp o)
	{
		nextOp = o;
		return o;
	}
	
	public void apply(Image img) throws FilterError
	{
		op(img);
		nextOp.apply(img);
	}
	
	public abstract void op(Image i) throws FilterError;


}

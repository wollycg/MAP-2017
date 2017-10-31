
public class FabricaDeFiltros 
{	
	public FilterOp gotham(){
		FilterOp f = new Modulate(120, 10, 100);
		f.nextOp(new Fill("#222b6d"))
		.nextOp(new Colorize(20))
		.nextOp(new Gama(0.5))
		.nextOp(new Contrast());
		return f;
	}
	public FilterOp sky(){
		FilterOp s = new Modulate(130, 18, 105);
		f.nextOp(new Fill("#256b7h"))
		.nextOp(new Colorize(10))
		.nextOp(new Gama(0.9))
		.nextOp(new Contrast());
		return s;
	}

}

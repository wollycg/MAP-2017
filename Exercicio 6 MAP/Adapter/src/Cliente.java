

public class Cliente 
{	
	public static void main(String []args)
	{
		Imagem imagem = new ImagemBMP();
		ImagemTarget img = new ImagemAdapter(imagem);
		imagem.carregarImagem();
		img.desenharImagem();
	      
	       
	      
	    
	}

}

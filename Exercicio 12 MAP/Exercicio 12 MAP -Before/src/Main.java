import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList que = new LinkedList();
		Giant[] input = enque.Type;
		
		for (int i = 0; i < 6; i++){
			que.enque(input[i]);
		}
		
		for (int i = 0; i < 6; i++){
			bad_guy = que.deque();
			
			if (bad_guy.get_type() == Giant.fee){
				bad_guy.free();
			}
			else if(bad_guy.get_type() == Giant.phi){
				bad_guy.phi();
			}
			else if(bad_guy.get_type() == Giant.pheaux){
				bad_guy.pheaux();
			}
		}
		System.out.print('\n');
	}
}

import java.util.*;

public class Main {

	
		public static void main(String[] args) {
			Queue q = new Queue();
			
			Command [] input = new Command(new Giant(), Giant.fee);
			Command [] input = new Command(new Giant(), Giant.phi);
			Command [] input = new Command(new Giant(), Giant.pheaux);
			Command [] input = new Command(new Giant(), Giant.fee);
			Command [] input = new Command(new Giant(), Giant.phi);
			Command [] input = new Command(new Giant(), Giant.pheaux);
			
			for (int i = 0; i < 6; i++){
				q.enque(input[i]);
			}
			
			for (int i = 0; i < 6; i++){
				q.deque(input[i]);
			}
			
			System.out.print('\n');
			}
}

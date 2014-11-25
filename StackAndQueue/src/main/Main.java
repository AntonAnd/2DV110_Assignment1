package main;

public class Main {

	public static void main(String[] args) {
		
	}

	public Main(String file){
		if(file == null){
			throw new NullPointerException();
		}
		else{
			constructQueue(file);
		}
	}

	
	public QueueClass<String> constructQueue(String jsonFileName){
		QueueClass<String> queue = new QueueClass<String>();
		return queue;
	}
}

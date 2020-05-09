public class FirstAttempt{

	public static void main(String[] args) {
		JokeBank joke = new JokeBank();
		System.out.println("The following jokes are for your laughing pleasure");

		for (int i=0;i<6; i++) {
			System.out.println();
			System.out.println(joke.jokeList[i][0]);
			System.out.println("^" + joke.jokeList[i][1]);
		}
	
	}

}



class Methods3
{
	public static void displayHighposition(String playerName,int highScore)
	{
		System.out.println(playerName+"managed to get into postion  " + highScore+ " " + "on the high score table");
	}
	public static int CalculateHighScore(int plascore)
	{
		if (plascore>1000) {
			return 1;
		}
		else if (plascore>500 && plascore<1000) {
			return 2;
		}
		else if (plascore >100 && plascore<500) {
			return 3;
		}
		else
		{
			return 4;
		}
	}
public static void main(String...ru)
{
	int highScore1 =CalculateHighScore(1500);
    displayHighposition("Rupesh",highScore1);
    highScore1 =CalculateHighScore(900);
    displayHighposition("Sandeep",highScore1);
    highScore1 = CalculateHighScore(400);
    displayHighposition("Harshit",highScore1);
    highScore1 = CalculateHighScore(50);
    displayHighposition("Soundarya",highScore1);

}

}

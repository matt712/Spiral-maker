package package1;
public class SpiralMaker 
{
	public SpiralMaker()
	{
	}
	public void makeSpiralAnticlockwise(int number, boolean isClockwise)
	{
		int direction = 0;
		int rotations = 0;
		int doIBump = 0;
		int[][]spiralMatrix = new int[number][number];
		for (int i=0; i<(number*number); i++)
		{
				if(direction%4 == 0)
				{
					spiralMatrix[doIBump][rotations] = i+1;
					doIBump++;
					if(doIBump==(number-rotations))
					{
							direction++;
							doIBump = rotations+1;
					}
				}
			else if(direction%4 == 1)
			{
			spiralMatrix[number - rotations - 1][doIBump] = i+1;
			doIBump++;
			if(doIBump==(number-rotations))
				{
					direction++;
					doIBump = rotations+1;	
				}
			}
			else if(direction%4 == 2)
			{	
				spiralMatrix[number - doIBump-1][number-1-rotations] = i+1;
				doIBump++;
				if(doIBump==(number-rotations))
				{
					direction++;
					doIBump = rotations+2;
				}
			}
			else if(direction%4==3)
			{
				spiralMatrix[rotations][number - doIBump] = i+1;
				doIBump++;
				if(doIBump==(number-rotations))
				{
					doIBump = rotations+1;
					direction = 0;
					rotations++;
				}
			}
		}
		for (int i=0; i<number; i++)
		{
			for(int j=0; j<number; j++)
				{
					if(isClockwise)
					{
						System.out.print(spiralMatrix[j][i] + " ");
					}
					else
					{
						System.out.print(spiralMatrix[i][j] + " ");
					}
				}
				System.out.println(" ");
			}
		}
}
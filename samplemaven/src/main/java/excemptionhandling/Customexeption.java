package excemptionhandling;

public class Customexeption {

	public static void main(String[] args) throws VotingException, AgeException {
		int age=16;
		if (age>18)
		{
			System.out.println("eligible for voting");
		}
			else
			{
				throw new AgeException("age under 18");
			}
			
		}
	

	}


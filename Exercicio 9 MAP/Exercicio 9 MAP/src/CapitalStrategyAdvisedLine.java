
public class CapitalStrategyAdvisedLine extends CapitalStrategy
{
	public double capital(Loan loan){
        return (loan).getCommitment() * loan.getUnusedPercentage();
	}
}

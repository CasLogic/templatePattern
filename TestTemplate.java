package template;

public class TestTemplate {
	public static void main(String[] args) {
		CellularRespiration humanCell = new CellularRespiration();
		DNAreplication DNA = new DNAreplication();
		humanCell.goThroughSteps(); //Goes through the identify, 3 steps, steps finished
		System.out.println("**************************************");
		DNA.goThroughSteps();
	}

}

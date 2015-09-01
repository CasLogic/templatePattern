package template;
//Casius Carter
//4/14/14
//Template Pattern 

abstract class AbstractClass { //Abstract class 
	public void goThroughSteps() {//Go through all methods
		identify();
		stepOne();
		stepTwo();
		stepThree();
		stepsFinished();
	}
	abstract void identify();
	abstract void stepOne();
	abstract void stepTwo();
	abstract void stepThree();
	void stepsFinished(){ // Says all steps are finished
		System.out.println("All Steps are Finished");
	}
}

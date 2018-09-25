package ClassesAndObjects;

public class MethodsExample {

	public static void main(String[] args) {
		MethodsExample methodsExampleObj = new MethodsExample();
		System.out.println(methodsExampleObj.computePayment(100000, 10, 150000, 10));
	}

	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
		double interest = rate / 100.0;
		double partial1 = Math.pow((1 + interest), -numPeriods);
		double denominator = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		return answer;
	}

}

package model;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Feb 6, 2023
 */
public class TotalOfNumbers {

	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;
	private int total;
	/**
	 * 
	 */
	public TotalOfNumbers() {
		super();
	}
	/**
	 * @param firstNumber
	 * @param secondNumber
	 */
	public TotalOfNumbers(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		findTotal(firstNumber,secondNumber);
	}
	public TotalOfNumbers(int firstNumber, int secondNumber, int thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
		findTotalOf3Num(firstNumber,secondNumber,thirdNumber);
	}
	/**
	 * @return the firstNumber
	 */
	public int getFirstNumber() {
		return firstNumber;
	}
	/**
	 * @param firstNumber the firstNumber to set
	 */
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	/**
	 * @return the secondNumber
	 */
	public int getSecondNumber() {
		return secondNumber;
	}
	/**
	 * @param secondNumber the secondNumber to set
	 */
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	/**
	 * @return the thirdNumber
	 */
	public int getThirdNumber() {
		return thirdNumber;
	}
	/**
	 * @param thirdNumber the thirdNumber to set
	 */
	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	public void findTotal(int firstNumber, int secondNumber) {
		total = firstNumber + secondNumber;
		setTotal(total);
	}
		
	public void findTotalOf3Num(int firstNumber, int secondNumber, int thirdNumber) {
		total = firstNumber + secondNumber + thirdNumber;
		setTotal(total);
	}
	@Override
	public String toString() {
		return "TotalOfNumbers [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", total=" + total
				+ "]";
	}
	
	public String toString3Num() {
		return "TotalOfNumbers [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", thirdNumber=" + thirdNumber + ", total=" + total
				+ "]";
	}
}

package bankaccountapp;

public interface IBaseRate {

	// Methods to implement common base rates
	// Write a method that returns base rate

	default double getBaseRate() {
		return 2.5;
	}

}

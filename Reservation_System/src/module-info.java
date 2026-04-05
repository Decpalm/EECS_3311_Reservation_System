/**
 * 
 */
/**
 * 
 */
module reservation {
	requires java.desktop;
	requires junit;
	requires org.junit.jupiter.api;
	
	opens randoop to junit;
	opens manual to junit;
}
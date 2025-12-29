package Workshop_7;

public class GradeCalculatorsinjava {
	
    public char calculateGrade(int score) {
    	if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100 MAKE SURE");
            
        }
    	if (score >= 90) {
    		return 'A';
    		} else if (score >= 80) {
    			return 'B';
    			} else if (score >= 70) {
    				return 'C';
    				} else if (score >= 60) {
    					return 'D';
    					} else {
    						return 'F';
    						}
    	}
}
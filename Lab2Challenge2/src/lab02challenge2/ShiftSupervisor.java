
package lab02challenge2;


public class ShiftSupervisor extends Employee{
    private String annualSalary;
    private String bonus;
    
    
    
    public ShiftSupervisor(String employeeName,String employeeNumber,String hireDate,String annualSalary, String bonus){
        super(employeeName,employeeNumber,hireDate);
        
        
        int flag = Validate(annualSalary, bonus);
        
        
        if (flag == 0) {
        System.out.println("Not a valid entry, please restart and try again.");
        System.exit(0);
        }
        this.annualSalary = annualSalary;
        this.bonus = bonus;
        
    
    
    }

    /**
     * @return the annualSalary
     */
    public String getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the bonus
     */
    public String getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    private int Validate(String annualSalary, String bonus) {
        
        try{
        @SuppressWarnings("unused")
		double aS = Double.parseDouble(annualSalary);
        @SuppressWarnings("unused")
		double b = Double.parseDouble(bonus);
        
        } catch(NumberFormatException e){
        
        return 0;
        
        }
        double aS = Double.parseDouble(annualSalary);
        double b = Double.parseDouble(bonus);
        
        
        
        if (aS < 1 || b < 1){
        
            return 0;
            
        }
        

        return 1;
    }
    
    
    
}

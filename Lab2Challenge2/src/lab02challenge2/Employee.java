
package lab02challenge2;

import java.util.Arrays;
import java.util.List;



public class Employee {
    
    private String employeeName;
    private String employeeNumber;
    private String hireDate;
    
    

    public Employee(String employeeName,String employeeNumber,String hireDate){
        
        int flag = validation(employeeName,employeeNumber,hireDate);
        
        if (flag == 0) {
        System.out.println("Not a valid entry, please restart and try again.");
        System.exit(0);
        }
        
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;

    
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeNumber
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * @return the hireDate
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    private int validation(String employeeName, String employeeNumber, String hireDate) {
        String[] emNum = employeeNumber.split("-");
        String[] hrDt = hireDate.split("-");
        if ("".equals(employeeName)){
        
            return 0;
            
        }
        if ("".equals(emNum[0])){
        
            return 0;
            
        }
        
        if ("".equals(hrDt[0])){
        
            return 0;
        
        }
        
        try {
            @SuppressWarnings("unused")
			int firstPartOfEmNum = Integer.parseInt(emNum[0]);

        } catch (NumberFormatException e) {
            
            return 0;

        }
        
        int firstPartOfEmNum = Integer.parseInt(emNum[0]);
        
        if (firstPartOfEmNum > 999 == true) {
            
            return 0;

        }

        

        List<String> chars = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "g", "j", "k", "l");

        if (chars.contains((emNum[1].toLowerCase())) == false) {
            return 0;
        }

        if (hrDt.length == 3){
        
            if(Integer.parseInt(hrDt[0]) > 12 || Integer.parseInt(hrDt[0]) < 1){
            
                return 0;
            }
            if(Integer.parseInt(hrDt[1]) > 31 || Integer.parseInt(hrDt[1]) < 1){
            
                return 0;
            }
            if(Integer.parseInt(hrDt[2]) > 99 || Integer.parseInt(hrDt[2]) < 1){
            
                return 0;
            }
            return 1;
        }    
        else{
            
            return 0;
            
        }
        
        }

        
        
    
    
    
    
    
    
}

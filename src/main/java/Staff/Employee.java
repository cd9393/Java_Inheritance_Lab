package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }else {
            this.name = name;
        }
    }


    public String getNiNumber() {
        return niNumber;
    }


    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double wageIncrease){
        if(wageIncrease < 0 ){
            throw new IllegalArgumentException("Wage increase must be positive");
        }else {
            this.salary += wageIncrease;
        }
    }

    public int payBonus(){
        return (this.salary / 100);
    }

}

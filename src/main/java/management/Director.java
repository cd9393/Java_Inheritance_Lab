package management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, int salary, String deptName, Double budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public int payBonus(){
        return (getSalary() / 50);
    }
}


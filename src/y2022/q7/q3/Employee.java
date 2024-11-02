package y2022.q7.q3;

public class Employee {
    private String name;
    private double hourlyRate;
    private double hoursWork;

    public Employee(String name, double hourlyRate, double hoursWork) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
    }

    public double calculatePaycheck(){
        if(hoursWork <= 40){
            return hoursWork * hourlyRate;
        }else{
            double nonOvertime = 40 * hourlyRate;
            double overtime = (hoursWork - 40) * hourlyRate;
        }
        return calculatePaycheck();
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWork(double hoursWork) {
        this.hoursWork = hoursWork;
    }
}

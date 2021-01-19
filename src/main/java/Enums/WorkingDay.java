package Enums;

public class WorkingDay {

    private String employeeName;
    private String month;
    private int time;
    private Week W;

    public WorkingDay(String employeeName, String month, int time, Week w) {
        this.employeeName = employeeName;
        this.month = month;
        this.time = time;
        W = w;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Week getW() {
        return W;
    }

    public void setW(Week w) {
        W = w;
    }
}

package com.company;


//The second Machine should produce the bill
//a check-out time between 1pm and 11pm should randomly be created.



public abstract class MachineTwo {
    private double hourlyRate;
    private double flatRate;
    private double lostRate;

    public MachineTwo(double hourlyRate, double flatRate, double lostRate) {
        this.hourlyRate = hourlyRate;
        this.flatRate = flatRate;
        this.lostRate = lostRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getFlatRate() {
        return flatRate;
    }

    public void setFlatRate(double flatRate) {
        this.flatRate = flatRate;
    }

    public double getLostRate() {
        return lostRate;
    }

    public void setLostRate(double lostRate) {
        this.lostRate = lostRate;
    }

}

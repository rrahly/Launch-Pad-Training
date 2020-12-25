package com.designpattern.prototype;

public class Associate extends Employee{
    private String schedule;

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Associate{" +
                "schedule='" + schedule + '\'' +
                '}';
    }
}

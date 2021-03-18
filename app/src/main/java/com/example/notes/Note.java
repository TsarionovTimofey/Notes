package com.example.notes;

public class Note {
    private int id;
    private String title;
    private String description;
    private int dayOfTheWeek;
    private int priority;

    public Note(int id, String title, String description, int dayOfTheWeek, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dayOfTheWeek = dayOfTheWeek;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public int getPriority() {
        return priority;
    }

    public static String getDayAsString(int position) {
        switch (position) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            default:
                return "Воскресенье";
        }
    }
}

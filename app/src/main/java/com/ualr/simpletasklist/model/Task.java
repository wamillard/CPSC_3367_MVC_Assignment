package com.ualr.simpletasklist.model;

import android.widget.EditText;

public class Task
{
    private String taskDescription;
    private Boolean taskCompleted;

    public Task(String newtaskDescription)
    {
        this.taskDescription = newtaskDescription;
        this.taskCompleted=false;
    }

    public Task(String newtaskDescription, Boolean newtaskCompleted)
    {
        this.taskDescription = newtaskDescription;
        this.taskCompleted = newtaskCompleted;
    }
    public String getTaskDescription()
    {
        return this.taskDescription;
    }

    public void setTaskDescription(String newtaskDescription)
    {
        this.taskDescription = newtaskDescription;
    }

    public Boolean getTaskCompleted()
    {
        return this.taskCompleted;
    }

    public void setTaskCompleted()
    {
        this.taskCompleted = true;
    }


}

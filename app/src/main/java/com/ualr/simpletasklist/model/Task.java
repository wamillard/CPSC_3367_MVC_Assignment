package com.ualr.simpletasklist.model;

import android.widget.EditText;

public class Task
{
    private EditText taskDescription;
    private Boolean taskCompleted;

    public Task(EditText taskDescription)
    {
        this.taskDescription = taskDescription;
        this.taskCompleted=false;
    }

    public Task(EditText taskDescription, Boolean taskCompleted)
    {
        this.taskDescription = taskDescription;
        this.taskCompleted = taskCompleted;
    }
    public EditText getTaskDescription()
    {
        return taskDescription;
    }

    public void setTaskDescription(EditText taskDescription)
    {
        this.taskDescription = taskDescription;
    }

    public Boolean getTaskCompleted()
    {
        return taskCompleted;
    }

    public void setTaskCompleted(Boolean taskCompleted)
    {
        this.taskCompleted = taskCompleted;
    }


}

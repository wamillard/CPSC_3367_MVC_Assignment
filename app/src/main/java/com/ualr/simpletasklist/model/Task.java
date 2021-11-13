package com.ualr.simpletasklist.model;

import android.widget.EditText;

public class Task
{
    private EditText taskDescription;
    private Boolean taskCompleted;

    public Task(EditText newtaskDescription)
    {
        this.taskDescription = newtaskDescription;
        this.taskCompleted=false;
    }

    public Task(EditText newtaskDescription, Boolean newtaskCompleted)
    {
        this.taskDescription = newtaskDescription;
        this.taskCompleted = newtaskCompleted;
    }
    public EditText getTaskDescription()
    {
        return taskDescription;
    }

    public void setTaskDescription(EditText newtaskDescription)
    {
        this.taskDescription = newtaskDescription;
    }

    public Boolean getTaskCompleted()
    {
        return taskCompleted;
    }

    public void setTaskCompleted()
    {
        this.taskCompleted = true;
    }


}

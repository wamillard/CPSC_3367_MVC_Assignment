package com.ualr.simpletasklist.model;

import android.widget.EditText;

import java.util.HashMap;

public class TaskList
{
    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    private HashMap<Integer, Task> tasks;


    // TODO 04. Define the class constructor and the corresponding getters and setters.

    public TaskList()
    {
        this.tasks = new HashMap<>();
    }

    public Integer getNextKey()
    {
        return this.tasks.size()+1;
    }

    public void setKey(Integer newKey)
    {
        this.tasks.put(newKey-1,this.tasks.get(newKey));
    }

    public String getTask(Integer key)
    {
        try
        {
            return this.tasks.get(key).getTaskDescription();
        } catch (NullPointerException e)
        {
            return "";
        }

    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    public Integer getSize()
    {
        return this.tasks.size();
    }

    public void addTask(Integer newID, String newTaskDescription)
    {
        this.tasks.put(newID, new Task(newTaskDescription));

    }

    public void addTask(Integer newID, String newTaskDescription, Boolean newStatus)
    {
        this.tasks.put(newID, new Task(newTaskDescription, newStatus));
    }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    @Override
    public String toString()
    {
        String fullList= new String();

        if (tasks.isEmpty())
        {
            fullList= "No tasks";
        } else
        {
            for (Integer i=1; i<= tasks.size(); i++)
            {
                fullList=fullList.concat(i.toString()).concat(". ").concat(this.tasks.get(i).getTaskDescription());

                if (this.tasks.get(i).getTaskCompleted())
                {
                    fullList=fullList.concat(" -Done");
                }

                fullList=fullList.concat("\n");

            }

        }

        return fullList;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    public void deleteTask(Integer key)
    {
        Integer currSize=this.tasks.size();

        this.tasks.remove(key);

        if (key<currSize)
        {
            for (Integer i=1; key+i<=currSize;i++)
            {
                setKey(i+key);
            }
            this.tasks.remove(this.tasks.size());
        }

        return;
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

    public void markDone(Integer key)
    {
        this.tasks.get(key).setTaskCompleted();

    }

}

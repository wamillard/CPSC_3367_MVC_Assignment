package com.ualr.simpletasklist.model;

import java.util.HashMap;
import java.util.Map;

public class TaskList
{
    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    private HashMap<Integer, Task> loggedTasks;


    // TODO 04. Define the class constructor and the corresponding getters and setters.

    public TaskList()
    {
        HashMap loggedTasks = new HashMap<>();
    }

    public HashMap getTaskList()
    {
        return loggedTasks;
    }

    public Task getTaskList(Integer key)
    {
        return loggedTasks.get(key);
    }

    public void setTaskList(Task newTask)
    {


    }

// TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    public void addTask(Task newTask)
    {
        this.loggedTasks.put(loggedTasks.size()+1,newTask);
    }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    public String allTasks()
    {
        String fullList= new String();

        if (loggedTasks.size()==0)
        {
            fullList.concat("No tasks");
        } else
        {
            for (Integer i = 1; i <= loggedTasks.size(); i++)
            {
                fullList.concat(i.toString() + ". " + loggedTasks.get(i).getTaskDescription());

                if (loggedTasks.get(i).getTaskCompleted()==true)
                {
                    fullList.concat("- Done\n");
                } else
                {
                    fullList.concat("\n");
                }
            }
        }

        return fullList;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    public void deleteTask(Integer key)
    {
        loggedTasks.remove(key);

        return;

    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

    public void markDone(Integer key)
    {
        loggedTasks.get(key).setTaskCompleted();

    }

}

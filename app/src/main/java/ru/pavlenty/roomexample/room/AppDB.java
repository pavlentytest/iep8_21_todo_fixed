package ru.pavlenty.roomexample.room;

import androidx.room.Database;
import androidx.room.PrimaryKey;
import androidx.room.RoomDatabase;
import ru.pavlenty.roomexample.room.Task;
import ru.pavlenty.roomexample.room.TaskDao;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDB extends RoomDatabase {
    // инит-ия таблицы в БД
    public abstract TaskDao taskDao();

}
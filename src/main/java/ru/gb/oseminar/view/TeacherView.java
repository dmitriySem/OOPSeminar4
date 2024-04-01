package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    Logger logger = Logger.getLogger(StudentView.class.getName());
    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }
}

package com.bhinfocenter.project.dao;

import com.bhinfocenter.project.pojo.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("projectDao")
public interface ProjectDao {

    void addProject(Project project);
    void deleteProject(Long projectID);
    void updateProject(Project project);
    Project getByID(Long projectID);
    List<Project> getByDim(Project project);
    List<Project> getAll();
}

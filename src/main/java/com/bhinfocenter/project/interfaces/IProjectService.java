package com.bhinfocenter.project.interfaces;

import com.bhinfocenter.project.pojo.Project;

import java.util.List;

public interface IProjectService {
    void addProject(Project project);
    void deleteProject(Long projectID);
    void updateProject(Project project);
    Project getByID(Long projectID);
    List<Project> getByDim(Project project);
    List<Project> getAll();
}

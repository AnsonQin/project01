package com.bhinfocenter.project.service;

import com.bhinfocenter.project.dao.ProjectDao;
import com.bhinfocenter.project.interfaces.IProjectService;
import com.bhinfocenter.project.pojo.Project;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("projectService")
public class ProjectService implements IProjectService {
    @Resource

    private ProjectDao projectDao;
    @Override
    public void addProject(Project project) {
        projectDao.addProject(project);
    }

    @Override
    public void deleteProject(Long projectID) {
        projectDao.deleteProject(projectID);
    }

    @Override
    public void updateProject(Project project) {
        projectDao.updateProject(project);
    }

    @Override
    public Project getByID(Long projectID) {
        return projectDao.getByID(projectID);
    }

    @Override
    public List<Project> getByDim(Project pro) {

        return projectDao.getByDim(pro);
    }

    @Override
    public List<Project> getAll() {
        return projectDao.getAll();
    }

}

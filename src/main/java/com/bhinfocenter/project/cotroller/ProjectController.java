package com.bhinfocenter.project.cotroller;

import com.bhinfocenter.project.interfaces.IProjectService;
import com.bhinfocenter.project.pojo.Project;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Resource
    IProjectService projectService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> addProject(@RequestBody Project project) {
        Map<String,Object> result = new HashMap<String,Object>();

        projectService.addProject(project);

        result.put("status", "success");
        return result;
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Map<String, Object> deleteProject(@PathVariable("id") Long projectID) {
        Map<String,Object> result = new HashMap<String,Object>();
        projectService.deleteProject(projectID);

        result.put("status", "success");
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String, Object> updateProject(@RequestBody Project project) {
        Map<String,Object> result = new HashMap<String,Object>();
        projectService.updateProject(project);

        result.put("status", "success");
        return result;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Map<String, Object> getByID(@PathVariable("id") Long projectID) {
        Map<String,Object> result = new HashMap<String,Object>();
        Project project = projectService.getByID(projectID);

        result.put("status", "success");
        result.put("data", project);
        return result;
    }

    @RequestMapping(value = "dim/{dim}" ,method = RequestMethod.GET)
    public Map<String, Object> getByDim(@PathVariable("dim") String dim) {
        Map<String,Object> result = new HashMap<String,Object>();
        Project pro = new Project();
        pro.setProjectName(dim);
        pro.setProjectCode(dim);
        pro.setProjectStatus(dim);
        pro.setProjectType(dim);

        List<Project> projects = projectService.getByDim(pro);

        result.put("status", "success");
        result.put("data", projects);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> getAll() {
        Map<String,Object> result = new HashMap<String,Object>();
        List<Project> projects = projectService.getAll();

        result.put("status", "success");
        result.put("data", projects);
        return result;
    }
}

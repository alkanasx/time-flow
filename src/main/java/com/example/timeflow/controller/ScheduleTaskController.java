package com.example.timeflow.controller;

import com.example.timeflow.entity.ScheduleTask;
import com.example.timeflow.repository.ScheduleTaskRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController//rest接口器：提示spring boot处理网页请求
@RequestMapping("/api/tasks")//控制器基础地址
public class ScheduleTaskController {

    private final ScheduleTaskRepository repository;//将接口写成变量，后续方便调用

    public ScheduleTaskController(ScheduleTaskRepository repository) {
        this.repository = repository;
    }//依赖注入，controller必须和interface绑定，前者不能随意调用后者方法

    // 查看所有任务
    @GetMapping
    public List<ScheduleTask> getAll() {
        return repository.findAll();
    }

    // 查看单个任务
    @GetMapping("/{id}")
    public ScheduleTask getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // 创建任务
    @PostMapping
    public ScheduleTask create(@RequestBody ScheduleTask task) {
        return repository.save(task);
    }
    //@RequestBody从body中选取对象转成java对象
    //save保存任务

    // 修改任务
    @PutMapping("/{id}")
    public ScheduleTask update(@PathVariable Long id, @RequestBody ScheduleTask task) {
        task.setId(id);
        return repository.save(task);
    }
    //@PathVariable：从地址路径里取值

    // 删除任务
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}


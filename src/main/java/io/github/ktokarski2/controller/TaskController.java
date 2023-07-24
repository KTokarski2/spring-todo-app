package io.github.ktokarski2.controller;

import io.github.ktokarski2.model.Task;
import io.github.ktokarski2.model.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RepositoryRestController
class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    private final TaskRepository repository;

    TaskController(final TaskRepository repository) {
        this.repository = repository;
    }

    //ResponseEntity<?>
    List<Task> readAllTasks() {
        logger.warn("Exposing all the tasks");
        return repository.findAll();
    }
}

package io.github.ktokarski2.adapter;

import io.github.ktokarski2.model.Project;
import io.github.ktokarski2.model.ProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query("select distinct p from Project p join fetch p.groups")
    List<Project> findAll();
}

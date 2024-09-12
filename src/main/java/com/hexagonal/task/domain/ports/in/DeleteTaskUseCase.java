package com.hexagonal.task.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}

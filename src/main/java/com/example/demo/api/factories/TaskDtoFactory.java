package com.example.demo.api.factories;

import com.example.demo.api.dto.TaskDto;
import com.example.demo.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity){
        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createDate(entity.getCreateDate())
                .description(entity.getDescription())
                .build();
    }
}

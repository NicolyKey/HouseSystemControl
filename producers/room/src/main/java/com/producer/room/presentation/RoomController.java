package com.producer.room.presentation;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
@Tag(name = ApiDocConstants.Controller.CONFIG_CONTROLLER_NAME, description = ApiDocConstants.Controller.CONFIG_CONTROLLER_DESCRIPTION)
public class RoomController {

    private static final String TASK_ROUTE = "/task";

}

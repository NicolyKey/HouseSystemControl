package com.producer.gate.presentation;

import com.producer.gate.usecases.createGate.CreateGateRequest;
import com.producer.gate.usecases.createGate.CreateGateUseCase;
import com.producer.gate.usecases.createTask.CreateTaskRequest;
import com.producer.gate.usecases.createTask.CreateTaskUseCase;
import com.producer.gate.usecases.getGates.GetGatesRequest;
import com.producer.gate.usecases.getGates.GetGatesResponse;
import com.producer.gate.usecases.getGates.GetGatesUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gates")
@RequiredArgsConstructor
@Tag(name = ApiDocConstants.Controller.CONFIG_CONTROLLER_NAME, description = ApiDocConstants.Controller.CONFIG_CONTROLLER_DESCRIPTION)
public class GateController {

    private static final String TASK_ROUTE = "/task";

    private final GetGatesUseCase getGatesUseCase;
    private final CreateGateUseCase createGateUseCase;
    private final CreateTaskUseCase createTaskUseCase;

    public GateController(GetGatesUseCase getGatesUseCase, CreateGateUseCase createGateUseCase, CreateTaskUseCase createTaskUseCase) {
        this.getGatesUseCase = getGatesUseCase;
        this.createGateUseCase = createGateUseCase;
        this.createTaskUseCase = createTaskUseCase;
    }


    @GetMapping
    @Operation(
            summary = ApiDocConstants.Gate.GET_GATES_SUMMARY,
            description = ApiDocConstants.Gate.GET_GATES_DESCRIPTION
    )
    ResponseEntity<GetGatesResponse> getGates(GetGatesRequest request) {
        GetGatesResponse response = getGatesUseCase.execute(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Operation(
            summary = ApiDocConstants.Gate.CREATE_GATE_SUMMARY,
            description = ApiDocConstants.Gate.CREATE_GATE_DESCRIPTION
    )
    ResponseEntity<Void> createGate(CreateGateRequest request) {
        createGateUseCase.execute(request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(TASK_ROUTE)
    @Operation(
            summary = ApiDocConstants.Gate.CREATE_TASK_SUMMARY,
            description = ApiDocConstants.Gate.CREATE_TASK_DESCRIPTION
    )
    ResponseEntity<Void> createTask(CreateTaskRequest request){
        createTaskUseCase.execute(request);
        return ResponseEntity.noContent().build();
    }
}

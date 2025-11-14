package com.producer.gate.usecases.getGates;

import com.producer.gate.entities.Gate;
import com.producer.gate.repositories.GateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetGatesUseCase {

    private final GateRepository gateRepository;

    public GetGatesResponse execute(GetGatesRequest request){
        Pageable pageable = PageRequest.of(request.getPage(), request.getPageSize(), Sort.by("createdAt").descending());
        Page<Gate> gatesPage = gateRepository.findAll(pageable);

        return GetGatesResponse.builder()
                .gates(gatesPage.getContent())
                .totalPages(gatesPage.getTotalPages())
                .build();
    }
}

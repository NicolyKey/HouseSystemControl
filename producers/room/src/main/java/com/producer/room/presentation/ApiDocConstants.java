package com.producer.room.presentation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiDocConstants {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class Controller {

        public static final String CONFIG_CONTROLLER_NAME = "portões";
        public static final String CONFIG_CONTROLLER_DESCRIPTION = "Controller responsável pelos comandos direcionados a portões";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class Gate{
        public static final String GET_GATES_SUMMARY = "Retorna a lista de portões paginada";
        public static final String GET_GATES_DESCRIPTION = "Permite consultar todos os portões cadastrados, com paginação e filtros opcionais.";

        public static final String CREATE_GATE_SUMMARY = "Cria um novo portão";
        public static final String CREATE_GATE_DESCRIPTION = "Recebe os dados do portão e cria um novo registro na base de dados.";

        public static final String CREATE_TASK_SUMMARY = "Cria uma nova tarefa para um portão";
        public static final String CREATE_TASK_DESCRIPTION = "Recebe os dados de uma tarefa e associa a um portão existente.";
    }

}

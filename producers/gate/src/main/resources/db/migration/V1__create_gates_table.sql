CREATE TABLE public.gates (
     id UUID PRIMARY KEY,
     room_id UUID NOT NULL UNIQUE,
     created_at TIMESTAMP NOT NULL
);


CREATE INDEX idx_gates_room_id ON public.gates(room_id);

ALTER TABLE public.gates
ADD CONSTRAINT fk_gates_room
FOREIGN KEY (room_id)
REFERENCES public.rooms(id);
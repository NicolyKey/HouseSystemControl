package com.producer.gate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "gates", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id", nullable = false)
    private Room room;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Gate gate = (Gate) o;
        return id != null && Objects.equals(id, gate.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public static Gate create(Room room) {
        return new Gate(
                UUID.randomUUID(),
                room,
                Instant.now()
        );
    }
}

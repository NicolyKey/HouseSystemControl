package com.producer.room.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "rooms", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "room_name", nullable = false, unique = true)
    private String roomName;

    public static Room create(String roomName) {
        return new Room(
                UUID.randomUUID(),
                roomName
        );
    }
}

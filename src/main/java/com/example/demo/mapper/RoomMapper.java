package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.RoomDto;
import com.example.demo.model.entity.Room;

//@Service
//@Repository (兩者皆是 component)
@Component
public class RoomMapper {

	@Autowired
	private ModelMapper modelMapper;

	public RoomDto toDto(Room room) {
		return modelMapper.map(room, RoomDto.class);
	}
	
	public Room toEntity(RoomDto roomDto) {
		// DTO 轉 Entity
		return modelMapper.map(roomDto, Room.class);
	}
}

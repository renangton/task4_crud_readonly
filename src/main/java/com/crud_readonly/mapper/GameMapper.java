package com.crud_readonly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crud_readonly.entity.Game;

@Mapper
public interface GameMapper {

	public List<Game> findAllAsc();

	public List<Game> findAllDesc();

	public Game findById(Game game);

}

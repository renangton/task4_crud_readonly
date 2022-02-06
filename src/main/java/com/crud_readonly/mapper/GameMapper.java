package com.crud_readonly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crud_readonly.entity.Game;

// Gameクラスの各フィールドを参照
@Mapper
public interface GameMapper {
	
	// Gameのリストを全件取得する
	public List<Game> findAll();

	//　idで検索
	public Game findById(Game game);
	
}

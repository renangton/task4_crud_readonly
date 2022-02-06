package com.crud_readonly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud_readonly.entity.Game;
import com.crud_readonly.mapper.GameMapper;

// SQLの実行結果を取得する
@Service
public class GameService {
	
	@Autowired
	GameMapper gameMapper;
	
	// 全件取得
	public List<Game> getGames(){
		return gameMapper.findAll();
	}
	
    // idで検索
	public Game findById(String id) {
		Game gameId = new Game();
		gameId.setId(id);
		return gameMapper.findById(gameId);
	}
}

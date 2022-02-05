package com.crud_readonly.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.crud_readonly.entity.Game;
import com.crud_readonly.form.GameForm;
import com.crud_readonly.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	GameService gameService;
	
	@GetMapping("/search")
	public String getSearch() {
		
		// serarch.htmlに画面遷移
		return "search";
		
	}
	
	
	// [/games]へのHTTPリクエストを受け付ける
	@PostMapping("/search/db")
	
	public String search(GameForm gameForm, Model model) {
		
		// getId()がnullの時、全件取得
		if(gameForm.getId() == null) {
			
			// ゲームの一覧を取得
			List<Game> gameList = gameService.getGames(); 
			model.addAttribute("gameList", gameList);
			
		// getId()がnullでない時、IDで検索し、１件取得
		}else {
			
			Game game = gameService.findById(gameForm.getId());
			model.addAttribute("game", game);

		}
		
		return "search/db";
	}
	/*
	public List<Game> games() {
		List<Game> gameList = gameMapper.findAll();
		
		return gameList;
	}
	*/
}

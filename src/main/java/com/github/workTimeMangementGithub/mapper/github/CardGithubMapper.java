package com.github.workTimeMangementGithub.mapper.github;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.github.CardGithubDTO;
import com.github.workTimeMangementGithub.entities.Card;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CardGithubMapper {

	public static Card toEntity(CardGithubDTO cardDto) {
		Card card = new Card();
		card.setId(cardDto.getId());
		card.setContent_id(cardDto.getContent_id());
		card.setContent_type(cardDto.getContent_type());
		card.setIssue(IssueGithubMapper.toEntity(cardDto.getIssue()));
		card.setColumnP( ColumnGithubMapper.toEntity(cardDto.getColumn()) );
		return card;
	}
	
	public static List<Card> toListEntity(List<CardGithubDTO> cardListDto) {
		List<Card> cardList = new ArrayList<>();
		for(CardGithubDTO cardDto : cardListDto) {
			Card card = new Card();
			card.setId(cardDto.getId());
			card.setContent_id(cardDto.getContent_id());
			card.setContent_type(cardDto.getContent_type());
			card.setIssue(IssueGithubMapper.toEntity(cardDto.getIssue()));
			card.setColumnP( ColumnGithubMapper.toEntity(cardDto.getColumn()) );
			cardList.add(card);
		}
		
		return cardList;
	}
	
	public static CardGithubDTO toDTO(Card card) {
		CardGithubDTO cardDto = new CardGithubDTO();
		cardDto.setId(card.getId());
		cardDto.setContent_id(card.getContent_id());
		cardDto.setContent_type(card.getContent_type());
		cardDto.setIssue(IssueGithubMapper.toDTO(card.getIssue()));
		cardDto.setColumn( ColumnGithubMapper.toDTO(card.getColumnP()) );
		return cardDto;	
	}
	
	public static List<CardGithubDTO> toListDTO(List<Card> cardList) {
		List<CardGithubDTO> cardDtoList = new ArrayList<>();
		for(Card card: cardList) {
			CardGithubDTO cardDto = new CardGithubDTO();
			cardDto.setId(card.getId());
			cardDto.setContent_id(card.getContent_id());
			cardDto.setContent_type(card.getContent_type());
			cardDto.setIssue(IssueGithubMapper.toDTO(card.getIssue()));
			cardDto.setColumn( ColumnGithubMapper.toDTO(card.getColumnP()) );
			cardDtoList.add(cardDto);
		}
		
		return cardDtoList;	
	}
	
	
}

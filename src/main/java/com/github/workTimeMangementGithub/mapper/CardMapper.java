package com.github.workTimeMangementGithub.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.workTimeMangementGithub.dto.CardDTO;
import com.github.workTimeMangementGithub.entities.Card;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CardMapper {

	public static Card toEntity(CardDTO cardDto) {
		Card card = new Card();
		card.setId(cardDto.getId());
		card.setContent_id(cardDto.getContent_id());
		card.setContent_type(cardDto.getContent_type());
		card.setIssue(IssueMapper.toEntity(cardDto.getIssue()));
		card.setColumnP( ColumnMapper.toEntity(cardDto.getColumn()) );
		return card;
	}
	
	public static List<Card> toListEntity(List<CardDTO> cardListDto) {
		List<Card> cardList = new ArrayList<>();
		for(CardDTO cardDto : cardListDto) {
			Card card = new Card();
			card.setId(cardDto.getId());
			card.setContent_id(cardDto.getContent_id());
			card.setContent_type(cardDto.getContent_type());
			card.setIssue(IssueMapper.toEntity(cardDto.getIssue()));
			card.setColumnP( ColumnMapper.toEntity(cardDto.getColumn()) );
			cardList.add(card);
		}
		
		return cardList;
	}
	
	public static CardDTO toDTO(Card card) {
		CardDTO cardDto = new CardDTO();
		cardDto.setId(card.getId());
		cardDto.setContent_id(card.getContent_id());
		cardDto.setContent_type(card.getContent_type());
		cardDto.setIssue(IssueMapper.toDTO(card.getIssue()));
		cardDto.setColumn( ColumnMapper.toDTO(card.getColumnP()) );
		return cardDto;	
	}
	
	public static List<CardDTO> toListDTO(List<Card> cardList) {
		List<CardDTO> cardDtoList = new ArrayList<>();
		for(Card card: cardList) {
			CardDTO cardDto = new CardDTO();
			cardDto.setId(card.getId());
			cardDto.setContent_id(card.getContent_id());
			cardDto.setContent_type(card.getContent_type());
			cardDto.setIssue(IssueMapper.toDTO(card.getIssue()));
			cardDto.setColumn( ColumnMapper.toDTO(card.getColumnP()) );
			cardDtoList.add(cardDto);
		}
		
		return cardDtoList;	
	}
	
	
}

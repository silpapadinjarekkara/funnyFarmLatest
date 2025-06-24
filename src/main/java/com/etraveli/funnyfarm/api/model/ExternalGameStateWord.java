package com.etraveli.funnyfarm.api.model;


import java.util.List;

public record ExternalGameState(List<ExternalGameStateWord> externalGameStateWordList, String lastGuess) {

}

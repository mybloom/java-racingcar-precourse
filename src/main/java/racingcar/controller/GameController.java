package racingcar.controller;

import static racingcar.view.RequestMessage.*;

import camp.nextstep.edu.missionutils.Console;
import racingcar.service.GameService;
import racingcar.view.RequestView;

//외부 요청/응답에 대한 전반적 영역
public class GameController {
	private GameService gameService = new GameService();
	private RequestView requestView = new RequestView();

	//게임 진행
	public void startGameFlow() {
		createCars();
	}

	//사용자 입력값 받기
	private void createCars() {
		gameService.createRacingCars();
	}





}

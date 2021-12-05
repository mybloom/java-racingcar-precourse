package racingcar.view;

import static racingcar.view.RequestMessage.*;

import camp.nextstep.edu.missionutils.Console;

public class RequestView {
	//자동차이름, 경주 횟수 입력 받기
	public String requestCarName() {
		System.out.println(REQUEST_CAR_NAME);
		return Console.readLine().trim();
	}

	public String requestRacingCount() {
		System.out.println(REQUEST_RACING_COUNT);
		return Console.readLine().trim();
	}
}

package racingcar.service;

import static racingcar.utils.GameConstant.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import racingcar.domain.Car;
import racingcar.domain.Racing;
import racingcar.utils.Validator;
import racingcar.view.RequestView;
import racingcar.view.dto.InputDto;

//도메인 간 순서 보장 : 흐름제어
//요청 처리하는 부분 Class로 빼도 좋을지 생각해보자
public class GameService {
	private RequestView requestView = new RequestView();
	InputDto inputDto = new InputDto();
	List<Car> racingCars;
	Racing racing;

	//입력값 validate체크
	public void createRacingCars() {
		validateRequest();
		racingCars = new ArrayList<>();
		for (String name : inputDto.getRacingCars()) {
			racingCars.add(new Car(name));
		}

		racing = new Racing(racingCars, inputDto.getRacingCount());
	}

	private void validateRequest() {
		String carName = "";
		String racingCount = "";
		List<String> list = null;

		boolean isNotValidCarName = true;
		boolean isNotValidRacingCount = true;

		while (isNotValidCarName) {
			carName = requestView.requestCarName();
			String[] array = carName.split(",");
			list = new ArrayList<>(Arrays.asList(array));

			isNotValidCarName = validateCarName(list);
		}

		while (isNotValidRacingCount) {
			racingCount = requestView.requestRacingCount();
			isNotValidRacingCount = validateRacingCount(racingCount);
		}

		inputDto.setRacingCars(list);
		inputDto.setRacingCount(Integer.parseInt(racingCount));
	}

	//자동차이름에 대한 처리.
	private boolean validateCarName(List<String> list) {
		try {
			Validator.listSize(list);
			for (String str : list) {
				Validator.length(str, LENGTH_CAR_NAME);
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return true;
		}
		return false;
	}

	//경주 횟수 입력값 예외처리
	private boolean validateRacingCount(String inputString) {
		try {
			Validator.isNumber(inputString);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return true;
		}
		return false;
	}

}

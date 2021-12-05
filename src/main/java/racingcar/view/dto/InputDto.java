package racingcar.view.dto;

import java.util.List;

public class InputDto {
	private List<String> racingCars;
	private int racingCount;

	public List<String> getRacingCars() {
		return racingCars;
	}

	public void setRacingCars(List<String> racingCars) {
		this.racingCars = racingCars;
	}

	public int getRacingCount() {
		return racingCount;
	}

	public void setRacingCount(int racingCount) {
		this.racingCount = racingCount;
	}
}

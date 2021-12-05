package racingcar.utils;

import static racingcar.view.ErrorMessage.*;

import java.util.List;

//[Q]해당 클래스의 메서드를 모두 자동으로 throws를 선언부에 작성한다는 법칙을 생성해주는 것은 없나?
public class Validator {
	//trim()을 해도 ""값이 기본으로 list에 들어간다.
	public static void listSize(List list) throws IllegalArgumentException {
		if (list.size() == 0) {
			throw new IllegalArgumentException(INVALID_LIST_SIZE_ZERO);
		}
	}

	public static void length(String string, int validLength) throws IllegalArgumentException {
		if (string.length() > validLength) {
			throw new IllegalArgumentException(INVALID_LENGTH_MESSAGE);
		}
	}

	public static void isNumber(String string) throws IllegalArgumentException {
		for (char chr : string.toCharArray()) {
			isNumber(chr);
		}
	}

	public static void isNumber(char chr) throws IllegalArgumentException {
		if (!Character.isDigit(chr)) {
			throw new IllegalArgumentException(INVALID_FORMAT_MESSAGE);
		}
	}

	public static int toInt(char chr) {
		return (int)chr - '0';
	}

}

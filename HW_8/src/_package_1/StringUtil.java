package _package_1;


import java.util.Optional;

public class StringUtil {

	public static boolean isBlank(Optional<String> citeKeyOptional) {
		return citeKeyOptional.isEmpty();
	}

}

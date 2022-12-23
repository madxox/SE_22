package _package_1;


import java.util.Optional;

public class BibEntry {
	Optional<String> citationKey;
	
	public BibEntry(Optional<String> citationKey) {
		this.citationKey = citationKey;
	}

	public Optional<String> getCitationKey() {
		return this.citationKey;
	}

}

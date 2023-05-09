package pkg;

public class AutocorrectPrototype {
	public static void main(String[] args) {

		String[] words = {"duel", "speed", "dule", "cars"};
		String[] queries = {"spede", "deul"};
//		System.out.println(getSearchResults(words, queries));
		String word = "duel";
	}
	
	public static String[] getSearchResults(String[] words, String[] queries) {
		String[] result = new String[queries.length];
		for (String query : queries) {
			for (String word: words) {
				for (int i = 0; i < query.length(); i++) {
					String newQuery = "";
				}
			}
		}
		return null;
	}
}

class Solution {

    private final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public String[] spellchecker(String[] wordlist, String[] queries) {
        
        Set<String> exactMatch = new HashSet<>();
        Map<String, String> caseInsensitiveMatch = new HashMap<>();
        Map<String, String> vowelErrorMatch = new HashMap<>();

        for (String word : wordlist) {
            exactMatch.add(word);

            String lower = word.toLowerCase();
            String devoweled = getDevoweledKey(lower);

            caseInsensitiveMatch.putIfAbsent(lower, word);
            vowelErrorMatch.putIfAbsent(devoweled, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            if (exactMatch.contains(query)) {
                result[i] = query;
                continue;
            }

            String queryLower = query.toLowerCase();

            if (caseInsensitiveMatch.containsKey(queryLower)) {
                result[i] = caseInsensitiveMatch.get(queryLower);
                continue;
            }

            String queryDevoweled = getDevoweledKey(queryLower);

            if (vowelErrorMatch.containsKey(queryDevoweled)) {
                result[i] = vowelErrorMatch.get(queryDevoweled);
                continue;
            }
            
            result[i] = "";
        }

        return result;
    }

    private String getDevoweledKey(String lowerWord) {
        StringBuilder sb = new StringBuilder();
        for (char c : lowerWord.toCharArray()) {
            if (vowels.contains(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
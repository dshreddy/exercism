class SqueakyClean {
    static String clean(String identifier) {

        char[] chars = identifier.toCharArray();
        int l = chars.length;

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < l; i++) {
            char ch = chars[i];
            switch (ch) {
                case ' ':
                    // Replace any spaces encountered with underscores
                    builder.append('_');
                    break;
                case '-':
                    if(i+1 < l) {
                        // Convert kebab-case to camelCase
                        builder.append(Character.toUpperCase(chars[i+1]));
                        i++;
                    }
                    break;
                case '4':
                    builder.append('a');
                    break;
                case '3':
                    builder.append('e');
                    break;
                case '0':
                    builder.append('o');
                    break;
                case '1':
                    builder.append('l');
                    break;
                case '7':
                    builder.append('t');
                    break;
                default :
                    if(Character.isAlphabetic(ch)) {
                        builder.append(ch);
                    }
            }
        }
        return builder.toString();
    }
}

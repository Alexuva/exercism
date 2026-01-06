import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();
        for (int i = 0; i < asArray.length; i++) {

            if (Character.isWhitespace(asArray[i])) {
                asArray[i] = '_';
            }

            switch (asArray[i]) {
                case '4':
                    asArray[i] = 'a';
                break;

                case '3':
                    asArray[i] = 'e';
                break;

                case '0':
                    asArray[i] = 'o';
                break;

                case '1':
                    asArray[i] = 'l';
                break;

                case '7':
                    asArray[i] = 't';
                break;
            }

            if (asArray[i] == '-') {
                asArray[i + 1] = Character.toUpperCase(asArray[i + 1]);
            } else {
                if (Character.isLetter(asArray[i]) || asArray[i] == '-' || asArray[i] == '_') {
                    builder.append(asArray[i]);
                }
            }
        }
        return builder.toString();
    }
}

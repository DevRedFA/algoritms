import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomStringsGenerator {

    public List<String> generate(int minLength, int maxLength, int stringsSize){

        Alphabet[] alphabet = Alphabet.values();
        Random random = new Random();

        List<String> result = new ArrayList<>(stringsSize);

        for (int i = 0; i < stringsSize; i++) {
            String string = random.ints(minLength + random.nextInt(maxLength - minLength),
                    0,
                    alphabet.length
            ).mapToObj(j -> {
                if(j == 0){
                    return "";
                }else {
                    return alphabet[j].toString();
                }
            })
            .collect(Collectors.joining());

            result.add(string);
        }

        return result;

    }


}

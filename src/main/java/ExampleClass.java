import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

public class ExampleClass {

    public static void main(String[] args) {
        String string = "Life, The Universe and Everything";
        System.out.println("You entered: " + string);
        System.out.println("StringUtils.isNumeric(string) = " + StringUtils.isNumeric(string));
        System.out.println("StringUtils.swapCase(string) = " + StringUtils.swapCase(string));
        System.out.println("StringUtils.reverse(string) = " + StringUtils.reverse(string));

    }
}

package AbstractClassAndInterface.StringTransformer;

import java.util.Locale;

public class UpperCaseStringTransformer extends StringTransformer{

    @Override
    public String transform() {
        return str.toUpperCase(Locale.ROOT);
    }


}

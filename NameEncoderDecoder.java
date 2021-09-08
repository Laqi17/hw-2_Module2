public class NameEncoderDecoder {
    String name;
    public String encode(String name){
        String name1 = name.replace("e", "1").
                replace("u", "2").
                replace("i", "3").
                replace("o", "4").
                replace("a", "5");
        return "NOTFORYOU" + name1 + "YESNOTFORYOU";
    }

    public String decode(String name){
        String name1 = name.replace("1", "e").
                replace("2", "u").
                replace("3", "i").
                replace("4", "o").
                replace("5", "a");
        return name1.substring(9, name.length()-12);

    }
}

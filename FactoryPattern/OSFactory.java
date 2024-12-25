package FactoryPattern;

public class OSFactory {
    public OS getInstance(String str){
        if(str.equals("open")){
            return new Android();
        }
        if(str.equals("closed"))return new IOS();
        return new Others();

    }
}

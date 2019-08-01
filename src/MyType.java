public class MyType {

    private String name;

    public MyType(String name){

        this.name=name;
}

    @Override
    public String toString(){

        return "City " + name;
    }

    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof MyType)) return false;

        MyType Temp = (MyType)obj;
        return this.name.equals(Temp.name);
    }
}

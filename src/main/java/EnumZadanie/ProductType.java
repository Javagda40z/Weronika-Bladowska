package EnumZadanie;

public enum ProductType {
    OWOCE("owoce", 123), WARZYWA("warzywo", 124), MIESO("mieso", 125);

    private String owoce;
    private int code;

    ProductType(String owoce,int code){
        this.code=code;
        this.owoce=owoce;

    }
}

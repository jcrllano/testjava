public class person {
    public String product;

    public person(){
        product = "";
    }

    public String getCode(){
        return "Your Name is " + product;
    }

    public void setCode(String product) {
        this.product = product;
    }
}

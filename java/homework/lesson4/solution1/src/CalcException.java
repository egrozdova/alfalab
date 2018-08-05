class CalcException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public CalcException(String string, int number){

        super(string);
        number=number;
    }
}
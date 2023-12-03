public class StringNumber {
    private String sourceString;
    private int outputNumber;

    public StringNumber(){
        outputNumber = 0;
    }

    public StringNumber(String setSourceString){
        this.sourceString = setSourceString;
    }

    public void setSourceString(String newSourceString){
        this.sourceString = newSourceString;
    }

    public int getOutputNumber(){
        return outputNumber;
    }

    public void convertToInt(){
        String outputString = "";
        boolean isSymbolDigit = true;
        for (int i = 0; i < sourceString.length(); i++){
            if (Character.isDigit(sourceString.charAt(i))){
                outputString = outputString + sourceString.charAt(i);
            }
        }
        if (!outputString.isEmpty()){
            this.outputNumber = Integer.parseInt(outputString);
        }
    }

}

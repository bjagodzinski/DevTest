/**
 * Created by Rafal on 2016-09-05.
 */
public class InputValidator implements Validator {
    
    // dont get it what it is doing????
    
    private String inputString;

    public InputValidator(String[] input) {
        
        // conditional processing in constructor is not good idea...
        
        if(validateArrayInput(input) && validateProperString(input[0])){
            this.inputString = input[0];
        }
    }

    public Boolean validateArrayInput(String[] inputArray) {
        if(inputArray.length > 1)
            return false;
        else
            return true;
    }

    public Boolean validateProperString(String stringToValidate) {
        if(stringToValidate.matches("\\d+"))
            return false;
        else
            return true;
    }

    public String getValidatedString(){
        String result;
        if(inputString.length() == 0){
            result = "";
        }
        else {
            result = inputString;
        }
        return result;
    }
}

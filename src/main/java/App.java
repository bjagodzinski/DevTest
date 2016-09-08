import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Rafal on 2016-09-05.
 */
public class App {
    // do you really need getter?
    public String[] getInputText() {
        return inputText;
    }

    // make'em private
    String[] inputText;
    
    // What is the purpose of this??? Try to comment the sense and purpose of variable if it's
    // not obvoius or deductive
    String test;

    // it's not always like you need getter for every field, I would go for deeper hemetization
    public String getTest() {
        return test;
    }

    // wrong name of variable it swuggests text but it is array of string
    public App(String[] inputText) {
        this.inputText = inputText;
    }

    public void generateCsvFile() throws IOException, ParseException {
        
        // each time you generate file you create new object, this is not effiscient
        // make validator independent from the text it validates and create method that takes the validated
        // string and gives response
        
        // Read about how to handle validation:
        // http://stackoverflow.com/questions/28217873/what-is-a-good-practice-to-handle-validation-in-java
        // http://stackoverflow.com/questions/12338463/how-to-handle-bean-validation-exceptions
        // try to apply some solution
        Validator cityValidator = new InputValidator(inputText);
        this.test = cityValidator.getValidatedString();
        System.out.println(this.getTest());
/*
        Connector urlReader = new Connector();
        urlReader.setConnectionURL(cityValidator.getValidatedString());
        urlReader.connectUrl();

        JSONParser jParser = new JSONParser();
        TextReader urlResponse = new TextReader();
        String urlJsonTxt = urlResponse.getStringData(urlReader.getConnection());

        Object jsonString = jParser.parse(urlJsonTxt);

        urlReader.disconnectUrl();

        JSONArray jArray = (JSONArray) jsonString;

        JsonFormatter csvOutput = new CsvBuilder();
        String result = csvOutput.jsonToString(jArray);

        PrintWriter printWriter = new PrintWriter(new FileWriter(AppData.fileName));
        printWriter.write(result);
        printWriter.close();*/
    }
}


package util;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import logic.DamSystem;
import logic.Formula;
import logic.Variable;

public class FilesManagement {

    public static void WriteFormulaToFile (File formulasFile){
String space = ";";
ArrayList<Formula> formulas= DamSystem.getInstance().getFormList();
try {
    FileWriter fileWriter= new FileWriter(formulasFile);
    StringBuilder line = new StringBuilder();
    line.append("Name");
    line.append(space);
    line.append("Equation");
    line.append(space);
    line.append("Variables");
    line.append("\n");

    for(int i=0;i< formulas.size();i++){
        Formula f= formulas.get(i);
        line.append(f.getName());
            line.append(space);
            line.append(f.getFunction());
            line.append(space);
            for (Variable variable : formulas.get(i).getVariables()) {
                line.append(variable.getName() + " " + variable.getNomenclature());
                line.append(space);
                fileWriter.write(line.toString());
                line.delete(0, line.length());
            }
            line.append("\n");
    }
    fileWriter.close();

} catch (Exception e) {
  System.out.println("No se pudo guardar el fichero");
}

    }
    
}
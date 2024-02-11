package util;

import java.util.ArrayList;

import logic.DamSystem;
import logic.Formula;
import logic.Variable;
import util.FilesManagement;
import util.Init;

public class prueba {
public static void main(String[] args) {
    Init.init();
FilesManagement.WriteFormulaToFile(DamSystem.getInstance().getFormulasFile());
ArrayList<Formula> formulas = FilesManagement.CargandoFormulas(DamSystem.getInstance().getFormulasFile());
for (Formula formula : formulas) {
    System.out.println(formulas);
    System.out.println(formula.getName());
    System.out.println(formula.getFunction());
    for (Variable variabless : formula.getVariables()) {
        System.out.println(variabless.getName());
        System.out.println(variabless.getNomenclature());
        System.out.println(variabless.getDescription());
    }
   
}
}
}

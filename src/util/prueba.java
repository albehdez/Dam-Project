package util;

import logic.DamSystem;
import logic.Formula;
import util.FilesManagement;
import util.Init;

public class prueba {
public static void main(String[] args) {
    Init.init();
FilesManagement.WriteFormulaToFile(DamSystem.getInstance().getFormulasFile());
}
}

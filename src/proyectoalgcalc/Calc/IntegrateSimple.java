/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoalgcalc.Calc;

/**
 *
 * @author Sayuri
 */
import java.util.Vector;

public class IntegrateSimple {
    String rVar;
    String fnc = "";
    String cnt = "";
    String end = "";
    int cntnC;
    int cnst = 0;
    int pow = 1;

    String powBrc = "";
    String powOf ="";
    String powVar = "";
    int powConst = 1;
    String rsltFnc ="";
    String result = "";
    String sconst;

    Vector<String> bracket_Parts;
    IntegrateSimple(String fnc, String cnt, int cnst, int cntnC, int pow){
        this.fnc = fnc;
        this.cnst = cnst;
        this.cnt = cnt;
        this.cntnC = cntnC;
        System.out.println("Inside Integrate simple "+cnst+ " " +fnc+" "+cnt+" "+cntnC);
        if(fnc.equals("sin")) rsltFnc = "cos";
        else if(fnc.equals("cos")) rsltFnc = "sin";


    }

    IntegrateSimple(String var, int cnst){
        rVar = var;
        varPart var_Part = new varPart(var);
        fnc = var_Part.getFnc();
        cnt = var_Part.getCntn();
        Part_var_const part_Cntn = new Part_var_const(cnt);
        cntnC = ConstantPart.calcConst(part_Cntn.cn);
        bracket_Parts = var_Part.bracketParts;
        pow = var_Part.getPow();
        this.cnst = cnst;
        powOf = var_Part.getPowOf();
        powVar = var_Part.getPowVar();
        powConst = var_Part.getPowConst();

    }

    //EN ESTE CÓDIGO SE ANALIZA CADA TÉRMINO DE LA VARIABLE.
    //DESDE LA PARTE DE LA VARIABLE DE LA CLASE, OBTENEMOS LA FUNCIÓN Y EL CONTENEDOR.
    //COMO EN "SIN5X". AQUÍ "SIN" ES LA FUNCIÓN GUARDADA EN LA CADENA FNC Y "5X" ES EL CONTENEDOR.
    //"5X" TAMBIÉN CONTIENE UNA CONSTANTE. AQUÍ ES "5" DE 5X.
    //EN LA FUNCIÓN INTEGRATES(), SE ENCUENTRA LA INTEGRACIÓN BÁSICA RESPECTIVA BASADA EN LA CADENA FNC.
    //SUPONGAMOS QUE FNC = "SIN", ENTONCES RESULTFUNCTION = "COS" ES SU FUNCIÓN INTEGRADA. Y LA CONSTANTE SE MULTIPLICARÁ POR (-1)
    //Y CUALQUIER CONSTANTE DEL CONTENEDOR ESTARÁ EN FORMA DE DIVISIÓN. AQUÍ PARA "SIN5X" ES (-1/5).
    //FINALMENTE, SI COMBINAMOS EL RESULTADO EN ESTA FORMA

    // INTEGRAR( VARIABLE(CONSTANTE, FUNCIÓN, CONTENEDOR, CONSTANTE_CONTENEDOR) )= CONSTANTE + RESULTFUNCTION + CONTENEDOR
    // INTEGRAR( 9SIN5X ("9", "SIN","5X","5") )= CONSTANTE + "COS" + "5X"

    //CONSTANTE = (SIGNO * CONSTANTE )/ CONSTANTE_CONTENEDOR.
    //CONSTANTE = (-1 * 9)/5.

    // INTEGRAR( 9SIN5X ) = "(-9/5) COS5X"

    void IntegrateS(){
        if (cnst == 0) cnst = 1;

        if(fnc.equals("sin")) {
            rsltFnc = "cos";
            cnst *= (-1);

        }
        else if(fnc.equals("cos")) rsltFnc = "sin";
        else if(fnc.equals("tan")){
            rsltFnc = "ln|cos";  ///cambiado sec a cos
            end = "|";

        }
        else if(fnc.equals("cot")){
            rsltFnc = "ln|cosec";
            end = "|";
            cnst*= -1;
        }
        else if(fnc.equals("cosec")){
            rsltFnc = "ln|tan";
            cnt="("+cnt+")/2";
            end = "|";
        }
        else if(fnc.equals("/")) rsltFnc = "ln";
        else if(fnc.equals("sec") && pow == 2) rsltFnc = "tan";
        else if(fnc.equals("cosec") && pow == 2) {
            rsltFnc = "cot";
            cnst *= (-1);
        }
        else if(powOf.equals("x") && powVar.equals("") ){
            cntnC = pow + 1;
            rsltFnc = "x^";
            cnt = String.valueOf(pow+1);
        }
        else if(powOf.equals("e")&& !powVar.equals("")){
            rsltFnc = "e^";
            cntnC = powConst;
            cnt = powVar;
            if(cntnC!=1) cnt = Integer.toString(cntnC)+ cnt;

        }
        else if(!rVar.contains("x")){
            rsltFnc = "("+rVar+")";
            cnt = "*x";
            if(rVar.equals("")){
                rsltFnc="";
                cnt = "x";
            }
        } else if (rVar.equals("x") ) {
            rsltFnc = "x^";
            cnt = "2";
        }


        if(cnst !=0 && cntnC!=0 && cntnC!=1) sconst ="+ "+ "("+String.valueOf(cnst) + "/" + String.valueOf(cntnC)+") ";
        else if(cnst!=1 && cnst != -1) {
            sconst = String.valueOf(cnst);
            if(cnst>1) sconst = "+ " + sconst;

        }
        else if(cnst == -1) sconst = "- ";
        else if(cnst == 1) sconst = "+ ";

        //if(cnst == 1)  result = rsltFnc + cnt;
        //else if(cnst == -1)  result ="-" + rsltFnc + cnt;
        //else result = String.valueOf(cnst)+rsltFnc+cnt;

        //System.out.println(result);

        result = sconst+rsltFnc+cnt+end;
        System.out.println("\n InIGS: "+cnst+rVar +"  "+fnc+cnt+" " +result+"\n");

    }
}

package by.it.rudzko.Matlab.Vars;


import by.it.rudzko.Matlab.Interfaces.IVar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VarVec implements IVar {

    private double[] vec;

    public VarVec(String str) { //конструктор из строки
        setFrom(str);
    }

    public VarVec(double[] vector) {
        this.vec = new double[vector.length];
        System.arraycopy(vector, 0, this.vec, 0, vector.length);
    }

    public double [] toVec(){
        double [] copy= new double[vec.length];
        for(int i=0; i<vec.length; i++){
            copy[i]=vec[i];
        }
        return copy;
    }

    @Override
    public void setFrom(String str) {
        String[] nums=str.split(",");
        vec=new double[nums.length];
        Matcher m=Pattern.compile("((-?)([0-9.])+)").matcher(str);
        int i=0;
        while (m.find()) {
            vec[i]=Double.parseDouble(m.group());
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder("");
        String s="{";
        for (Double val: vec) {
            res.append(s).append(val.toString());
            s=", ";
        }
        return res.append("}").toString();
    }
}

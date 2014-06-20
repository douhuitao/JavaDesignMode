package com.douhuitao.java.designMode.xingweixingmoshi.interpreter;

public class Constant extends Expression {
    
	private boolean value;
	
	public Constant(boolean value) {
		super();
		this.value = value;
	}

	@Override
    public boolean interpret(Contex ctx) {
        return value;
    }
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Constant){
            return this.value == ((Constant)obj).value;
        }
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		 return new Boolean(value).toString();
	}

}

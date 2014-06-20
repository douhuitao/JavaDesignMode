package com.douhuitao.java.designMode.xingweixingmoshi.interpreter;

public class And extends Expression {
    
	private Expression left;
	private Expression right;

	public And(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
   
	
	@Override
    public boolean interpret(Contex ctx) {
		return left.interpret(ctx) && right.interpret(ctx);
    }
	
	@Override
	public boolean equals(Object obj) {
		  if(obj != null && obj instanceof And)
	        {
	            return this.left.equals(((And)obj).left) && this.right.equals(((And)obj).right);
	        }
	        return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		 return "(" + left.toString() + " And " + right.toString() + ")";
	}

}

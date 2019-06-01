package com.parser.Expressions.Builtins;

import com.parser.Expressions.Expression;
import com.parser.Expressions.Value;

/**
 * Created on 9/05/2016.
 */
public class Octint_builtin extends Expression {

    String value;

    public Octint_builtin(String value) {
        this.value = value;
    }

    @Override
    public String show() {
        return value;
    }

    @Override
    public Value evaluate() throws EvaluateError {
        try {
            return new Value(Integer.parseInt(value.substring(2, value.length()), 8));
        } catch (NumberFormatException exception) {
            throw new EvaluateError("Invalid octal number");
        }
    }
}

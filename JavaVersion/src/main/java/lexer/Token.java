package lexer;

public class Token {
    TokenType _type;
    String _value;

    public Token(TokenType type,String value){
        this._type = type;
        this._value = value;
    }

    public TokenType get_Type(){
        return _type;
    }

    @Override
    public String toString() {
        return String.format("type %s, value %s",_type,_value);
    }

    /**
     * 是否是一个变量
     * @return
     */
    public boolean isVariable(){
        return _type == TokenType.VARIABLE;
    }

    /**
     * 是否是一个值
     * @return
     */
    public boolean isScalar(){
        return _type == TokenType.INTEGER ||
                _type == TokenType.FLOAT ||
                _type == TokenType.BOOLEAN ||
                _type == TokenType.STRING;
    }
}

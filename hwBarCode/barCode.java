public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static String[] _bars = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip){
	if (zip.length() != 5){
	    throw new RuntimeException();
	}
	try{
	    int num = Integer.parseInt(zip);
	}catch(NumberFormatException e){
	}
	_zip = zip + String.valueOf(_checkDigit);
	_checkDigit = checkSum();
    }
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	}
    


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int ret = 0;
	for(int i = 0; i < _zip.length()-1; i++){
	    ret += Integer.parseInt(String.valueOf(_zip.charAt(i)));
	}
	ret = ret %10;
	return ret;
    }
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String bar = "";
	//int num = Integer.parseInt(_zip.substring(i,i+1));
	for (int i = 0; i < _zip.length()-1; i++){
	    bar += _bars[Integer.parseInt(String.valueOf(_zip.charAt(i)))];
	}
	return _zip + _checkDigit + " |" + bar + " |";
    }


    public boolean equals(Object other){
	return other == this || other instanceof BarCode && _zip.equals(((BarCode)other)._zip);
    }
    //thank god we had code from class
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	return Integer.parseInt(_zip) - Integer.parseInt(((BarCode)other)._zip);
    }
    // postcondition: compares the zip + checkdigit 

    //test
    public static void main(String[]args){
        BarCode n = new BarCode("01234");
        System.out.println(n);
    }
}
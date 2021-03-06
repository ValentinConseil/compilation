package sprint2.operations;

import sprint2.FunctionRepresentation;
import sprint2.MainSprint2;

public class TL extends Operation{

	public TL() {
		super("TL");
	}

	@Override
	public String printCodeGo(FunctionRepresentation fr, String arg1, String arg2, String arg3,int indent) {
		String ind = "";
		for (int i = 0; i < indent; i++)
			ind += MainSprint2.Indent;
		
		return ind+arg1+" = libWH.Tl("+arg2+")\n";
	}

}

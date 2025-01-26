package MPP_Labs.Lab5.task1.code;
import java.awt.Component;

public class AddressRuleSet implements RuleSet {
	private String name, street,city,state,zip;
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow)ob;
		 name = addr.getIdValue();
		 street = addr.getStreetValue();
		 city = addr.getCityValue();
		 state = addr.getStateValue();
		 zip = addr.getZipValue();
		if(isAnyEmpty())
			throw new RuleException("Address rule violated! All fields must be non empty");
		if(!RuleSetFactory.isNumeric(name))
			throw new RuleException("Address rule violated! ID field must be numeric");
		if(!RuleSetFactory.isNumeric(zip))
			throw new RuleException("Address rule violated! Zip field must be numeric");
		if(!RuleSetFactory.isExactLength(zip, 5))
			throw new RuleException("Address rule violated! Zip field must be exactly 5 digits");
		if(!RuleSetFactory.isExactLength(state, 2))
			throw new RuleException("Address rule violated! State field must be exactly 2 digits");
		if(!RuleSetFactory.isAllCapitals(state))
			throw new RuleException("Address rule violated! State field must be in the range A-Z");
		if(name.equals(zip))
			throw new RuleException("Address rule violated! ID field may not equal zip field");
	}
	public boolean isAnyEmpty()
	{
		if(name.isEmpty() || state.isEmpty() ||
				street.isEmpty() || city.isEmpty() ||
				zip.isEmpty())
			return true;
		return false;
	}
}

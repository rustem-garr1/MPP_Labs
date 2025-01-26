package MPP_Labs.Lab5.task1.code;//package lesson5.lecture.factorymethods2.rulesets;

import java.awt.Component;
public class CustomerProfileRuleSet implements RuleSet {
	private String ID, FName, LName, FRest, FMovie;

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow customerProfile = (ProfileWindow)ob;
		ID = customerProfile.getIdValue();
		FName = customerProfile.getFirstNameValue();
		LName = customerProfile.getLastNameValue();
		FMovie = customerProfile.getFavoriteMovieValue();
		FRest = customerProfile.getFavoriteRestaurantValue();
		if(isAnyEmpty())
			throw new RuleException("An customerProfile rule has been violated! All fields must be nonempty");
		
		if(!RuleSetFactory.isNumeric(ID))
			throw new RuleException("An customerProfile rule has been violated! ID field must be numeric");
		
		if(FMovie.equals(FRest))
			throw new RuleException("An customerProfile rule has been violated! Favorite restaurant field may not equal Favorite Movie field");
		
		if(!RuleSetFactory.isAllLetters(FName))
			throw new RuleException("An customerProfile rule has been violated! First Name field must be all letters");

		if(!RuleSetFactory.isAllLetters(LName))
			throw new RuleException("An customerProfile rule has been violated! Last Name field must be all letters");

		
	}
	public boolean isAnyEmpty()
	{
		if(ID.isEmpty() || FName.isEmpty() ||
				LName.isEmpty() || FMovie.isEmpty() ||
				FRest.isEmpty())
			return true;
		return false;
		
	}

}

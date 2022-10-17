package services;

import stratergiesContexts.UserOptionContext;
import interfaces.UserOption;

public class UserAction {
    UserOptionContext optionContext = new UserOptionContext();
    private String actionDescription = "";

    public UserAction(UserOption userOption, String actionDescription){
        this.actionDescription = actionDescription;
        this.optionContext.setContext(userOption);
    }

    public String getActionDescription(){
        return this.actionDescription;
    }

    public UserOptionContext getOptionContext(){
        return this.optionContext;
    }
}

package stratergiesContexts;

import interfaces.UserOption;

public class UserOptionContext implements  UserOption{
    private UserOption userOption;
    public void executeOption() {
        this.userOption.executeOption();
    }
    public void setContext(UserOption option){
        this.userOption = option;
    }

    public UserOption getUserOption(){
        return this.userOption;
    }
}

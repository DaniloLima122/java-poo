package ConcreteUserOptionStratergies;

import UserOptionsContext.AddFuncionariosContext;
import interfaces.UserOption;
import services.Empresa;

public class AdicionarFuncionario implements UserOption {

    private final Empresa empresa;

    public AdicionarFuncionario(final Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public void executeOption() {
        AddFuncionariosContext funcionarioContext = new AddFuncionariosContext();
    }
}

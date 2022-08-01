package hr.hrsak;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = List.of(
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000)
        );
        for (BankAccountCommand c: commands)
        {
            c.call();
            System.out.println(ba);
        }


        for (Command c : Lists.reverse(commands))
        {
            c.undo();
            System.out.println(ba);
        }

    }
}

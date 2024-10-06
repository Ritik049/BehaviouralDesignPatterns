package CommandDesignPattern;

import java.util.Stack;


public class RemoteControlInvoker {
    Command command;
    Stack<Command> st = new Stack<>();

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void pressButton()
    {
        command.execute();
        st.push(command);
    }

    public void undo()
    {
        if(!st.isEmpty())
        {
             Command lst = st.pop();
             lst.undo();
        }
    }
}

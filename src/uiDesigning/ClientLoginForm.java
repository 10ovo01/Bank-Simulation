package uiDesigning;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClientLoginForm {
    Label account = new Label("�˺ţ�");
    Label password = new Label("���룺");
    TextField accounttxt = new TextField();
    TextField passtxt = new TextField();
    Button confirm = new Button("ȷ��");
    Label message = new Label();

    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Panel p3 = new Panel();

    Frame mainFrame = new Frame();

    public ClientLoginForm(){
        mainFrame.setLayout(new GridLayout(3,1));

        mainFrame.add(p1);
        p1.setLayout(new BorderLayout());
        p1.add(account,BorderLayout.WEST);
        p1.add(accounttxt);

        mainFrame.add(p2);
        p2.setLayout(new BorderLayout());
        p2.add(password,BorderLayout.WEST);
        p2.add(passtxt);

        mainFrame.add(p3);
        p3.add(confirm);
        p3.add(message);


        mainFrame.setSize(300,300);
        mainFrame.setVisible(true);
        mainFrame.setTitle("�ͻ���¼");
        mainFrame.pack();

        accounttxt.setSize(200,50);
        passtxt.setSize(200,50);
        passtxt.setEchoChar('*');

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mainFrame.setVisible(false);
            }
        });


    }

    public static void main(String[] args) {
        new ClientLoginForm();
    }

}

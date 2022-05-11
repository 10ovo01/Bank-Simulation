package uiDesigning;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClientMainForm {
    public Button withdrawAppointment = new Button("ԤԼȡ��");
    public Button depositAppointment = new Button("ԤԼ���");
    public Button financialProducts = new Button("��������");
    public Button makeloan = new Button("��������");
    public Button dailyLifePayment = new Button("����ɷ�");
    public Button transfer = new Button("ת��");
    public Button account = new Button("�޸�����");
    public Button exit = new Button("�˳�");
    public Label welcome = new Label("����ʹ�ô������пͻ���");

    public Panel pleft = new Panel();
    public Panel pright = new Panel();

    public Frame mainFrame = new Frame();

    public ClientMainForm(){
        mainFrame.setLayout(new BorderLayout());
        pleft.setLayout(new GridLayout(4,1));
        pright.setLayout(new GridLayout(4,1));
        Font f = new Font("΢���ź�",Font.PLAIN,20);

        mainFrame.add(pleft,BorderLayout.WEST);
        mainFrame.add(pright,BorderLayout.EAST);
        mainFrame.add(welcome,BorderLayout.NORTH);
        pleft.add(withdrawAppointment);
        pleft.add(depositAppointment);
        pleft.add(financialProducts);
        pleft.add(makeloan);
        pright.add(dailyLifePayment);
        pright.add(transfer);
        pright.add(account);
        pright.add(exit);

        mainFrame.setSize(700,700);
        welcome.setFont(f);
        mainFrame.setVisible(true);
        mainFrame.setTitle("�������пͻ���");
        mainFrame.setLocation(500,50);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        /*
         * ȡ��ԤԼ
         */
        withdrawAppointment.addActionListener(e -> new WithdrawAppointment());
        /*
         * ���ԤԼ
         */
        depositAppointment.addActionListener(e -> new WithdrawAppointment());
        /*
         * @method
         */
        dailyLifePayment.addActionListener(e -> new DailyPaymentForm());
        /*
         * ����
         */
        makeloan.addActionListener(e -> new ClientLoanForm());
        /*
         * ת��
         */
        transfer.addActionListener(e -> new TransferForm());

        financialProducts.addActionListener(e -> new FinancialProdForm());

        account.addActionListener(e -> new AccountMgrForm());

        exit.addActionListener(e -> {

        });
    }

    public static void main(String[] args) {
        new ClientMainForm();
    }
}
package JavaProject.SwingGUI.MarksManagementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//this is simple java swing project just to see how to use GUI of swing

public class Student {
    private JTextField txtStname;
    private JButton calButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,tot;
                double avg;

                m1= Integer.parseInt(txtMarks1.getText());
                m2= Integer.parseInt(txtMarks2.getText());
                m3= Integer.parseInt(txtMarks3.getText());

                tot=m1+m2+m3;
                txtTotal.setText(String.valueOf(tot));

                avg=tot/3;
                txtAvg.setText(String.valueOf(avg));

                if (avg>=35){
                    txtGrade.setText("Pass Congralutions");
                }else{
                    txtGrade.setText("Fail Better luck next time");
                }

            }
        });
    }
}

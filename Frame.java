import javax.imageio.ImageIO;
import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;


public class myFrame extends JFrame {
    myFrame()  {
        initComponents();
    }

    private void initComponents()  {
        butt0 = new JButton("0");
        butt1 = new JButton("1");
        butt2 = new JButton("2");
        butt3 = new JButton("3");
        butt4 = new JButton("4");
        butt5 = new JButton("5");
        butt6 = new JButton("6");
        butt7 = new JButton("7");
        butt8 = new JButton("8");
        butt9 = new JButton("9");
        dot = new JButton(".");
        res = new JButton("=");
        sub = new JButton("-");
        sum = new JButton("+");
        divis = new JButton("/");
        multip = new JButton("*");
        printField = new JTextField("0");
        panel = new JPanel();
        panel.add(printField);
        getContentPane().add(panel,BorderLayout.NORTH);
        setBounds(600,300,300,300);
        setDefaultCloseOperation(3);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        getContentPane().add(printField);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt7)
                        .addComponent(butt4)
                        .addComponent(butt1)
                        .addComponent(butt0)
                )
                .addGap(4)
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt8)
                        .addComponent(butt5)
                        .addComponent(butt2)
                        .addComponent(dot)
                )
                .addGap(4)
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt9)
                        .addComponent(butt6)
                        .addComponent(butt3)
                        .addComponent(res)
                )
                .addGap(4)
                .addGroup(layout.createParallelGroup()
                        .addComponent(divis)
                        .addComponent(multip)
                        .addComponent(sub)
                        .addComponent(sum)
                )

        );
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt7)
                        .addComponent(butt8)
                        .addComponent(butt9)
                        .addComponent(divis)
                )
                .addGap(4)
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt4)
                        .addComponent(butt5)
                        .addComponent(butt6)
                        .addComponent(multip)
                )
                .addGap(4)
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt1)
                        .addComponent(butt2)
                        .addComponent(butt3)
                        .addComponent(sub)
                )
                .addGap(4)
                .addGroup(layout.createParallelGroup()
                        .addComponent(butt0)
                        .addComponent(dot)
                        .addComponent(res)
                        .addComponent(sum)
                )
        );
        Dimension size = butt0.getPreferredSize();
        System.out.println(size);
        dot.setMinimumSize(new Dimension(size));
        size = sum.getPreferredSize();
        sub.setMaximumSize(new Dimension(size));
        divis.setMaximumSize(new Dimension(size));
        multip.setMinimumSize(new Dimension(size));


    }


    private JButton sum;
    private JButton sub;
    private JButton multip;
    private JButton divis;
    private JButton res;
    private JButton butt0;
    private JButton butt1;
    private JButton butt2;
    private JButton butt3;
    private JButton butt4;
    private JButton butt5;
    private JButton butt6;
    private JButton butt7;
    private JButton butt8;
    private JButton butt9;
    private JButton dot;
    private JTextField printField;
    private JPanel panel;
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortFrame extends JFrame {
    private JButton upButton;
    private JButton downButton;
    private JButton exitButton;
    private JLabel inputLable;
    private JLabel outputLable;
    private JTextField inputField;
    private JTextField outputField;
    private JPanel jPanel;

    SortFrame(){


        inputLable = new JLabel("Input Numbers");
        outputLable = new JLabel("Output Numbers");
        upButton = new JButton("Sort low to high");
        downButton = new JButton("Sort high to low");
        exitButton = new JButton("Exit Program");
        inputField = new JTextField();
        outputField = new JTextField();
        jPanel = new JPanel();

        Font f = new Font("Serif", Font.BOLD, 12);

        inputLable.setFont(f);
        outputLable.setFont(f);
        upButton.setFont(f);
        downButton.setFont(f);
        exitButton.setFont(f);
        outputField.setFont(f);
        inputField.setFont(f);

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ascendNumbers = Ascendsort();
                outputField.setText(ascendNumbers);
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String descendNumbers = Descendsort();
                outputField.setText(descendNumbers);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel);
        jPanel.setLayout(jPanel1Layout);
        jPanel1Layout
                .setHorizontalGroup(jPanel1Layout
                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(
                                GroupLayout.Alignment.TRAILING,
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap(90, Short.MAX_VALUE)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(downButton)
                                                        .addComponent(upButton))
                                        .addGap(99,99,99))
                        .addGroup(
                                GroupLayout.Alignment.TRAILING,
                                jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(101,Short.MAX_VALUE)
                                        .addComponent(exitButton)
                                        .addGap(112,112,112))
                        .addGroup(
                                jPanel1Layout.createSequentialGroup()
                                        .addGap(113,113,113)
                                        .addComponent(outputLable)
                                        .addContainerGap(121,Short.MAX_VALUE))
                        .addGroup(
                                jPanel1Layout.createSequentialGroup()
                                        .addGap(112,112,112)
                                        .addComponent(inputLable)
                                        .addContainerGap(128,Short.MAX_VALUE))
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addGap(22,22,22)
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(
                                                                GroupLayout.Alignment.TRAILING,false
                                                        )
                                                        .addComponent(outputField,GroupLayout.Alignment.LEADING)
                                                        .addComponent(inputField,GroupLayout.Alignment.LEADING,GroupLayout.DEFAULT_SIZE,272,Short.MAX_VALUE)
                                        )
                                        .addContainerGap(24,Short.MAX_VALUE)
                        )
                );
        jPanel1Layout
                .setVerticalGroup(jPanel1Layout
                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addContainerGap()
                                        .addComponent(inputLable)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputField,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGap(22,22,22)
                                        .addComponent(upButton)
                                        .addGap(18,18,18)
                                        .addComponent(downButton)
                                        .addGap(18,18,18)
                                        .addComponent(outputLable)
                                        .addGap(10,10,10)
                                        .addComponent(outputField,
                                                GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                                LayoutStyle.ComponentPlacement.RELATED,
                                                18,Short.MAX_VALUE)
                                        .addComponent(exitButton)
                                        .addGap(25,25,25)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                GroupLayout.Alignment.LEADING).addGroup(
                GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                        .addContainerGap()
        ));
        layout.setVerticalGroup(layout.createParallelGroup(
                GroupLayout.Alignment.LEADING
        ).addGroup(
                layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                        .addContainerGap()
        ));
        pack();
    }

    String Ascendsort(){
        Sort sort = new Sort();
        String str = inputField.getText();
        Pattern pa = Pattern.compile("[.,\\/\"\\?!:;-_+=*^&%$#@!{}|?><()']");
        Matcher ma = pa.matcher(str);
        String first = ma.replaceAll(" ");
        first = first.replaceAll(" +", " ");
        String[] newstr = first.split(" ");
        int m = newstr.length;
        int[] numbers = new int[m + 1];
        int[] ascendSort;
        String ascendNumbers = "";

        for (int i = 0; i < m; i++) {
            numbers[i] = Integer.parseInt(newstr[i]);
        }
        ascendSort = sort.AscendSort(numbers);
        for (int i = 0; i < (ascendSort.length - 1); i++) {
            ascendNumbers = ascendNumbers + ascendSort[i] + ", ";
        }
        return ascendNumbers + ascendSort[ascendSort.length - 1];
    }

    String Descendsort(){
        Sort sort = new Sort();
        String str = inputField.getText();
        Pattern pa = Pattern.compile("[.,\\/\"\\?!:;-_+=*^&%$#@!{}|?><()']");
        Matcher ma = pa.matcher(str);
        String first = ma.replaceAll(" ");
        first = first.replaceAll(" +", " ");
        String[] newstr = first.split(" ");
        int m = newstr.length;
        int[] numbers = new int[m + 1];
        int[] descendSort;
        String descendNumbers = "";

        for (int i = 0; i < m; i++) {
            numbers[i] = Integer.parseInt(newstr[i]);
        }
        descendSort = sort.DescendSort(numbers);
        for (int i = 0; i < (descendSort.length - 2); i++) {
            descendNumbers = descendNumbers + descendSort[i] + ", ";
        }
        return descendNumbers + descendSort[descendSort.length - 2];
    }

}

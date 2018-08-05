import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIFrame extends JFrame{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    private JPanel rootPanel;
    private JTextField initialStrTF;
    private JTextField searchTF;
    private JTextField replaceTF;
    private JCheckBox registryCB;
    private JButton replaceBT;
    private JTextField resultTF;

    public GUIFrame() {
        setContentPane(rootPanel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 200, 400, 250);
        replaceBT.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String initialStr, search, replace, result;
                initialStr = initialStrTF.getText();
                search = searchTF.getText();
                replace = replaceTF.getText();

                if (replace.length() != 1) {
                    resultTF.setText("Введите один заменяющий символ");
                    replaceTF.setBackground(Color.RED);
                }
                    else {

                char[] initialMas = new char[initialStr.length()];
                initialMas = initialStr.toCharArray();

                char[] searchMas = new char[search.length()];
                searchMas = search.toCharArray();

                for (int i = 0; i < initialStr.length();i++){
                    for (int j = 0; j < search.length(); j++) {
                        if (registryCB.isSelected()) {
                            if (initialMas[i] == searchMas[j]) initialMas[i] = replace.charAt(0);
                        }
                        else {
                            if (Character.toUpperCase(initialMas[i]) == Character.toUpperCase(searchMas[j])) initialMas[i] = replace.charAt(0);
                        }
                    }
                    }
                    result = new String(initialMas);
                    resultTF.setText(result);
                    replaceTF.setBackground(Color.WHITE);
                }

                }

        });

    }

    public String getInitialStr() {
        return initialStrTF.getText();
    }
    public String getSearch() {
        return searchTF.getText();
    }
    public String getReplace() {
        return replaceTF.getText();
    }
    public void setResult (String result) {
        this.resultTF.setText(result);
    }

}

class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("knopka");
    }
}

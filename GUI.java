import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI {
    public void Body(){
        JFrame frame = new JFrame("Calculator");
        frame.setSize(415,435);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,10,295,70);
        Font font = new Font("SansSerif", Font.ROMAN_BASELINE, 18);
        textArea.setFont(font);
        panel.add(textArea);

        JButton btnClear = new JButton("CLR");
        btnClear.setBounds(325,10,75,30);
        btnClear.addActionListener(e -> {
            textArea.setText("");
        });
        panel.add(btnClear);

        JButton btnBackSpace = new JButton("<=");
        btnBackSpace.setBounds(325,50,75,30);
        btnBackSpace.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position

            if (pos>0)
                textArea.replaceRange("",pos-1,pos);
            if (pos==0)
                textArea.setText("");
            pos--;

        });
        panel.add(btnBackSpace);

        JButton btn0 = new JButton("0");
        btn0.setBounds(250,280,65,50);
        btn0.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("0", pos);
        });
        panel.add(btn0);

        JButton btn1 = new JButton("1");
        btn1.setBounds(100,220,65,50);
        btn1.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("1", pos);
        });
        panel.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(175,220,65,50);
        btn2.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("2", pos);
        });
        panel.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(250,220,65,50);
        btn3.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("3", pos);
        });
        panel.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(100,160,65,50);
        btn4.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("4", pos);
        });
        panel.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(175,160,65,50);
        btn5.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("5", pos);
        });
        panel.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(250,160,65,50);
        btn6.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("6", pos);
        });
        panel.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(100,100,65,50);
        btn7.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("7", pos);
        });
        panel.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(175,100,65,50);
        btn8.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("8", pos);
        });
        panel.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(250,100,65,50);
        btn9.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("9", pos);
        });
        panel.add(btn9);

        JButton btnDot = new JButton(".");
        btnDot.setBounds(175,280,65,50);
        btnDot.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert(".", pos);
        });
        panel.add(btnDot);

        JButton btnPlus = new JButton("+");
        btnPlus.setBounds(20,100,65,50);
        btnPlus.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("+", pos);
        });
        panel.add(btnPlus);

        JButton btnMinus = new JButton("-");
        btnMinus.setBounds(20,160,65,50);
        btnMinus.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("-", pos);
        });
        panel.add(btnMinus);

        JButton btnMul = new JButton("*");
        btnMul.setBounds(20,220,65,50);
        btnMul.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("*", pos);
        });
        panel.add(btnMul);

        JButton btnDiv = new JButton("/");
        btnDiv.setBounds(20,280,65,50);
        btnDiv.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("/", pos);
        });
        panel.add(btnDiv);

        JButton btnMod = new JButton("%");
        btnMod.setBounds(100,280,65,50);
        btnMod.addActionListener(e ->  {
            int pos = textArea.getCaretPosition(); //get the cursor position
            textArea.insert("%", pos);
        });
        panel.add(btnMod);

        JButton btnEql = new JButton("Result");
        btnEql.setBounds(100,340,140,50);
        btnEql.addActionListener(e -> {
            String list = textArea.getText();
            for (int i=0;i<list.length();i++) {
                if (list.charAt(i)=='+') {
                    String[] plus = list.toString().split("[+]");
                    double n1=Double.parseDouble(plus[0]);
                    double n2=Double.parseDouble(plus[1]);
                    double r = n1+n2;
                    int pos = textArea.getCaretPosition(); //get the cursor position
                    textArea.insert("\n"+Double.toString(r), pos);
                }
                if (list.charAt(i)=='-') {
                    String[] minus = list.toString().split("[-]");
                    double n1=Double.parseDouble(minus[0]);
                    double n2=Double.parseDouble(minus[1]);
                    double r = n1-n2;
                    int pos = textArea.getCaretPosition(); //get the cursor position
                    textArea.insert("\n"+Double.toString(r), pos);
                }
                if (list.charAt(i)=='*') {
                    String[] mul = list.toString().split("[*]");
                    double n1=Double.parseDouble(mul[0]);
                    double n2=Double.parseDouble(mul[1]);
                    double r = n1*n2;
                    int pos = textArea.getCaretPosition(); //get the cursor position
                    textArea.insert("\n"+Double.toString(r), pos);
                }
                if (list.charAt(i)=='/') {
                    String[] div = list.toString().split("[/]");
                    double n1=Double.parseDouble(div[0]);
                    double n2=Double.parseDouble(div[1]);
                    double r = n1/n2;
                    int pos = textArea.getCaretPosition(); //get the cursor position
                    textArea.insert("\n"+Double.toString(r), pos);
                }
                if (list.charAt(i)=='%') {
                    String[] mod = list.toString().split("[%]");
                    int n1=Integer.parseInt(mod[0]);
                    int n2=Integer.parseInt(mod[1]);
                    int r = n1%n2;
                    int pos = textArea.getCaretPosition(); //get the cursor position
                    textArea.insert("\n"+Integer.toString(r), pos);
                }

            }
        });
        panel.add(btnEql);
        String converter[] = {"Choose an option","Number Conversion", "Roman Number Conversion", "Million Billion Conversion", "Fahrenheit Celsius Conversion"};
        JComboBox cb = new JComboBox(converter);
        panel.add(cb);
        JComboBox cb2 = new JComboBox();
        cb2.setBounds(415, 45, 180, 30);
        panel.add(cb2);
        JButton btnConverter = new JButton("<html>C<br>O<br>N<br>V<br>E<br>R<br>T<br>E<br>R</html>");
        btnConverter.setBounds(325,100,75,230);
        btnConverter.addActionListener(e -> {
            frame.setSize(620,435);
            btnConverter.setVisible(false);
            textArea.setBounds(20,10,295,70);
            btnClear.setBounds(325,10,75,30);
            btnBackSpace.setBounds(325,50,75,30);

            cb.setBounds(415, 10, 180, 30);

            cb2.setVisible(false);

            cb.addActionListener(e1 -> {
                cb2.setVisible(true);
                cb2.removeAllItems();
                int f = cb.getSelectedIndex();
                if (f == 0)
                    cb2.setVisible(false);
                if (f == 1) {
                    cb2.addItem("Binary To Decimal");
                    cb2.addItem("Decimal To Binary");
                    cb2.addItem("Binary To Octal");
                    cb2.addItem("Octal To Binary");
                    cb2.addItem("Binary To Hexadecimal");
                    cb2.addItem("Hexadecimal To Binary");
                    cb2.addItem("Decimal To Hexadecimal");
                    cb2.addItem("Hexadecimal To Decimal");
                    cb2.addItem("Decimal To Octal");
                    cb2.addItem("Octal To Decimal");

                }

                if (f == 2) {
                    cb2.addItem("Integer To Roman");
                    cb2.addItem("Roman To Integer");
                }

                if (f == 3){
                    cb2.addItem("To Million");
                    cb2.addItem("To Billion");
                }
                if (f == 4){
                    cb2.addItem("Fahrenheit To Celsius");
                    cb2.addItem("Celsius To Fahrenheit");
                }
            });

            JButton btnConvert = new JButton("Convert");
            btnConvert.setBounds(425,100,140,50);
            panel.add(btnConvert);

            btnConvert.addActionListener(e2 -> {
                int i = cb2.getSelectedIndex();
                if (cb2.getItemAt(i).equals("Binary To Decimal")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s, 2);
                        textArea.setText(Integer.toString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Decimal To Binary")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s, 10);
                        textArea.setText(Integer.toBinaryString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Binary To Octal")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s, 2);
                        textArea.setText(Integer.toOctalString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Octal To Binary")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s, 8);
                        textArea.setText(Integer.toBinaryString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }

                if (cb2.getItemAt(i).equals("Binary To Hexadecimal")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s, 2);
                        textArea.setText(Integer.toHexString(n).toUpperCase());
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Hexadecimal To Binary")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s, 16);
                        textArea.setText(Integer.toBinaryString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Decimal To Hexadecimal")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s);
                        String hex = Integer.toHexString(n);
                        textArea.setText(hex.toUpperCase());
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Hexadecimal To Decimal")) {
                    String s = textArea.getText();
                    try {
                        int n=Integer.valueOf(s,16);
                        textArea.setText(Integer.toString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Decimal To Octal")) {
                    String s = textArea.getText();
                    try {
                        int n = Integer.parseInt(s);
                        String hex = Integer.toOctalString(n);
                        textArea.setText(hex.toUpperCase());
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Octal To Decimal")) {
                    String s = textArea.getText();
                    try {
                        int n=Integer.valueOf(s,8);
                        textArea.setText(Integer.toString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }


                if (cb2.getItemAt(i).equals("Integer To Roman")) {
                    String s = textArea.getText();
                    try {
                        textArea.setText(toRoman(Integer.parseInt(s)));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Roman To Integer")) {
                    String s = textArea.getText();
                    try {
                        int n=toDecimal(s);
                        textArea.setText(Integer.toString(n));
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }

                if (cb2.getItemAt(i).equals("To Million")) {
                    String s = textArea.getText();
                    try {
                        double n = Double.parseDouble(s);
                        double million = n/1000000;
                        textArea.setText(Double.toString(million)+" million");
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }

                if (cb2.getItemAt(i).equals("To Billion")) {
                    String s = textArea.getText();
                    try {
                        double n = Double.parseDouble(s);
                        double billion = n/1000000000;
                        textArea.setText(Double.toString(billion)+" billion");
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }

                //Fahrenheit Celsius

                if (cb2.getItemAt(i).equals("Fahrenheit To Celsius")) {
                    String s = textArea.getText();
                    try {
                        double n = Double.parseDouble(s);
                        double c = (n-32)*(0.5556);;
                        textArea.setText(Double.toString(c)+" °C");
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }
                if (cb2.getItemAt(i).equals("Celsius To Fahrenheit")) {
                    String s = textArea.getText();
                    try {
                        double n = Double.parseDouble(s);
                        double f = 9 * (n / 5) + 32;
                        textArea.setText(Double.toString(f)+" °F");
                    } catch (Exception exception) {
                        System.out.println(exception);
                    }
                }

            });

            JButton btnA = new JButton("A");
            btnA.setBounds(425,160,65,50);
            btnA.addActionListener(e1 -> {
                int pos = textArea.getCaretPosition(); //get the cursor position
                textArea.insert("A", pos);
            });
            panel.add(btnA);

            JButton btnB = new JButton("B");
            btnB.setBounds(500,160,65,50);
            btnB.addActionListener(e1 -> {
                int pos = textArea.getCaretPosition(); //get the cursor position
                textArea.insert("B", pos);
            });
            panel.add(btnB);

            JButton btnC = new JButton("C");
            btnC.setBounds(425,220,65,50);
            btnC.addActionListener(e1 -> {
                int pos = textArea.getCaretPosition(); //get the cursor position
                textArea.insert("C", pos);
            });
            panel.add(btnC);

            JButton btnD = new JButton("D");
            btnD.setBounds(500,220,65,50);
            btnD.addActionListener(e1 -> {
                int pos = textArea.getCaretPosition(); //get the cursor position
                textArea.insert("D", pos);
            });
            panel.add(btnD);

            JButton btnE = new JButton("E");
            btnE.setBounds(425,280,65,50);
            btnE.addActionListener(e1 -> {
                int pos = textArea.getCaretPosition(); //get the cursor position
                textArea.insert("E", pos);
            });
            panel.add(btnE);

            JButton btnF = new JButton("F");
            btnF.setBounds(500,280,65,50);
            btnF.addActionListener(e1 -> {
                int pos = textArea.getCaretPosition(); //get the cursor position
                textArea.insert("F", pos);
            });
            panel.add(btnF);

        });
        panel.add(btnConverter);

        JButton btnClose = new JButton("<html>C<br>L<br>O<br>S<br>E</html>");
        btnClose.setBounds(325,100,75,230);
        btnClose.addActionListener(e -> {
            frame.setSize(415,435);
            btnConverter.setVisible(true);
            textArea.setBounds(20,10,295,70);
            btnClear.setBounds(325,10,75,30);
            btnBackSpace.setBounds(325,50,75,30);
        });
        panel.add(btnClose);


        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private String toRoman(int num) {
        String roman = "";
        while (num <= 0 && num > 3999) ;


        while (num >= 900) {
            if (num == 900) {
                roman += "CM";
                num = 0;
            } else {
                roman += "M";
                num -= 1000;
            }
        }
        while (num >= 400) {
            if (num == 400) {
                roman += "CD";
                num = 0;
            } else {
                roman += "D";
                num -= 500;
            }
        }
        while (num >= 90) {
            if (num == 90) {
                roman += "XC";
                num = 0;
            } else {
                roman += "C";
                num -= 100;
            }
        }
        while (num >= 40) {
            if (num == 40) {
                roman += "XL";
                num = 0;
            } else {
                roman += "L";
                num -= 50;
            }
        }
        while (num >= 9) {
            if (num == 9) {
                roman += "IX";
                num = 0;
            } else {
                roman += "X";
                num -= 10;
            }
        }
        while (num >= 4) {
            if (num == 4) {
                roman += "IV";
                num = 0;
            } else {
                roman += "V";
                num -= 5;
            }
        }
        while (num >= 1) {
            roman += "I";
            num -= 1;
        }
        return roman;

    }
    private int toDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }
}

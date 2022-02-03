import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    boolean isOperatorClicked=false;
    JFrame jf;JLabel displayLabel;
    JButton sevenB;JButton eightB;JButton nineB;JButton fourB;JButton fiveB;JButton sixB;
    JButton oneB;JButton twoB;JButton threeB;JButton dotB;JButton zeroB;JButton equalB;
    JButton divB;JButton mulB;JButton subB;JButton addB;JButton clearB;
    String oldValue;
    String newValue;
    float result;
    float oldValueF;
    float newValueF;
    char operator;
    

    public Calculator (){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(550, 600);
        jf.setLocation(300, 150);

        displayLabel= new JLabel();
        displayLabel.setBounds(30, 50, 480, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenB=new JButton("7");
        sevenB.setBounds(30, 130, 80, 80);
        sevenB.setFont(new Font("Arial",Font.PLAIN,40));
        sevenB.addActionListener(this);
        jf.add(sevenB);

        eightB=new JButton("8");
        eightB.setBounds(130, 130, 80, 80);
        eightB.setFont(new Font("Arial",Font.PLAIN,40));
        eightB.addActionListener(this);
        jf.add(eightB);

        nineB=new JButton("9");
        nineB.setBounds(230, 130, 80, 80);
        nineB.setFont(new Font("Arial",Font.PLAIN,40));
        nineB.addActionListener(this);
        jf.add(nineB);

        
        fourB=new JButton("4");
        fourB.setBounds(30, 230, 80, 80);
        fourB.setFont(new Font("Arial",Font.PLAIN,40));
        fourB.addActionListener(this);
        jf.add(fourB);

        fiveB=new JButton("5");
        fiveB.setBounds(130, 230, 80, 80);
        fiveB.setFont(new Font("Arial",Font.PLAIN,40));
        fiveB.addActionListener(this);
        jf.add(fiveB);

        sixB=new JButton("6");
        sixB.setBounds(230, 230, 80, 80);
        sixB.setFont(new Font("Arial",Font.PLAIN,40));
        sixB.addActionListener(this);
        jf.add(sixB);

        oneB=new JButton("1");
        oneB.setBounds(30, 330, 80, 80);
        oneB.setFont(new Font("Arial",Font.PLAIN,40));
        oneB.addActionListener(this);
        jf.add(oneB);

        twoB=new JButton("2");
        twoB.setBounds(130, 330, 80, 80);
        twoB.setFont(new Font("Arial",Font.PLAIN,40));
        twoB.addActionListener(this);
        jf.add(twoB);

        threeB=new JButton("3");
        threeB.setBounds(230, 330, 80, 80);
        threeB.setFont(new Font("Arial",Font.PLAIN,40));
        threeB.addActionListener(this);
        jf.add(threeB);

        dotB=new JButton(".");
        dotB.setBounds(30, 430, 80, 80);
        dotB.setFont(new Font("Arial",Font.PLAIN,40));
        dotB.addActionListener(this);
        jf.add(dotB);

        zeroB=new JButton("0");
        zeroB.setBounds(130, 430, 80, 80);
        zeroB.setFont(new Font("Arial",Font.PLAIN,40));
        zeroB.addActionListener(this);
        jf.add(zeroB);

        equalB=new JButton("=");
        equalB.setBounds(230, 430, 80, 80);
        equalB.setFont(new Font("Arial",Font.PLAIN,40));
        equalB.addActionListener(this);
        jf.add(equalB);

        divB=new JButton("/");
        divB.setBounds(330, 130, 80, 80);
        divB.setFont(new Font("Arial",Font.PLAIN,40));
        divB.addActionListener(this);
        jf.add(divB);

        mulB=new JButton("*");
        mulB.setBounds(330, 230, 80, 80);
        mulB.setFont(new Font("Arial",Font.PLAIN,40));
        mulB.addActionListener(this);
        jf.add(mulB);

        subB=new JButton("-");
        subB.setBounds(330, 330, 80, 80);
        subB.setFont(new Font("Arial",Font.PLAIN,40));
        subB.addActionListener(this);
        jf.add(subB);

        addB=new JButton("+");
        addB.setBounds(330, 430, 80, 80);
        addB.setFont(new Font("Arial",Font.PLAIN,40));
        addB.addActionListener(this);
        jf.add(addB);

        clearB=new JButton("c");
        clearB.setBounds(430, 130, 80, 80);
        clearB.setFont(new Font("Arial",Font.PLAIN,40));
        clearB.addActionListener(this);
        jf.add(clearB);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

  @Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if(e.getSource()==sevenB){
        if(isOperatorClicked){
            displayLabel.setText("7");
            isOperatorClicked=false;
        }else{
            displayLabel.setText(displayLabel.getText()+"7");
        }
       
    }else if(e.getSource()==eightB){
        if(isOperatorClicked){
            displayLabel.setText("8");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"8");
        }
    }else if(e.getSource()==nineB){
        if(isOperatorClicked){
            displayLabel.setText("9");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"9");
        }
    }else if(e.getSource()==fourB){
        if(isOperatorClicked){
            displayLabel.setText("4");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"4");
        }
    }else if(e.getSource()==fiveB){
        if(isOperatorClicked){
            displayLabel.setText("5");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"5");
        }
    }else if(e.getSource()==sixB){
        if(isOperatorClicked){
            displayLabel.setText("6");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"6");
        }
    }else if(e.getSource()==oneB){
        if(isOperatorClicked){
            displayLabel.setText("1");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"1");
        }
    }else if(e.getSource()==twoB){
        if(isOperatorClicked){
            displayLabel.setText("2");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"2");
        }
    }else if(e.getSource()==threeB){
        if(isOperatorClicked){
            displayLabel.setText("3");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"3");
        }
    }else if(e.getSource()==dotB){
        if(isOperatorClicked){
            displayLabel.setText(".");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+".");
        }
    }else if(e.getSource()==zeroB){
        if(isOperatorClicked){
            displayLabel.setText("0");
            isOperatorClicked=false;
        }else{
        displayLabel.setText(displayLabel.getText()+"0");
        }
    }

    else if(e.getSource()==equalB){

        newValue=displayLabel.getText();
        newValueF= Float.parseFloat(newValue);
        oldValueF= Float.parseFloat(oldValue); 
        
       switch(operator){
           case'+':
          result=oldValueF+newValueF;
          break;
          case'-':
          result=oldValueF-newValueF;
          break;
          case'*':
          result=oldValueF*newValueF;
          break;
          case'/':
          result=oldValueF/newValueF;
          break;
       }
       displayLabel.setText(result+"");
    }

    else if(e.getSource()==divB){
         isOperatorClicked=true;
      oldValue= displayLabel.getText();
      operator='/';
    }else if(e.getSource()==mulB){
         isOperatorClicked=true;
      oldValue= displayLabel.getText();
      operator='*';
    }else if(e.getSource()==subB){
         isOperatorClicked=true;
      oldValue= displayLabel.getText();
      operator='-';
    }
    else if(e.getSource()==addB){
      isOperatorClicked=true;
      oldValue= displayLabel.getText();
    operator='+';
    }
       else if(e.getSource()==clearB){
        displayLabel.setText("");
    }
   
    
}
}

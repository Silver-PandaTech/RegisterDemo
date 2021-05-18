package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Controller {
    @FXML
    public TextField textOut;
    @FXML
    public TextField totalText;

    public void One(ActionEvent e) {
        totalText.setText(totalText.getText() + "1");
        textOut.setText(textOut.getText() + "1");
    }

    public void Add(ActionEvent e) {
        String out = textOut.getText();
        double v = Double.valueOf(out);
        setTotal(v);
        // System.out.println(getTotal());
        // setoddBall(v);
        textOut.clear();
        totalText.setText(totalText.getText() + " + ");
    }

    //private double oddBall;

    // public void setoddBall(double p) {
    //    this.oddBall = p;
    // }

    // public double getoddBall() {
    //    return oddBall;
    // }

    public double Total;

    public void setTotal(double r) {
        this.Total += r;
    }

    public double getTotal() {
        return Total;
    }

    public void Two(ActionEvent e) {
        totalText.setText(totalText.getText() + "2");
        textOut.setText(textOut.getText() + "2");

    }

    public void Three(ActionEvent e) {
        totalText.setText(totalText.getText() + "3");
        textOut.setText(textOut.getText() + "3");

    }

    public void Four(ActionEvent e) {
        totalText.setText(totalText.getText() + "4");
        textOut.setText(textOut.getText() + "4");
    }

    public void Five(ActionEvent e) {
        totalText.setText(totalText.getText() + "5");
        textOut.setText(textOut.getText() + "5");
    }

    public void Six(ActionEvent e) {
        totalText.setText(totalText.getText() + "6");
        textOut.setText(textOut.getText() + "6");
    }

    public void Seven(ActionEvent e) {
        totalText.setText(totalText.getText() + "7");
        textOut.setText(textOut.getText() + "7");
    }

    public void Eight(ActionEvent e) {
        totalText.setText(totalText.getText() + "8");
        textOut.setText(textOut.getText() + "8");
    }

    public void Nine(ActionEvent e) {
        totalText.setText(totalText.getText() + "9");
        textOut.setText(textOut.getText() + "9");
    }

    public void Dot(ActionEvent e) {
        totalText.setText(totalText.getText() + ".");
        textOut.setText(textOut.getText() + ".");
    }

    public void Zero(ActionEvent e) {
        totalText.setText(totalText.getText() + "0");
        textOut.setText(textOut.getText() + "0");
    }

    public void Clear(ActionEvent e) {
        textOut.clear();
        totalText.clear();
    }

    public void Enter(ActionEvent e) {
        int total = 0;
        double Awnser = getTotal();
        double pp = (Awnser + (Awnser * (0.08)));
        DecimalFormat f = new DecimalFormat("####.00");

        textOut.setText(String.valueOf(f.format(pp)));
        Total = 0;
        totalText.setText(totalText.getText() + " =");
    }

    public void ActionFour(ActionEvent e) {
        totalText.setText(totalText.getText() + "7.99");
        textOut.setText(textOut.getText() + "7.99");
    }

    public void ActionOne(ActionEvent e) {
        totalText.setText(totalText.getText() + "8.99");
        textOut.setText(textOut.getText() + "8.99");
    }

    public void ActionTwo(ActionEvent e) {
        totalText.setText(totalText.getText() + "9.99");
        textOut.setText(textOut.getText() + "9.99");
    }

    public void ActionThree(ActionEvent e) {
        totalText.setText(totalText.getText() + "10.99");
        textOut.setText(textOut.getText() + "10.99");
    }

    public double sales;

    public void setSales(double y) {
        this.sales += y;
    }

    public double getSales() {
        return sales;
    }
}



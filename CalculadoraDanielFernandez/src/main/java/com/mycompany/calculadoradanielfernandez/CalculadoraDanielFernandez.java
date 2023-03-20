/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoradanielfernandez;

import java.awt.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.*;
/**
 *
 * @author danif
 */
public class CalculadoraDanielFernandez extends JFrame implements ActionListener {





// CREAMOS LOS ARRAYLIST Y LOS CLICK VAMOS A HACER
    ArrayList<String> values = new ArrayList<>();
    
    ArrayList<JButton> buttons = new ArrayList<>();

    int click1 = -1;

    int click2 = -1;

// CREAMOS UNA VARIABLE PARA LA PUNTUACION DEL JUGADOR
    int puntuacion = 0;
    

    public CalculadoraDanielFernandez() {

        super("Juego de memoria");


// DAMOS FORMA Y AÑADIMOS LAS CARACTERISTICAS A NUESTRO LAYOUT
        setLayout(new GridLayout(4, 4));

        setSize(800, 800);

        setLocation(400, 0);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addValors();

        createButtons();

        addButtons();

        addAction();

        setVisible(true);

    }

    private void addButtons() {

        for (JButton button : buttons) {
            button.setBackground(Color.CYAN);
            add(button);

        }

    }

    private void addAction() {

        for (JButton button : buttons) {

            button.addActionListener(this);

            button.setOpaque(true);

        }

    }

    // AÑADIMOS LOS BOTONES

    private void createButtons() {

        for (int i = 0; i < 16; i++)

        
            buttons.add(new JButton());

    }


    // AÑADIMOS LOS VALORES A NUESTROS BOTONES
    private void addValors() {

        values.add("Ordenador");

        values.add("Ordenador");

        values.add("Videoconsola");

        values.add("Videoconsola");

        values.add("Servidor");

        values.add("Servidor");

        values.add("Router");

        values.add("Router");

        values.add("Movil");

        values.add("Movil");

        values.add("Tablet");

        values.add("Tablet");

        values.add("Smartwatch");

        values.add("Smartwatch");

        values.add("Raspberry");

        values.add("Raspberry");

        // Randomizamos la lista

        Collections.shuffle(values);

    }

    @Override

    // AGREGAMOS LAS ACCIONES CORRESPONDIENTES A CADA BOTON

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttons.get(0)) {

            buttons.get(0).setText(values.get(0));

            if (click1 == -1) {

                click1 = 0;

            } else {

                click2 = 0;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(1)) {

            buttons.get(1).setText(values.get(1));

            if (click1 == -1) {

                click1 = 1;

            } else {

                click2 = 1;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(2)) {

            buttons.get(2).setText(values.get(2));

            if (click1 == -1) {

                click1 = 2;

            } else {

                click2 = 2;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(3)) {

            buttons.get(3).setText(values.get(3));

            if (click1 == -1) {

                click1 = 3;

            } else {

                click2 = 3;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(4)) {

            buttons.get(4).setText(values.get(4));

            if (click1 == -1) {

                click1 = 4;

            } else {

                click2 = 4;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(5)) {

            buttons.get(5).setText(values.get(5));

            if (click1 == -1) {

                click1 = 5;

            } else {

                click2 = 5;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(6)) {

            buttons.get(6).setText(values.get(6));

            if (click1 == -1) {

                click1 = 6;

            } else {

                click2 = 6;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(7)) {

            buttons.get(7).setText(values.get(7));

            if (click1 == -1) {

                click1 = 7;

            } else {

                click2 = 7;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(8)) {

            buttons.get(8).setText(values.get(8));

            if (click1 == -1) {

                click1 = 8;

            } else {

                click2 = 8;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(9)) {

            buttons.get(9).setText(values.get(9));

            if (click1 == -1) {

                click1 = 9;

            } else {

                click2 = 9;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(10)) {

            buttons.get(10).setText(values.get(10));

            if (click1 == -1) {

                click1 = 10;

            } else {

                click2 = 10;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(11)) {

            buttons.get(11).setText(values.get(11));

            if (click1 == -1) {

                click1 = 11;

            } else {

                click2 = 11;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(12)) {

            buttons.get(12).setText(values.get(12));

            if (click1 == -1) {

                click1 = 12;

            } else {

                click2 = 12;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(13)) {

            buttons.get(13).setText(values.get(13));

            if (click1 == -1) {

                click1 = 13;

            } else {

                click2 = 13;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(14)) {

            buttons.get(14).setText(values.get(14));

            if (click1 == -1) {

                click1 = 14;

            } else {

                click2 = 14;

                compareValues();

            }

        }

        if (e.getSource() == buttons.get(15)) {

            buttons.get(15).setText(values.get(15));

            if (click1 == -1) {

                click1 = 15;

            } else {

                click2 = 15;

                compareValues();

            }

        }

    }


    // CREAMOS UNA FUNCION PARA COMPARAR LOS VALORES DE CADA BOTON
    private void compareValues() {

      

        if (click1 != click2) {

            if (!buttons.get(click1).getText().equals(buttons.get(click2).getText())) {

                buttons.get(click1).setText("");

                buttons.get(click2).setText("");

            } else {

               
                
                buttons.get(click1).setEnabled(false);

                buttons.get(click1).setBackground(new Color(0xa1ff8a));

                buttons.get(click2).setEnabled(false);

                buttons.get(click2).setBackground(new Color(0xa1ff8a));
                puntuacion = puntuacion + 10;
                JOptionPane.showMessageDialog(null, "Puntuación del jugador: "+puntuacion);
               
            }
           

        } else {

            buttons.get(click1).setText("");

        }

        click1 = -1;

        click2 = -1;

    }

    public static void main(String[] args) {
        CalculadoraDanielFernandez app = new CalculadoraDanielFernandez();
    }
}



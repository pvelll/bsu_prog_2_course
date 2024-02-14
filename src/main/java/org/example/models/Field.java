package org.example.models;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Field extends JPanel {
    private boolean paused;
    private final ArrayList<BouncingBall> balls = new ArrayList<BouncingBall>(10);
    private BouncingBall selectedBall;
    private int endMouseX;
    private int endMouseY;
    private int startMouseX;
    private int startMouseY;
    private long startMouseTime;
    private long endMouseTime;

    public Field() {
        setBackground(Color.WHITE);
        Timer repaintTimer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                repaint();
            }
        });
        repaintTimer.start();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                startMouseX = e.getX();
                startMouseY = e.getY();
                startMouseTime = System.currentTimeMillis();
                for (BouncingBall ball : balls) {
                    if (ball.isInBall(startMouseX, startMouseY)) {
                        pause();
                        selectedBall = ball;
                        break;
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                endMouseX = e.getX();
                endMouseY = e.getY();
                endMouseTime = System.currentTimeMillis();
                if(selectedBall != null) {
                    selectedBall.changeSpeed(startMouseX,startMouseY,endMouseX,endMouseY,startMouseTime,endMouseTime);
                    selectedBall = null;
                    resume();
                }
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D canvas = (Graphics2D) g;
        for (BouncingBall ball : balls) {
            ball.paint(canvas);
        }
    }

    public void addBall() {
        balls.add(new BouncingBall(this));
    }

    public synchronized void pause() {
        paused = true;
    }
    public boolean isPaused(){
        return paused;
    }


    public synchronized void resume() {
        paused = false;
        notifyAll();
    }

    public synchronized void canMove(BouncingBall ball) throws
            InterruptedException {
        if (paused) {
            wait();
        }
    }
}


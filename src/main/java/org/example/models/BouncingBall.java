package org.example.models;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class BouncingBall implements Runnable {
    private static final int MAX_RADIUS = 40;
    private static final int MIN_RADIUS = 3;
    private static final int MAX_SPEED = 15;
    private final Field field;
    private final int radius;
    private final Color color;
    private double x;
    private double y;
    private Double speed;
    private double speedX;
    private double speedY;

    public BouncingBall(Field field) {
        this.field = field;
        radius = Double.valueOf(Math.random() * (MAX_RADIUS -
                MIN_RADIUS)).intValue() + MIN_RADIUS;
        speed = (double) Double.valueOf(Math.round((double) (5 * MAX_SPEED) / radius)).intValue();
        if (speed > MAX_SPEED) {
            speed = (double) MAX_SPEED;
        }
        double angle = Math.random() * 2 * Math.PI;
        speedX = 3 * Math.cos(angle);
        speedY = 3 * Math.sin(angle);
        color = new Color((float) Math.random(), (float) Math.random(),
                (float) Math.random());
        x = Math.random() * (field.getSize().getWidth() - 2 * radius) + radius;
        y = Math.random() * (field.getSize().getHeight() - 2 * radius) + radius;
        Thread thisThread = new Thread(this);
        thisThread.start();
    }

    public void run() {
        try {
            while (true) {
                field.canMove(this);
                if (x + speedX <= radius) {
                    speedX = -speedX;
                    x = radius;
                } else if (x + speedX >= field.getWidth() - radius) {
                    speedX = -speedX;
                    x = Double.valueOf(field.getWidth() - radius).intValue();
                } else if (y + speedY <= radius) {
                    speedY = -speedY;
                    y = radius;
                } else if (y + speedY >= field.getHeight() - radius) {
                    speedY = -speedY;
                    y = Double.valueOf(field.getHeight() - radius).intValue();
                } else {
                    x += speedX;
                    y += speedY;
                }
                Thread.sleep((long) (16 - speed));
            }
        } catch (InterruptedException ignored) {
        }
    }

    public void changeSpeed(
            int startX, int startY, int endX, int endY, long startTime, long endTime
    ) { // change speed by mouse click and hold
        double angle = Math.atan2(endY - startY, endX - startX);
        double distance = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        speed = distance / ((endTime - startTime) / 50);
        if (speed > MAX_SPEED) {
            speed = (double) MAX_SPEED;
        }
        speedX = speed * Math.cos(angle);
        speedY = speed * Math.sin(angle);
    }

    public boolean isInBall(int x, int y) {  //check if mouse is in ball
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= radius;
    }

    public void paint(Graphics2D canvas) {
        canvas.setColor(color);
        canvas.setPaint(color);
        Ellipse2D.Double ball = new Ellipse2D.Double(x - radius, y - radius,
                2 * radius, 2 * radius);
        canvas.draw(ball);
        canvas.fill(ball);
    }
}

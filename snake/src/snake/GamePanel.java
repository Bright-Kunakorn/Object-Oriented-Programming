package snake;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGTH = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGTH*SCREEN_WIDTH) / UNIT_SIZE;
    static final int DELAY = 120;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int ItemCollect;
    int ItemX;
    int ItemY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGTH));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MykeyAdapter());
        GameStart();
    }
    public void GameStart(){
        NewItem();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        if (running){
            for(int i=0;i<SCREEN_HEIGTH/UNIT_SIZE;i++){
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGTH);
                g.drawLine(0,i*UNIT_SIZE, SCREEN_WIDTH ,i*UNIT_SIZE);
            }
            g.setColor(Color.YELLOW);
            g.fillOval(ItemX, ItemY, UNIT_SIZE, UNIT_SIZE);

            for(int i = 0;i<bodyParts;i++){
                if(i == 0){
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
                else{
                    g.setColor(new Color(45,180,0));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.RED);
            g.setFont(new Font("Ink Free",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score : "+ItemCollect,(SCREEN_WIDTH-metrics.stringWidth("Score : "+ItemCollect))/2 ,g.getFont().getSize());
        }
        else{
            GameOver(g);
        }
    }
    public void NewItem() {
        ItemX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        ItemY = random.nextInt((int)(SCREEN_HEIGTH/UNIT_SIZE))*UNIT_SIZE;
    }
    public void move(){
        for(int i = bodyParts;i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(direction){
            case 'U' :
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D' :
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L' :
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R' :
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }
    public void CheckItem(){
        if ((x[0] == ItemX) && (y[0] == ItemY)){
            bodyParts++;
            ItemCollect++;
            NewItem();
        }
    }
    public void CheckCollision(){
        for(int i = bodyParts;i>0;i--){
            if ((x[0] == x[i]) && (y[0]== y[i])){
                running = false;
            }
        }
        if (x[0] < 0){
            running = false;
        }
        if (x[0] > SCREEN_WIDTH){
            running = false;
        }
        if (y[0] < 0){
            running = false;
        }
        if (y[0] > SCREEN_HEIGTH){
            running = false;
        }
        if (!running){
            timer.stop();
        }
    }
    public void GameOver(Graphics g){
        
        g.setColor(Color.RED);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("GAME OVER",(SCREEN_WIDTH-metrics.stringWidth("GAME OVER"))/2 ,SCREEN_HEIGTH/2);
        g.setColor(Color.RED);
        g.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("press any key",(SCREEN_WIDTH-metrics1.stringWidth("press any key"))/2 ,(SCREEN_HEIGTH/2)+100);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            move();
            CheckItem();
            CheckCollision();
        }
        repaint();
        
    }
    public class MykeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if (direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L'){
                        direction = 'R';
                    }
                    break;   
                case KeyEvent.VK_UP:
                    if (direction != 'D'){
                        direction = 'U';
                    }
                    break; 
                case KeyEvent.VK_DOWN:
                    if (direction != 'U'){
                        direction = 'D';
                    }
                    break; 
            }
        }
    }
    


}

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ChromeDinosaur extends JPanel implements ActionListener, KeyListener {
    int boardWidth = 750;
    int boardHeight = 250;

    //images
    Image dinosaurImg;
    Image dinosaurDeadImg;
    Image dinosaurJumpImg;
    Image cactus1Img;
    Image cactus2Img;
    Image cactus3Img;
    Image trackImg;
    Image birdImg;

    class Block {
        int x;
        int y;
        int width;
        int height;
        Image img;

        Block(int x, int y, int width, int height, Image img) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.img = img;
        }
    }

    //dinosaur
    int dinosaurWidth = 88;
    int dinosaurHeight = 94;
    int dinosaurX = 50;
    int dinosaurY = boardHeight - dinosaurHeight;

    Block dinosaur;

    //cactus
    int cactus1Width = 34;
    int cactus2Width = 69;
    int cactus3Width = 102;

    int cactusHeight = 70;
    int cactusX = 700;
    int cactusY = boardHeight - cactusHeight;
    ArrayList<Block> cactusArray;

    // Add with other board/dinosaur variables
    int trackX = 0;           // Fixed x-position (left edge of the board)
    int trackY = boardHeight - 20; // Adjust height to align with dinosaur’s ground (e.g., 20px high track)
    int trackWidth = boardWidth;   // Matches board width (750)
    int trackHeight = 20;          // Height of the track (adjust based on your image)
    //bird 
    int birdWidth = 70;
    int birdHeight = 70;
    int birdX = 700;
    int birdY = boardHeight* 6 / 10;
    ArrayList<Block> birdArray;

    //physics
    int velocityX = -12; //cactus moving left speed
    int velocityY = 0; //dinosaur jump speed
    int gravity = 1;

    boolean gameOver = false;
    double score = 0;
    double highScore = 0;

    Timer gameLoop;
    Timer placeCactusTimer;

    public ChromeDinosaur() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.lightGray);
        setFocusable(true);
        addKeyListener(this);

        dinosaurImg = new ImageIcon(getClass().getResource("./img/dino-run.gif")).getImage();
        dinosaurDeadImg = new ImageIcon(getClass().getResource("./img/dino-dead.png")).getImage();
        dinosaurJumpImg = new ImageIcon(getClass().getResource("./img/dino-jump.png")).getImage();
        cactus1Img = new ImageIcon(getClass().getResource("./img/cactus1.png")).getImage();
        cactus2Img = new ImageIcon(getClass().getResource("./img/cactus2.png")).getImage();
        cactus3Img = new ImageIcon(getClass().getResource("./img/cactus3.png")).getImage();
        trackImg = new ImageIcon(getClass().getResource("./img/track.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./img/bird.gif")).getImage();


        //dinosaur
        dinosaur = new Block(dinosaurX, dinosaurY, dinosaurWidth, dinosaurHeight, dinosaurImg);
        //cactus
        cactusArray = new ArrayList<Block>();
        birdArray = new ArrayList<Block>();

        //game timer
        gameLoop = new Timer(1000/60, this); //1000/60 = 60 frames per 1000ms (1s), update
        gameLoop.start();

        //place cactus timer
        placeCactusTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placeObstacle();
            }
        });
        placeCactusTimer.start();
    }

    void placeObstacle() {
        if (gameOver) {
            return;
        }


        double placeCactusChance = Math.random(); //0 - 0.999999
        if (placeCactusChance > .90) { //10% you get cactus3
            Block cactus = new Block(cactusX, cactusY, cactus3Width, cactusHeight, cactus3Img);
            cactusArray.add(cactus);
        }
        else if (placeCactusChance > .70) { //20% you get cactus2
            Block cactus = new Block(cactusX, cactusY, cactus2Width, cactusHeight, cactus2Img);
            cactusArray.add(cactus);
        }
        else if (placeCactusChance > .50) { //20% you get cactus1
            Block cactus = new Block(cactusX, cactusY, cactus1Width, cactusHeight, cactus1Img);
            cactusArray.add(cactus);
        } else if(placeCactusChance > .30){
            Block bird = new Block(birdX, birdY, birdWidth, birdHeight, birdImg);
            birdArray.add(bird);
        } else if(placeCactusChance > .10){
            birdY -= boardHeight * 3 / 10;
            Block bird = new Block(birdX, birdY, birdWidth, birdHeight, birdImg);
            birdArray.add(bird);
            birdY += boardHeight * 3 / 10;
        }

        if (cactusArray.size() > 5) {
            cactusArray.remove(0); //remove the first cactus from ArrayList
        }
        if(birdArray.size() > 5){
            birdArray.remove(0);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // draw the track
        g.drawImage(trackImg, trackX, trackY, trackWidth, trackHeight, null);              // First segment
        g.drawImage(trackImg, trackX + trackWidth, trackY, trackWidth, trackHeight, null);
        //dinosaur
        g.drawImage(dinosaur.img, dinosaur.x, dinosaur.y, dinosaur.width, dinosaur.height, null);

        //cactus
        for (int i = 0; i < cactusArray.size(); i++) {
            Block cactus = cactusArray.get(i);
            g.drawImage(cactus.img, cactus.x, cactus.y, cactus.width, cactus.height, null);
        }
        //bird
        for (int i = 0; i < birdArray.size(); i++) {
            Block bird = birdArray.get(i);
            g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
        }

        //score
        if (score < highScore) {
            g.setColor(Color.red);  
        } 
        else {
            g.setColor(new Color(0, 178, 0)); 
        }
        g.setFont(new Font("Courier", Font.PLAIN, 32));
        if (gameOver) {
            g.drawString("Game Over: You Survived " + String.valueOf(Math.round(score * 100.0) / 100.0) + " Seconds.", 10, 35);
        }
        else {
            g.drawString(String.valueOf(Math.round(score * 100.0) / 100.0), 10, 35);
            g.drawString(String.valueOf("highscore: " + Math.round(this.highScore * 100.0) / 100.0), 300, 35);
        }
    }

    public void move() {
        //dinosaur
        velocityY += gravity;
        dinosaur.y += velocityY;

        // track movement
        trackX += velocityX; 
        if (trackX <= -trackWidth) { 
            trackX += trackWidth;
        }

        if (dinosaur.y > dinosaurY) { //stop the dinosaur from falling past the ground
            dinosaur.y = dinosaurY;
            velocityY = 0;
            dinosaur.img = dinosaurImg;
        }

        //cactus
        for (int i = 0; i < cactusArray.size(); i++) {
            Block cactus = cactusArray.get(i);
            cactus.x += velocityX;

            if (collision(dinosaur, cactus)) {
                gameOver = true;
                dinosaur.img = dinosaurDeadImg;
            }
        }

        for (int i = 0; i < birdArray.size(); i++) {
            Block bird = birdArray.get(i);
            bird.x += velocityX;

            if (collision(dinosaur, bird)) {
                gameOver = true;
                dinosaur.img = dinosaurDeadImg;
            }
        }

        score += 0.0167;
    }

    boolean collision(Block a, Block b) {
        return a.x + 50 < b.x + b.width &&   //a's top left corner doesn't reach b's top right corner
               a.x + a.width > b.x + 5&&   //a's top right corner passes b's top left corner
               a.y + 5 < b.y + b.height &&  //a's top left corner doesn't reach b's bottom left corner
               a.y + a.height > b.y + 30;    //a's bottom left corner passes b's top rigt corner
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameOver) {
            placeCactusTimer.stop();
            gameLoop.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            // System.out.println("JUMP!");
            if (dinosaur.y == dinosaurY) {
                velocityY = -17;
                dinosaur.img = dinosaurJumpImg;
            }
            
            if (gameOver) {
                //restart game by resetting conditions

                if (this.score > this.highScore){
                    this.highScore = this.score;
                }
                dinosaur.y = dinosaurY;
                dinosaur.img = dinosaurImg;
                velocityY = 0;
                cactusArray.clear();
                birdArray.clear();

                score = 0;
                gameOver = false;
                gameLoop.start();
                placeCactusTimer.start();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}

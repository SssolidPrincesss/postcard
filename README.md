Открытка  

При каждом повторном запуске программы или открытии фрейма открытка перерисовывается и цвета фигур на фоне меняются:  
![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/postcard1.png)
![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/postcard2.png)

Что насчет составляющих программы?  
Разберем подробнее основные моменты:  

класс Postcard - точка входа программы, то, с чего начинается все веселье:  

```java
import javax.swing.*;
import java.awt.*;

public class Postcard{
	JFrame frame;
	
	public static void main(String[] args) {
		Postcard card  = new Postcard();
		card.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel panel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setSize(450, 700);
		frame.setVisible(true);
	}
}
```



Класс MyDrawPanel - то, при помощи чего происходит отрисовка:

Сначала библиотеки:
```java
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
```
Тот самый волшебный параметр:
```java
public class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) 
```
А теперь разберемся, как нарисовать основные элементы открытки:  
Метод для генерации рандомного цвета:  
  
```java
	public Color generateColor() {
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color rc = new Color(red, green, blue);
		
		return rc;	
	}
```

Прямоугольник, закрашенный случайным цветом:  

  
```java
		randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillRect(30, 40, 300, 300);
```
![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/rectangle.png)  

Незакрашенный треугольник  
```java
            Graphics2D g2d = (Graphics2D) g;
            float lineWidth = 4.0f;
            g2d.setStroke(new BasicStroke(lineWidth));
        
	    int x1 = 90, y1 = 250;
	    int x2 = 150, y2 = 50;
	    int x3 = 400, y3 = 600;
	    g.setColor(randomColor);
	    g.drawLine(x1, y1, x2, y2); 
	    g.drawLine(x2, y2, x3, y3);
	    g.drawLine(x3, y3, x1, y1);
```
![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/triangle.png)  

Белая плашка  
```java
		g.setColor(Color.WHITE);
		g.fillRect(85, 325, 275, 35);
```
![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/Plashka.png)  

Текст  
```java
		g.setColor(Color.BLACK);
        	g.setFont(new Font("Serif", Font.BOLD, 30));
        	g.drawString("С днем металлурга!", 90, 350);
```
![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/text.png)  

P.S. Полный код можно найти в папке src  

![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/kot.png)   

Секретный код для любознательных:  
```java

public MyDrawPanel() {
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }
```
Подумай, для чего нужен этот блок кода, и как его можно интегрировать в программу




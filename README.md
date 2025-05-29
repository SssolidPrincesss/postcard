Открытка

класс Postcard

```java
package mkpostkardclout;

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


Класс MyDrawPanel
```java
package mkpostkardclout;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {

		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(30, 40, 300, 300);
		
		
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
	    
	    
	    red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(150, 160, 250, 250);
		
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(70, 120, 150, 400);
		
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(200, 60, 250, 20);
		
		
		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(300, 90, 150, 20);
		

		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(250, 50, 20, 600);
		
		
		
		g.setColor(Color.WHITE);
		g.fillRect(85, 325, 275, 35);
		
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("С днем металлурга!", 90, 350);
		
	}
	
}
```

![menu](https://github.com/SssolidPrincesss/postcard/blob/main/images/postcard1.png)

Научимся рисовать прямоугольник, закрашенный случайным цветом

```java
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(30, 40, 300, 300);
```

![image](https://github.com/SssolidPrincesss/postcard/blob/main/images/rectangle.png)

Oтрисовка незакрашенного треугольника

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
![image](https://github.com/SssolidPrincesss/postcard/blob/main/images/triangle.png)

Cоздаем прямоугольник белого цвета

```java
		g.setColor(Color.WHITE);
		g.fillRect(85, 325, 275, 35);
```
![image](https://github.com/SssolidPrincesss/postcard/blob/main/images/Plashka.png)

И сам текст
```java
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("С днем металлурга!", 90, 350);
```
![image](https://github.com/SssolidPrincesss/postcard/blob/main/images/text.png)

Открытка готова

![image](https://github.com/SssolidPrincesss/postcard/blob/main/images/postcard2.png)



![image](https://github.com/SssolidPrincesss/postcard/blob/main/images/kot.png)

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;



@SuppressWarnings("serial")
public class gridpane extends JPanel implements MouseListener, MouseMotionListener {

	private boolean global = false;
	private int cellSize = 50;
	private int gen_sec = 1;
	final int gridWid = 640;
	final int gridHei = 320;
	private Color color = Color.black;
	private Color gridcolor = Color.white;
	Random rangen = new Random();
	
	private location[] Shape1 = {
			new location(0,1), new location(1,2), new location(2,0), new location(2,1),
			new location(2,2)
	};
	private location[] Shape2 = {
			new location(0,1), new location(0,2), new location(1,0), new location(1,2),
			new location(2,2)
	};
	private location[] Shape3 = {
			new location(0,0), new location(0,1), new location(0,2), new location(1,0),
			new location(2,1)
	};
	private location[] Shape4 = {
			new location(0,0), new location(1,0), new location(2,0), new location(2,1),
			new location(1,2)
	};
	private location[] Shape5 = {
			new location(0,1), new location(1,0), new location(1,1), new location(1,2),
			new location(2,0), new location(2,2), new location(3,1)
	};
	private location[] Shape6 = {
			new location(0,0), new location(0,2), new location(0,4), new location(1,0),
			new location(1,4), new location(2,0), new location(2,4), new location(3,0),
			new location(3,4), new location(4,0), new location(4,2), new location(4,4)
	};
	private location[] Shape7 = {
			new location(0,0), new location(0,1), new location(0,2), new location(0,3),
			new location(0,4), new location(0,5), new location(0,6), new location(0,7),
			new location(0,8), new location(0,9)
	};
	private location[] Shape8 = {
			new location(0,0), new location(1,0), new location(2,0), new location(3,0),
			new location(4,0), new location(5,0), new location(6,0), new location(7,0),
			new location(8,0), new location(9,0)
	};
	private location[] Shape9 = {
			new location(0,1), new location(0,2), new location(0,3), new location(0,4),
			new location(1,0), new location(1,4), new location(2,4), new location(3,0),
			new location(3,3)
	};
	private location[] Shape10 = {
			new location(0,1), new location(0,2), new location(0,3), new location(1,0),
			new location(1,3), new location(2,0), new location(3,0), new location(4,1),
			new location(4,3)
	};
	private location[] Shape11 = {
			new location(0,1), new location(0,4), new location(1,0), new location(2,0),
			new location(2,4), new location(3,0), new location(3,1), new location(3,2),
			new location(3,3)
	};
	private location[] Shape12 = {
			new location(0,0), new location(0,2), new location(1,3), new location(2,3),
			new location(3,0), new location(3,3), new location(4,1), new location(4,2),
			new location(4,3)
	};
	private location[] Shape13 = {
			new location(0,24), new location(1,22), new location(1,24), new location(2,12),
			new location(2,13), new location(2,20), new location(2,21), new location(2,34),
			new location(2,35), new location(3,11), new location(3,15), new location(3,20),
			new location(3,21), new location(3,34), new location(3,35), new location(4,0),
			new location(4,1),  new location(4,10), new location(4,16), new location(4,20),
			new location(4,21), new location(5,0),  new location(5,1),  new location(5,10),
			new location(5,14), new location(5,16), new location(5,17), new location(5,22),
			new location(5,24), new location(6,10), new location(6,16), new location(6,24),
			new location(7,11), new location(7,15), new location(8,12), new location(8,13)
	};
	private location[] Shape14 = {
			new location(0,2),  new location(0,3),  new location(1,2),  new location(1,3),
			new location(11,0), new location(11,1), new location(11,5), new location(11,6),
			new location(34,4), new location(34,5), new location(35,5), new location(35,4),
			new location(13,1), new location(13,5), new location(14,2), new location(14,3),
			new location(14,4), new location(15,2), new location(15,3), new location(15,4),
			new location(18,5), new location(19,4), new location(19,5), new location(19,6),
			new location(20,3), new location(20,7), new location(21,5), new location(22,2),
			new location(22,8), new location(23,2), new location(23,8), new location(24,3),
			new location(24,7), new location(25,4), new location(25,5), new location(25,6)
	};
	private location[] Shape15 = {
			new location(5,0),  new location(5,1),  new location(6,0),  new location(6,1),
			new location(2,11), new location(3,11), new location(7,11), new location(8,11),
			new location(3,13), new location(7,13), new location(4,14), new location(5,14),
			new location(6,14), new location(4,15), new location(5,15), new location(6,15),
			new location(3,18), new location(2,19), new location(3,19), new location(4,19),
			new location(1,20), new location(5,20), new location(3,21), new location(0,22),
			new location(6,22), new location(0,23), new location(6,23), new location(1,24),
			new location(5,24), new location(2,25), new location(3,25), new location(4,25),
			new location(3,34), new location(3,35), new location(4,34), new location(4,35)
	};
	private location[] Shape16 = {
			new location(0,3),  new location(0,4),  new location(1,3),  new location(1,4),
			new location(10,2), new location(10,3), new location(10,4), new location(11,1),
			new location(11,5), new location(12,0), new location(12,6), new location(13,0),
			new location(13,6), new location(14,3), new location(15,1), new location(15,5),
			new location(16,2), new location(16,3), new location(16,4), new location(17,3),
			new location(20,4), new location(20,5), new location(20,6), new location(21,4),
			new location(21,5), new location(21,6), new location(22,3), new location(22,7),
			new location(24,2), new location(24,3), new location(24,7), new location(24,8),
			new location(34,5), new location(34,6), new location(35,5), new location(35,6)
	};
	private location[] Shape17 = {
			new location(0,1), new location(0,2), new location(0,4), new location(0,5),
			new location(1,1), new location(1,2), new location(1,4), new location(1,5),
			new location(2,2), new location(2,4), new location(3,0), new location(3,2),
			new location(3,4), new location(3,6), new location(4,0), new location(4,2),
			new location(4,4), new location(4,6), new location(5,0), new location(5,1),
			new location(5,5), new location(5,6)
	};
	private location[] Shape18 = {
			new location(0,0), new location(0,1), new location(0,2), new location(1,0),
			new location(1,4), new location(1,5), new location(2,1), new location(2,2),
			new location(2,3), new location(2,4), new location(2,5), new location(4,1),
			new location(4,2), new location(4,3), new location(4,4), new location(4,5),
			new location(5,0), new location(5,4), new location(5,5), new location(6,0),
			new location(6,1), new location(6,2)
	};
	
	private boolean prevState[][] = new boolean[gridHei][gridWid];
	private boolean nextState[][] = new boolean[gridHei][gridWid];
	
	private boolean entering = true;
	private boolean iterating = false;
	private boolean shapestate = false;
	private int shapenum = 0;
	
	private Timer t;
	
	public gridpane() {
		setSize(cellSize*gridWid, cellSize*gridHei);
		setPreferredSize(new Dimension(32000, 16000));
		setBackground(gridcolor);
		addMouseListener(this);
		addMouseMotionListener(this);
		for(int i=0 ; i<gridHei ; i++) {
			for(int j=0 ; j<gridWid ; j++) {
				prevState[i][j] = false;
				nextState[i][j] = false;
			}
		}
	}
	
	public void setCellSize(String z) {
		this.cellSize = Integer.parseInt(z);
		this.setSize(new Dimension((gridWid*cellSize),(gridHei*cellSize)));
		this.setPreferredSize(new Dimension((gridWid*cellSize),(gridHei*cellSize)));
		this.repaint();
	}
	
	public void setGen_sec(String z) {
		gen_sec = Integer.parseInt(z);
		if(global) {
			t.stop();
			t.start();
		}
	}
	
	public void setshape(int z) {
		this.shapenum = z;
		if(shapenum != 0) {shapestate = true;}
		else {shapestate = false;}
	}
	
	public void setCellColor(Color string) {
		color = string;
		
		this.repaint();
	}
	
	public void setGridColor(Color string) {
		gridcolor = string;
		
		this.repaint();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void Start() {
		t = new Timer((int)(1000/gen_sec), new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		t.start();
		global = true;
	}
	
	public void go() {
		entering = false;
		iterating = true;
		int i, j;
		int count;
		for(i=0 ; i<gridHei ; i++) {
			for(j=0 ; j<gridWid ; j++) {
				count = liveNeighbors(i, j);
				if(count < 2 || count >3) {nextState[i][j] = false;}
				else if(count == 3) {nextState[i][j] = true;}
				else if(count == 2) {
					if(prevState[i][j]) {nextState[i][j] = true;}
					else {nextState[i][j] = false;}
				}
			}
		}
		for(i=0 ; i<gridHei ; i++) {
			for(j=0 ; j<gridWid ; j++) {
				prevState[i][j] = nextState[i][j];
				nextState[i][j] = false;
			}
		}
		entering = true;
		iterating = false;
		repaint();
	}
	
	public void Stop() {
		t.stop();
		entering = true;
		iterating = false;
		repaint();
		global = false;
	}
	
	public void Reset() {
		if(!global) {
			Start();
		}
		entering = true;
		iterating = false;
		int i,j;
		for(i=0 ; i<gridHei ; i++) {
			for(j=0 ; j<gridWid ; j++) {
				prevState[i][j] = false;
				nextState[i][j] = false;
			}
		}
		global = false;
		repaint();
		t.stop();
	}
	
	public void autofill(String z) {
		double percent = (double)(Integer.parseInt(z)) / 100;
		int num = (int)(percent*((double)gridWid*(double)gridHei));
		Reset();
		for(int i=0 ; i<num && (num <= gridWid*gridHei) ; i++) {
			int x = rangen.nextInt(gridHei);
			int y = rangen.nextInt(gridWid);
			if(prevState[x][y] == false) {
				prevState[x][y] = true;
			}
			else {i--;}
		}
		entering = true;
		iterating = false;
		repaint();
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private int linecount;
	public void paintComponent(Graphics g) {
		this.setBackground(gridcolor);
		linecount = 0;
		for(int i=0 ; i<(gridWid*cellSize) ; i = i+cellSize) {
			if(linecount%10 == 0) {
				g.setColor(Color.LIGHT_GRAY);
			}
			else {
				g.setColor(new Color(230,230,250));
			}
			g.drawLine(i, 0, i, (gridHei*cellSize));
			linecount++;
		}
		linecount=0;
		for(int i=0 ; i<(gridHei*cellSize) ; i = i+cellSize) {
			if(linecount%10 == 0) {
				g.setColor(Color.LIGHT_GRAY);
			}
			else {
				g.setColor(new Color(230,230,250));
			}
			g.drawLine(0, i, (gridWid*cellSize), i);
			linecount++;
		}
		
		if(entering) {
			for(int i=0 ; i<gridHei ; i++) {
				for(int j=0 ; j<gridWid ; j++) {
					if(prevState[i][j] == true) {
						g.setColor(color);
						if(cellSize<6) {
							g.fillRect(cellSize*j, cellSize*i, cellSize, cellSize);
						}
						else {
							g.fillRect(cellSize*j+1, cellSize*i+1, cellSize-1, cellSize-1);
						}
						
						
					}
					else if(prevState[i][j] == false) {
						g.setColor(gridcolor);
						if(cellSize<6) {
							g.fillRect(cellSize*j, cellSize*i, cellSize, cellSize);
						}
						else {
							g.fillRect(cellSize*j+1, cellSize*i+1, cellSize-1, cellSize-1);
						}
					}
				}
			}
		}
		
		if(iterating) {
			for(int i=0 ; i<gridHei ; i++) {
				for(int j=0 ; j<gridWid ; j++) {
					if(nextState[i][j] == true) {
						g.setColor(color);
						if(cellSize<6) {
							g.fillRect(cellSize*j, cellSize*i, cellSize, cellSize);
						}
						else {
							g.fillRect(cellSize*j+1, cellSize*i+1, cellSize-1, cellSize-1);
						}
					}
					else if(nextState[i][j] == false) {
						g.setColor(gridcolor);
						if(cellSize<6) {
							g.fillRect(cellSize*j, cellSize*i, cellSize, cellSize);
						}
						else {
							g.fillRect(cellSize*j+1, cellSize*i+1, cellSize-1, cellSize-1);
						}
					}
				}
			}
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	public void mousePressed(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}

	
	public void mouseClicked(MouseEvent e) {
		if(entering) {
			int q, w;
			q = e.getY();
			w = e.getX();
			q = q/cellSize;
			w = w/cellSize;
			if(shapestate) {
				location temp;
				if(e.getButton()==MouseEvent.BUTTON1) {
					if(shapenum == 1) {
						for (int i = 0; i < Shape1.length; i++) {
							temp = Shape1[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 2) {
						for (int i = 0; i < Shape2.length; i++) {
							temp = Shape2[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 3) {
						for (int i = 0; i < Shape3.length; i++) {
							temp = Shape3[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 4) {
						for (int i = 0; i < Shape4.length; i++) {
							temp = Shape4[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 5) {
						for (int i = 0; i < Shape5.length; i++) {
							temp = Shape5[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 6) {
						for (int i = 0; i < Shape6.length; i++) {
							temp = Shape6[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 7) {
						for (int i = 0; i < Shape7.length; i++) {
							temp = Shape7[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 8) {
						for (int i = 0; i < Shape8.length; i++) {
							temp = Shape8[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 9) {
						for (int i = 0; i < Shape9.length; i++) {
							temp = Shape9[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 10) {
						for (int i = 0; i < Shape10.length; i++) {
							temp = Shape10[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 11) {
						for (int i = 0; i < Shape11.length; i++) {
							temp = Shape11[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 12) {
						for (int i = 0; i < Shape12.length; i++) {
							temp = Shape12[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 13) {
						for (int i = 0; i < Shape13.length; i++) {
							temp = Shape13[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 14) {
						for (int i = 0; i < Shape14.length; i++) {
							temp = Shape14[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 15) {
						for (int i = 0; i < Shape15.length; i++) {
							temp = Shape15[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 16) {
						for (int i = 0; i < Shape16.length; i++) {
							temp = Shape16[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 17) {
						for (int i = 0; i < Shape17.length; i++) {
							temp = Shape17[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
					else if(shapenum == 18) {
						for (int i = 0; i < Shape18.length; i++) {
							temp = Shape18[i];
							if(((q + temp.getX()) < gridHei) && ((w + temp.getY()) < gridWid)) {
								prevState[q+temp.getX()][w+temp.getY()] = true;
							}
						}
					}
				}
				else if(e.getButton()==MouseEvent.BUTTON3) {
					prevState[q][w] = false;
				}
				
				repaint();
			}
			else {
				if(e.getButton()==MouseEvent.BUTTON1) {
					prevState[q][w] = true;
				}
				else if(e.getButton()==MouseEvent.BUTTON3) {
					prevState[q][w] = false;
				}
				entering = true;
				iterating = false;
				repaint();
			}
		}
	}
	
	
	
	public int liveNeighbors(int i, int j) {
		int count=0;
		if(i==0 && j==0) {
			count = 0;
			if(prevState[0][1]) {count++;}
			if(prevState[1][0]) {count++;}
			if(prevState[1][1]) {count++;}
			return count;
		}
		else if(i==(gridHei-1) && j==0) {
			count = 0;
			if(prevState[gridHei-2][0]) {count++;}
			if(prevState[gridHei-2][1]) {count++;}
			if(prevState[gridHei-1][1]) {count++;}
			return count;
		}
		else if(i==0 && j==(gridWid-1)) {
			count = 0;
			if(prevState[0][gridWid-2]) {count++;}
			if(prevState[1][gridWid-2]) {count++;}
			if(prevState[1][gridWid-1]) {count++;}
			return count;
		}
		else if(i==(gridHei-1) && j==(gridWid-1)) {
			count = 0;
			if(prevState[gridHei-2][gridWid-2]) {count++;}
			if(prevState[gridHei-2][gridWid-1]) {count++;}
			if(prevState[gridHei-1][gridWid-2]) {count++;}
			return count;
		}
		
		else if(i==0 && (j>0 && j<(gridWid-1))) {
			count = 0;
			if(prevState[i][j-1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i+1][j-1]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i+1][j+1]) {count++;}
			return count;
		}
		else if(i==(gridHei-1) && (j>0 && j<(gridWid-1))) {
			count = 0;
			if(prevState[i][j-1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i-1][j-1]) {count++;}
			if(prevState[i-1][j]) {count++;}
			if(prevState[i-1][j+1]) {count++;}
			return count;
		}
		else if(j==0 && (i>0 && i<(gridHei-1))) {
			count = 0;
			if(prevState[i-1][j]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i-1][j+1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i+1][j+1]) {count++;}
			return count;
		}
		else if(j==(gridWid-1) && (i>0 && i<(gridHei-1))) {
			count = 0;
			if(prevState[i-1][j]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i-1][j-1]) {count++;}
			if(prevState[i][j-1]) {count++;}
			if(prevState[i+1][j-1]) {count++;}
			return count;
		}
		else if((i<(gridHei-1) && i>0) && (j>0 && j<(gridWid-1))) {
			count = 0;
			if(prevState[i-1][j-1]) {count++;}
			if(prevState[i-1][j]) {count++;}
			if(prevState[i-1][j+1]) {count++;}
			if(prevState[i][j-1]) {count++;}
			if(prevState[i][j+1]) {count++;}
			if(prevState[i+1][j-1]) {count++;}
			if(prevState[i+1][j]) {count++;}
			if(prevState[i+1][j+1]) {count++;}
			return count;
		}
		return count;
	}

	public void mouseDragged(MouseEvent e) {
		if(entering) {
			int q, w;
			q = e.getY();
			w = e.getX();
			q = q/cellSize;
			w = w/cellSize;
			if(q>0 && w>0 && q<gridHei && q<gridWid) {
				if(SwingUtilities.isLeftMouseButton(e)) {
					prevState[q][w] = true;
				}
				else if(SwingUtilities.isRightMouseButton(e)) {
					prevState[q][w] = false;
				}
				entering = true;
				iterating = false;
				repaint();
			}
		}
	}
	
	public void mouseMoved(MouseEvent arg0) {}	
}

import java.util.Scanner;

public class RubikRunner {
	/*
	 * Rubik's Cube Simulator
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		RubikCube rc = new RubikCube();
		System.out.println(rc);
		System.out.println();

		// asks the user for instructions on how to 
		// turn the cube (left, right, up, down) and 
		// prints the cube after executing the command
		while(true) {
			System.out.println("Would you like to rotate the cube (L)eft, (R)ight, (U)p, or (D)own; or would you like to turn the face (C)lockwise or counter-clock(W)ise? (Enter 'exit' to exit the program: ");
            String rotate = input.nextLine();
            if(rotate.equals("exit")) {
                break;
            } else if(rotate.equals("L")) {
                rc.left();
            } else if(rotate.equals("R")) {
                rc.right();
            } else if(rotate.equals("U")) {
                rc.up();
            } else if(rotate.equals("D")){
                rc.down();
            } else if(rotate.equals("C")){
                rc.cw();
            } else if(rotate.equals("W")){
                rc.ccw();
            }
            System.out.println(rc);
            System.out.println();
		}
	}

	public static class RubikCube {

		// RubikCube variables
		private RubikFace[] faces = new RubikFace[6];

		// RubikCube constructor
		public RubikCube() {
			faces[0] = new RubikFace("White");
			faces[1] = new RubikFace("Orange");
			faces[2] = new RubikFace("Blue");
			faces[3] = new RubikFace("Green");
			faces[4] = new RubikFace("Red");
			faces[5] = new RubikFace("Yellow");
		}

		// changes the faces so the cubes 'turns' left
		public void left() {
	        RubikFace r = faces[1];
	        faces[1] = faces[2];
	        faces[2] = faces[3];
	        faces[3] = faces[5];
	        faces[5] = r;
	    }

	    // changes the faces so the cubes 'turns' right
	    public void right() {
	        RubikFace r = faces[1];
	        faces[1] = faces[5];
	        faces[5] = faces[3];
	        faces[3] = faces[2];
	        faces[2] = r;
	    }
	    
	    // changes the faces so the cubes 'turns' up
	    public void up() {
	        RubikFace r = faces[0];
	        faces[0] = faces[2];
	        faces[2] = faces[4];
	        faces[4] = faces[5];
	        faces[5] = r;
	    }
	    
	    // changes the faces so the cubes 'turns' down
	    public void down() {
	        RubikFace r = faces[0];
	        faces[0] = faces[5];
	        faces[5] = faces[4];
	        faces[4] = faces[2];
	        faces[2] = r;
	    }

	    // calls the ccw() method on the front face
	    public void ccw() {
	    	faces[2].ccw();
	    }

	    // calls the cw() method on the front face
	    public void cw() {
	    	faces[2].cw();
	    }

	    // RubikCube toString
	    // @return String
	    public String toString() {
	    	String result = "" + faces[0] + "\n";
	    	String[][] c1 = faces[1].getColors();
	    	String[][] c2= faces[2].getColors();
	    	String[][] c3 = faces[3].getColors();
	    	for(int i = 0; i < 3; i++) {
	    		for(int j = 0; j < 3; j++) {
					result += c1[i][j].substring(0, 1) + " ";
				}
				result += " ";
				for(int j = 0; j < 3; j++) {
					result += c2[i][j].substring(0, 1) + " ";
				}
				result += " ";
				for(int j = 0; j < 3; j++) {
					result += c3[i][j].substring(0, 1) + " ";
				}
				result += "\n";
	    	}
	    	result += "\n" + faces[4] + "\n";
	    	result += "" + faces[5];

	        return result;
	    }
	}

	public static class RubikFace {
		// RubikFace variables
		private String[][] colors = new String[3][3];
		private final String[] colorOptions = {"White", "Orange", "Blue", "Yellow", "Green", "Red"};

		// RubikFace constructor
		public RubikFace(String color) {
			for(int i = 0; i < colors.length; i++) {
				for(int j = 0; j < colors[i].length; j++) {
					if(i == 1 && j == 1) {
						colors[i][j] = color;
					} else {
						colors[i][j] = colorOptions[(int)(Math.random()*6)];
					}
				}
			}
		}

		// String[][] colors getter method
		public String[][] getColors() {
			return colors;
		}

		// rotates the face 90 degrees counter-clockwise
	    public void ccw() {
	    	String[][] temp = new String[3][3];
	    	for(int i = 0; i < 3; i++) {
	    		for(int j = 0; j < 3; j++) {
	    			temp[j][i] = colors[i][2-j];
	    		}
	    	}
	    	colors = temp;
	    }

	    // not sure what this method does yet
	    public void cw() {
	    	String[][] temp = new String[3][3];
	    	for(int i = 0; i < 3; i++) {
	    		for(int j = 0; j < 3; j++) {
	    			temp[j][i] = colors[2-i][j];
	    		}
	    	}
	    	colors = temp;
	    }

		// RubikFace toString
		// @return String
		public String toString() {
			String a = "";
			for(int i = 0; i < colors.length; i++) {
				a += "       ";
				for(int j = 0; j < colors[i].length; j++) {
					a += colors[i][j].substring(0, 1) + " ";
				}
				a += "\n";
			}
			return a;
		}
	}
}
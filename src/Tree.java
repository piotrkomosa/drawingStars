public class Tree implements Drawable {


    private int height;

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        int spaces = height - 1;
        int stars = 1;
        for (int i = 0; i < height; i++) {
            drawSpaces(spaces);
            drawStars(stars);
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
    private void drawStars(int stars) {

        for (int i = 0; i < stars; i++) {
            System.out.print('*');
        }
    }
    private void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");

        }
    }
}

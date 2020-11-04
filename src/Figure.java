public class Figure {
    double dim1;
    double dim2;
    Figure (double a, double b) {
        dim1=a;
        dim2=b;
    }
    double area () {
        System.out.println("Area of the figure is undefined");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle (double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
class FindAreas {
    public static void main(String args[]) {

        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(6,5);
        Figure figref;

        figref = r;
        System.out.println("Area is"  + figref.area());
    }
}


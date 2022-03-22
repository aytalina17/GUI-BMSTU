package functions;

import classes.Equation;

public class Equation_test {
    public static void main(String[] args) {
        SolvingEquation();
    }

    public static void SolvingEquation () {
        Equation equation1 = new Equation(1, 2, -14);
        System.out.println("counts of roots = " + equation1.rootsCounter());
        double[] roots = equation1.rootsOfEquation();
        for (int i = 0; i < roots.length; i++){
            System.out.println("root = " + roots[i]);
        }

    }
}

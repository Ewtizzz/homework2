public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersSummWeight = firstBoxerWeight + secondBoxerWeight;

        System.out.println(boxersSummWeight);

        var weightDifference = secondBoxerWeight - firstBoxerWeight;

        System.out.println(weightDifference);

        weightDifference = secondBoxerWeight % firstBoxerWeight;

        System.out.println(weightDifference);

        var amountOfHours = 640;
        var amountOfWorkers = amountOfHours / 8;
        System.out.println("Всего в компании " + amountOfWorkers + " человек");

        amountOfWorkers += 94;
        amountOfHours = amountOfWorkers * 8;
        System.out.println("Если в компании работает " + amountOfWorkers + " человек, то всего " + amountOfHours + " часов работы может быть поделено между сотрудниками");



    }
}
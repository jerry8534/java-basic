package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "life is infinite loop";
        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "about time";
        aboutTime.review = "life movie";

        System.out.println("title: " + inception.title + " reivew: " + inception.review);
        System.out.println("title: " + aboutTime.title + " reivew: " + aboutTime.review);
    }
}

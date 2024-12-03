import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber();
        juan.setSubscriberName("Amelia");

        Subscriber subscriber2 = new Subscriber();
        maria.setSubscriberName("Emelia");

        Subscriber subscriber3 = new Subscriber();
        oliver.setSubscriberName("Cecilia");

        List<Subscriber> subscribers = new ArrayList<>();

        NewsAgency news = new NewsAgency();
        news.setSubscriberList(subscribers);
        news.subscribe(subscriber1);
        news.subscribe(subscriber2);
        news.subscribe(subscriber3);
        news.setBreakingNews("BREAKING NEWS");

        System.out.println("\nUPDATE!");
        System.out.println(news.notifySubscriber());

        news.unsubscribe(subscriber3);

        Subscriber paul = new Subscriber();
        paul.setSubscriberName("Lilia");
        news.subscribe(subscribernew);

        System.out.println("\nNEW UPDATE ");
        System.out.println(news.notifySubscriber());

        paul.updateNews(news);
    }
}
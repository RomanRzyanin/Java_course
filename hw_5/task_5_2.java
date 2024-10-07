import java.util.Deque;
import java.util.LinkedList;

/**
История посещения веб-сайтов
Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
Используйте Deque для хранения истории.
● visitSite(String site): Добавляет сайт в историю посещений.
● back(int steps): Возвращает название сайта, который был посещен
steps назад, или null, если таких шагов нет.
● getHistory(): Возвращает список сайтов в истории посещений, от
последнего посещенного к первому.

 */
public class task_5_2 {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("yandex.ru");
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("vk.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}
class BrowserHistory {
    private Deque<String> history = new LinkedList<>();
    public void visitSite(String site) {
        history.addFirst(site);
    }
    public String back(int steps) {
        if (steps >= history.size()) {
        return null;
        }
        return history.stream().skip(steps).findFirst().orElse(null);
    }
    public Deque<String> getHistory() {
        return history;
    }
}



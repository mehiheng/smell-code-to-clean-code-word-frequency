/**
 * Created by jxzhong on 2018/5/22.
 */
public class word {
    private String value;
    private int count;

    public word(String w, int i) {
        this.value = w;
        this.count = i;
    }

    public String getValue() {
        return this.value;
    }

    public int getWordCount() {
        return this.count;
    }
}

package sheridan.usmanhu.assignment1.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

    @SuppressWarnings("unused")
    public class rpsGame implements Serializable {

        @Min(0)
        @Max(2)
        private int item = 0;
        private int comp;

        public rpsGame() {
            comp= (int) (3 * Math.random());
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public int getComp() {
            return comp;
        }

        public void setComp(int comp) {
            this.comp = comp;
        }

        @Override
        public String toString() {
            return "rpsGame{" +
                    "item=" + item +
                    "comp="+comp+
                    '}';
        }
    }

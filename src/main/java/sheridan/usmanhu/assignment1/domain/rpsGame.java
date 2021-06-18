package sheridan.usmanhu.assignment1.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

    @SuppressWarnings("unused")
    public class rpsGame implements Serializable {

        @Min(0)
        @Max(2)
        private int item = 0;


        public rpsGame() {
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }


        @Override
        public String toString() {
            return "rpsGame{" +
                    "item=" + item +

                    '}';
        }
    }

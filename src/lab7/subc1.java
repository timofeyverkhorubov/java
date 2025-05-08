package lab7;

public class subc1 extends sc1 {
        private String str2;

        public subc1(String str1) {
            super(str1);
        }

        public subc1(String str1, String str2) {
            super(str1);
            this.str2 = str2;
        }

        @Override
        public String toString() {
            String result = "Class name: " + this.getClass().getSimpleName() + ", str1 = " + getStr1();
            if (str2 != null) {
                result += ", str2 = " + str2;
            }
            return result;
        }
}

static int leftDayOfYear(int y, int m, int d) {
        int tot = isLeap(y) == 1 ? 366 : 365;

        return tot - dayOfYear(y, m, d);
    }
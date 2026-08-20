 class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                five++;
            }

            else if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                }

                five--;
                ten++;
            }

            else { // bills[i] == 20

                // Prefer 10 + 5
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }

                // Otherwise give three 5s
                else if (five >= 3) {
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}
class int_to_roman {
    
       public String intToRoman(int num) {
       
        StringBuilder roman = new StringBuilder();
        int diff = num;

        while (diff > 0) {
            if (diff >= 1000) {
                roman.append("M");
                diff = diff - 1000;
                continue;
            }
            if (diff >= 900) {
                roman.append("CM");
                diff = diff - 900;
                continue;
            }
            if (diff >= 500) {
                roman.append("D");
                diff = diff - 500;
                continue;
            }
            if (diff >= 400) {
                roman.append("CD");
                diff = diff - 400;
                continue;
            }
            if (diff >= 100) {
                roman.append("C");
                diff = diff - 100;
                continue;
            }
            if (diff >= 90) {
                roman.append("XC");
                diff = diff - 90;
                continue;
            }
            if (diff >= 50) {
                roman.append("L");
                diff = diff - 50;
                continue;
            }
            if (diff >= 40) {
                roman.append("XL");
                diff = diff - 40;
                continue;
            }
            if (diff >= 10) {
                roman.append("X");
                diff = diff - 10;
                continue;
            }
            if (diff >= 9) {
                roman.append("IX");
                diff = diff - 9;
                continue;
            }
            if (diff >= 5) {
                roman.append("V");
                diff = diff - 5;
                continue;
            }
            if (diff >= 4) {
                roman.append("IV");
                diff = diff - 4;
                continue;
            }
            
            roman.append("I");
            diff = diff - 1;
        }

        return roman.toString();
    }
} 

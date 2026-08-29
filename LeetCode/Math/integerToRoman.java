class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        while(num != 0){
            if(num > 999){
                roman.append('M');
                num -= 1000;
            }else if(num >= 500){
                // check if it starts with 9
                int firstDigit = getFirstDigit(num);
                if(firstDigit == 9){
                    roman.append("CM");  
                    num -= 900;
                }else{
                    roman.append('D');
                    num -= 500;
                }
            }else if(num >= 100){
                // check if it starts with 4
                int firstDigit = getFirstDigit(num);
                if(firstDigit == 4){
                    roman.append("CD");
                    num -= 400;
                }else{
                    roman.append('C');
                    num -= 100;
                }
            }else if(num >= 50){
                int firstDigit = getFirstDigit(num);
                if(firstDigit == 9){
                    roman.append("XC");
                    num -= 90;
                }else{
                    roman.append('L');
                    num -= 50;
                }
            }else if(num >= 10){
                int firstDigit = getFirstDigit(num);
                if(firstDigit == 4){
                    roman.append("XL");
                    num -= 40;
                }else{
                    roman.append('X');
                    num -= 10;
                }
            }else if(num >= 5){
                if(num == 9){
                    roman.append("IX");
                    num -= 9;
                }else{
                    roman.append('V');
                    num -= 5;
                }
            }else{
                if(num == 4){
                    roman.append("IV");
                    num -= 4;
                }else{
                    roman.append('I');
                    num -= 1;
                }
            }
        }
        return roman.toString();
    }
    public int getFirstDigit(int n){
        while(n > 9){
            n = n/10;
        }
        return n;
    }
}
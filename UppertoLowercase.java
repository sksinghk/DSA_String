    package com.company;

    public class UppertoLowercase {
        public static void main(String[] args) {
            String str = "PhysICS";
            for (int i = 0; i <= str.length()-1; i++) {
                char ch = str.charAt(i);
                if (Character.isLowerCase(ch)) {
                    char lch = Character.toLowerCase(ch);
                    str += lch;
                }else {
                    char uch=Character.toUpperCase(ch);
                    str +=uch;
                }

            }
            System.out.println(str);
        }
    }

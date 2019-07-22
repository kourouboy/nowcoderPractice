package com.kourou.jianzhiOffer.Work7_20_Day42;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String Password = in.nextLine();
            char[] aucPassword = Password.toCharArray();
            StringBuffer stringBuffer = new StringBuffer();
            String ru = in.nextLine();
            char[] result = ru.toCharArray();
            StringBuffer stringBuffer1 = new StringBuffer();
            for (int i = 0; i < aucPassword.length; i++) {
                if (aucPassword[i] == 'z') {
                    stringBuffer.append("A");
                } else if (aucPassword[i] >= 'a' && aucPassword[i] < 'z') {
                    stringBuffer.append((char) (aucPassword[i] + 1 - 32));
                } else if (aucPassword[i] == 'Z') {
                    stringBuffer.append("a");
                } else if (aucPassword[i] >= 'A' && aucPassword[i] < 'Z') {
                    stringBuffer.append((char) (aucPassword[i] + 1 + 32));
                } else if (aucPassword[i] == '9') {
                    stringBuffer.append("0");
                } else if (aucPassword[i] >= '0' && aucPassword[i] < '9') {
                    stringBuffer.append(aucPassword[i] + 1);
                }
            }
            System.out.println(stringBuffer.toString());
            for (int j = 0; j < result.length; j++) {
                if (result[j] == 'a') {
                    stringBuffer1.append("Z");
                } else if (result[j] > 'a' && result[j] <= 'z') {
                    stringBuffer1.append((char) (result[j] - 33));
                } else if (result[j] == 'A') {
                    stringBuffer1.append("z");
                } else if (result[j] > 'A' && result[j] <= 'Z') {
                    stringBuffer1.append((char) (result[j] + 31));
                } else if (result[j] == '0') {
                    stringBuffer1.append("9");
                } else if (result[j] > 0 && result[j] <= 9) {
                    stringBuffer1.append(result[j] - 1);
                }
            }
            System.out.println(stringBuffer1.toString());
        }
    }
}
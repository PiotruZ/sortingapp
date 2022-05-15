package org.piotrus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {

        Sort sort = new Sort();
        boolean print = true;
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (print){
            String str = scanner.nextLine();
            if(str.equals("sort")){
                print=false;
            }
            else if (list.size()<10){
                try{
                    list.add(Integer.parseInt(str));
                } catch (IllegalArgumentException e){
                    e.printStackTrace();
                }
            }
            else
                System.out.println("You can only enter up to 10 integer values. Please write 'sort' without apostrophe to sort entered numbers.");
        }

        System.out.println("Please enter up to 10 integer values.\n" +
                "If you want to sort entered numbers please write 'sort' without apostrophe. Numbers are sorted in ascending order.");

        System.out.println(sort.sort(list));
    }
}

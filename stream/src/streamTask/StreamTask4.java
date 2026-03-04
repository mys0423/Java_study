package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask4 {
   public static void main(String[] args) {
//      모두 Stream 문법으로 활용
//      1. 1~10까지 ArrayList에 담고 총 합을 출력
	   ArrayList<Integer> data1 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 10).forEach(data1::add);
	   int total = data1.stream().mapToInt(Integer::valueOf).sum();
	   System.out.println(total);
	   
//      2. ABCDEF를 각각 문자 별로 출력
	   String data2 = "ABCDEF";
	   data2.chars().mapToObj(c -> (char)c).forEach(System.out::println);
	   
//      3. ABDEF를 문자열로 출력
	   String data3 = "ABDEF";
	   data3.chars().mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
	   
//      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
	   ArrayList<Integer> data4 = new ArrayList<Integer>();
	   IntStream.rangeClosed(1, 100).filter(n -> n % 2 != 0).forEach(data4::add);
	   System.out.println(data4);
	   
//      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
//      Black, WHITE, reD, yeLLow, PINk
	   ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
	   int count = colors.stream().map(String::toLowerCase).collect(Collectors.joining()).chars().map(c -> c == 'a' ? 1 : 0).sum();
	   System.out.println(count);
	   
//      6. 첫 번째 문자가 대문자인 문자열만 출력
//      Apple, banana, Melon, tomato
	   ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
	   fruits.stream().filter(s -> s.charAt(0) >= 'A' && s.charAt(0) <= 'Z').forEach(System.out::println);
	   
//      7. 한글을 정수로 변경
//      "공일이삼" -> "0123"
	   String dataSet = "공일이삼사오육칠팔구";
	   String data7 ="공일이삼";
	   String result7 = data7.chars().mapToObj(c -> String.valueOf((char)c)).map(dataSet::indexOf).map(String::valueOf).collect(Collectors.joining());
	   System.out.println(result7);
	   
//      8. 정수를 한글로 변경
//      "0123" -> "공일이삼"
	   String data8 ="0123";
	   String result8 = data8.chars().mapToObj(c -> String.valueOf(dataSet.charAt(c - '0'))).collect(Collectors.joining());
	   System.out.println(result8);
   }
}


//package streamTask;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class StreamTask4 {
//   
//   public static String changeToZero(int n) {
//      return String.valueOf((char)(n + 65));
//   }
//   
//   public static void main(String[] args) {
////      모두 Stream 문법으로 활용
////      1. 1~10까지 ArrayList에 담고 총 합을 출력
////      IntStream
////         .rangeClosed(1, 10)
////         .mapToObj(Integer::valueOf)
////         .collect(Collectors.toList())
////         .forEach(System.out::println);
//      
////      2. ABCDEF를 각각 문자 별로 출력
////      String data2 = IntStream
////         .range(0, 6)
////         .mapToObj(StreamTask4::changeToZero)
////         .collect(Collectors.joining(""));
////      System.out.println(data2);
//      
////      3. ABDEF를 문자열로 출력
////      String data3 = IntStream
////         .range(0, 5)
////         .map(n -> n > 1 ? n + 1 : n)
////         .mapToObj(StreamTask4::changeToZero)
////         .collect(Collectors.joining(""));
////      
////      System.out.println(data3);
//      
////      4. 1~100까지 중 홀수만 ArrayList에 담고 출력
////      IntStream
////         .rangeClosed(1, 50)
////         .mapToObj(n -> n * 2 - 1)
////         .collect(Collectors.toList())
////         .forEach(System.out::println);
////      
////      Integer[] arr = new Integer[50];
////      for(int i = 0; i < arr.length; i++) {
////         arr[i] = (i + 1) * 2 - 1;
////      }
////      
////      ArrayList<Integer> datas3 = new ArrayList<Integer>(Arrays.asList(arr));
////      
////      datas3.addAll(Arrays.asList(arr));
////      System.out.println(datas3);
//      
////      5. 5개의 문자열 모두 소문자로 변경 후 a의 개수 출력
////      Black, WHITE, reD, yeLLow, PINk, apple
////      ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Blasack", "WHITE", "reD", "yeLLow", "PINk", "apple"));
////      int aCount = datas5
////         .stream()
////         .map(String::toLowerCase)
////         .filter(lowercase -> lowercase.contains("a"))
////         .map(str -> str.chars()
////               .filter(c -> c == 97)
////               .mapToObj(c -> String.valueOf((char)c))
////               .collect(Collectors.joining(""))
////         )
////         .collect(Collectors.joining("")).length();
////      
////      System.out.println(aCount);
////      
////      int aCount2 = datas5
////         .stream()
////         .map(String::toLowerCase)
////         .filter(lowercase -> lowercase.contains("a"))
////         .map(str -> str.chars()
////               .filter(c -> c == 97)
////               .mapToObj(c -> String.valueOf((char)c))
////               .collect(Collectors.joining(""))
////               .length()
////         )
////         .mapToInt(n -> n)
////         .sum();
////      
////      System.out.println(aCount2);
////      System.out.println(datas5);
//      
////      6. 첫 번째 문자가 대문자인 문자열만 출력
////      "Apple", "banana", "Melon", "tomato"
////      ArrayList<String> datas6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "tomato"));
////      datas6
////         .stream()
////         .filter((str) -> str.charAt(0) >= 'A')
////         .filter((str) -> str.charAt(0) <= 'Z')
////         .forEach(System.out::println);
//      
////      7. 한글을 정수로 변경
////      "공일이삼" -> "0123"
////      String hangle = "공일이삼사오육칠팔구", message = "한글을 입력하세요.\nex)공일이삼", input = null;
////      Scanner sc = new Scanner(System.in);
////      System.out.println(message);
////      input = sc.next();
////      input.chars().map(hangle::indexOf).forEach(System.out::print);
//      
////      8. 정수를 한글로 변경
////      "0123" -> "공일이삼"
//      String hangle = "공일이삼사오육칠팔구", message = "정수를 입력하세요.\n0123", input = null;
//      Scanner sc = new Scanner(System.in);
//      System.out.println(message);
//      input = sc.next();
//      
//      input.chars().map(c -> c - 48)
//      .map(hangle::charAt)
//      .mapToObj(c -> String.valueOf((char)c))
//      .forEach(System.out::print);
//      
//      
//   }
//}

























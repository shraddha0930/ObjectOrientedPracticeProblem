package day11and12Practiceproblem;

import java.util.ArrayList;
import java.util.Scanner;


public class StockPortfolio {
    private String stockName;
    private int stockPrice;
    private int stockNumber;

    public StockPortfolio(String name , int numberOfShares, int price){
        this.stockName=name;
        this.stockPrice=price;
        this.stockNumber=numberOfShares;
    }
    public int getValue() {
        return stockNumber * stockPrice;
    }

    public String getStockName(){
        return stockName;
    }

    public int getStockPrice(){
        return stockPrice;
    }

    public int getStockNumber(){
        return stockNumber;
    }

    public void setStockName(String stockName){
        this.stockName=stockName;
    }

    public void setStockPrice(int stockPrice){
        this.stockPrice=stockPrice;
    }

    public void setStockNumber(int stockNumber){
        this.stockNumber=stockNumber;
    }

    public String toString(){
        return stockName+" "+stockPrice+" "+stockNumber+"  "+(stockPrice*stockNumber)+" "+"\n";

    }


}
class StockReport {

    ArrayList<StockPortfolio> list;

    public static void main(String[] args) {

        StockReport report = new StockReport();	//	class object
        report.getStockData();
        report.printReport();
    }


     // gets user input of stock data

    void getStockData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stocks: ");
        int count = scanner.nextInt();
        list = new ArrayList<StockPortfolio>();

        for(int i = 0; i < count; i++) {
            System.out.print("Enter stock name, number of shares and share price: ");
            String name = scanner.next();
            int numberOfShares = scanner.nextInt();
            int price = scanner.nextInt();
            StockPortfolio stock = new StockPortfolio(name, numberOfShares, price);
            list.add(stock);
        }
        scanner.close();
    }


     // prints report

    void printReport() {
        int totalValue = 0;
        System.out.println("\nName\tShares\tPrice\tValue");
        while(!list.isEmpty()) {
            StockPortfolio folio = list.remove(list.size()-1);//remove end item from array
            totalValue += folio.getValue();
            System.out.println(folio.getStockName() + "\t" + folio.getStockNumber()
                    + "\t" + folio.getStockPrice() + " \t" + folio.getValue());
        }
        System.out.println("\nTotal value is: " + totalValue);
    }


}

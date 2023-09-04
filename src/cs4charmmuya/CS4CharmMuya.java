/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4charmmuya;

/**
 *
 * @author CHARM
 */
public class CS4CharmMuya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Object 1
        int bestieNum1 = 1;
        String bsfName1 = "Cheska Muya";
        String song1 = "Opera House by Cigarettes After Sex";
        int stream1 = 424;
            
        System.out.println("Bestie " + bestieNum1 + 
                "\nName of Best Friend: " + bsfName1 + 
                "\nFavorite Song: " + song1 + 
                "\nNo. of streams: " + stream1);
        
        //Object 2
        int bestieNum2 = 2;
        String bsfName2 = "Rhensis Lofamia";
        String song2 = "Unrequited Love (&other cliches) by Breakup Shoes";
        int stream2 = 1175;
        
        System.out.println("\nBestie " + bestieNum2 +
                "\nName of Best Friend: " + bsfName2 +
                "\nFavorite Song: " + song2 +
                "\nNo. of streams: " + stream2);
        
        //Object 3
        int bestieNum3 = 3;
        String bsfName3 = "Alyssa Octaviano";
        String song3 = "Ghost by Megumi Acorda";
        int stream3 = 281;
        
        System.out.println("\nBestie " + bestieNum3 +
                "\nName of Best Friend: " + bsfName3 +
                "\nFavorite Song: " + song3 +
                "\nNo. of streams: " + stream3);
        
        //Operations
        int sum = stream1 + stream2 + stream3;
        System.out.println("\nTotal number of streams: " + sum);
        
        boolean rankStream;
        rankStream = (stream2 > stream3) && (stream1 < stream2);
        System.out.println("Rhensis has the highest number of streams: " + rankStream);
        
        boolean sameSong;
        sameSong = (song1 == song2) && (song2 == song3) && (song1 == song3);
        System.out.println("They all have the same favorite songs: " + sameSong);
        
       
        
    }
    
}
import java.util.*;
public class Project1 {
    public static void hangman(Scanner sc) {
        String array[]={"word","animal","beauty","mother","monkey","star","galaxy","moon","sister","donkey"};
        int shuffle= (int)(Math.random()*10);
        String word=array[shuffle];
        int number=word.length();
        char letters[]=new char[number];
        for(int x=0; x<number; x++) {
            letters[x]='_';
        }
        System.out.println("enter your name to start the game");
        String name=sc.next();
        System.out.println("lets start the game");
        System.out.println("the number of letters in this word is "+number);
        System.out.println("you have a total of six guesses");
        int remaining=6;
        char yourguess[]=new char[100];
        int countguess=0;
    
        while(remaining>0) {
            int before=0;
            int after=0;
            for(int z=0; z<number; z++) {
                if(letters[z]!='_') {
                    before++;
                }
            }
            System.out.println("guess a letter");
            char guess= sc.next().charAt(0);;
            guess=Character.toLowerCase(guess);
            boolean alreadyinput=false;
            for(int l=0; l<countguess; l++) {
                if(guess==yourguess[l]) {
                    alreadyinput=true;
                    break;
                    
                }
            }
            if(alreadyinput){
                System.out.println("you have already made this guess. Make a different guess");
                continue;
            }
            yourguess[countguess]=guess;
                   countguess=countguess+1;
                
            for(int j=0; j<number; j++) {
                if(guess==word.charAt(j)) {
                    System.out.println("your guess is right");
                    letters[j]=guess;
                }
            }
            for(int u=0; u<number; u++) {
                if(letters[u]!='_') {
                    after++;
                }
            }
        
            for(int y=0; y<number; y++) {
                System.out.print(letters[y]+" ");
             }
             System.out.println();
             if(before==after) {
                remaining--;
                 System.out.println("number of guesses you have left are"+remaining);
            }
            if(remaining==6) {
                System.out.println("   -------");
                System.out.println(" |/      |");
                System.out.println(" | ");
                System.out.println(" |    ");
                System.out.println(" |     ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_");
            }else if(remaining==5) {
                 System.out.println("   -------");
                System.out.println(" |/      |");
                System.out.println(" |      (_)");
                System.out.println(" |    ");
                System.out.println(" |      ");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_");
                
            }else if(remaining==4) {
                 System.out.println("   -------");
                System.out.println(" |/      |");
                System.out.println(" |      (_)");
                System.out.println(" |       |");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_");
            }else if(remaining==3) {
                 System.out.println("   -------");
                System.out.println(" |/      |");
                System.out.println(" |      (_)");
                System.out.println(" |      \\|");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_");
            }else if(remaining==2) {
                 System.out.println("   -------");
                System.out.println(" |/      |");
                System.out.println(" |      (_)");
                System.out.println(" |      \\|/");
                System.out.println(" |       |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|_");
            }else if(remaining==1) {
                 System.out.println("  -------");
                System.out.println(" |/      |");
                System.out.println(" |      (_)");
                System.out.println(" |      \\|/");
                System.out.println(" |       |");
                System.out.println(" |      /");
                System.out.println(" |");
                System.out.println("_|_");
            }else if(remaining==0) {
                 System.out.println("  -------");
                System.out.println(" |/      |");
                System.out.println(" |      (_)");
                System.out.println(" |      \\|/");
                System.out.println(" |       |");
                System.out.println(" |      / \\");
                System.out.println(" |");
                System.out.println("_|_");
                 
            }
            
            if(after==number) {
                System.out.println("congratulations!you guessed the word. you won");
                break;
            }
             
        }
        if(remaining==0) {
            System.out.println("you ran out of guesses, so you lost");
        }
         
        
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=0;
            boolean found = false;
        do {
            try {
            do {
            System.out.println("enter 1 to play hangman");
            System.out.println("enter any other letter to finish the game");
            n= sc.nextInt();
            sc.nextLine(); 
            found=true;
            if(n==1) {
                hangman(sc);
            } else {
                break;
            }
            }while(n==1);
            } catch(InputMismatchException ex) {
             System.out.println(ex);
             System.out.println("Enter the same type of input");
             sc.nextLine();
            }
        }while(!found);

        }
    }

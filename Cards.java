//Write a program that randomly selects four cards from deck of cards
public class Cards{
    String cards[] = new String[52];
    String type[] = {"Spades", "heart","Diamond","Black"};
    String no[] = {"Ace","2","3","4","5","6","7","8","9","10","King","Queen","jack"};
    int x = 0;
    Cards(){
            for(int i = 0;i < type.length;i++){
                for(int j = 0;j < no.length;j++){
                    if(x < 52){
                    cards[x] = type[i] + no[j];
                    x++;
                    }
                }
            }
    }

   public void display(){
      int count = 0;
      for(int i = 0;i < cards.length;i++){
          count++;
          System.out.println(cards[i]); 
      }
      System.out.println(count);
   }

   public void randomindex(){
       for(int i = 0;i < 4;i++){
           int index =(int)(Math.random() * 52);
           System.out.println(cards[index]);
       }
   }

   public void shuffle(){
       System.out.println("Shuffling.........................");
       for(int i = 0 ;i < cards.length;i++){
           int index = (int)(Math.random()* 52);
           String temp = cards[i];
           cards[i] = cards[index];
           cards[index] = temp; 
       }
   }
}
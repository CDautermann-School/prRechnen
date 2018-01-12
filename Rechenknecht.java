
/**
 * Write a description of class Rechenknecht here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rechenknecht
{



    public Rechenknecht(){}


    
    public void zahlenWhile(){
    
        int i = 1;
        while(i<=100){
    
            System.out.println("Zahl:" + i);
            i++;         
        }        
    }
    
    public void zahlenFor(){
    
        for(int i = 1; i <=100; i++){
         
            System.out.println("Zahl: " + i);
        } 
    
    }
    
    
    
    
    public void zahlenRevWhile(){
    
        int i = 100;
        while(i>=1){
    
            System.out.println("Zahl:" + i);
            i--;         
        }        
    }
    
    public void zahlenRevFor(){
    
        for(int i = 100; i >=1; i--){
         
            System.out.println("Zahl: " + i);
        } 
    
    }
  
    
    public void zahlenDreierWhile(){
    
        int i = 1;
        while(i<=50){
    
            System.out.println("Zahl:" + i);
            i += 3;         
        }        
    }
    
    public void zahlenDreierFor(){
    
        for(int i = 1; i <=50; i= i + 3){
         
            System.out.println("Zahl: " + i);
        } 
    
    }
    
    public void power(){
     
        for(int n = 1; n<=100;n++){
            System.out.println(n*n);
            
        }
    }

    public void checkDivFor(){

        for(int n = 0;n <= 100; n++){

            if(n%2 == 0) {
                System.out.println(n + " ist durch 2 teilbar." );
            }

            if(n%3 == 0){

                System.out.println(n + " ist durch 3 teilbar.");
            }

            if((n%3 != 0) && (n%2 != 0)){

                System.out.println(n + " ist weder durch 2 noch durch 3 teilbar.");
            }
        }
    }

    public void checkDivWhile(){
        int n = 0;

        while(n <= 100){

            if(n%2 == 0) {
                System.out.println(n + " ist durch 2 teilbar." );
            }

            if(n%3 == 0){

                System.out.println(n + " ist durch 3 teilbar.");
            }

            if((n%3 != 0) && (n%2 != 0)){

                System.out.println(n + " ist weder durch 2 noch durch 3 teilbar.");
            }

            n = n+1;
        }
    }

    public void teiler210For(){

        for(int i = 0; i<=210; i++){

            try {
                if (210 % i == 0) {
                    System.out.println(i + " ist ein Teiler von 210");
                }
            }catch(java.lang.ArithmeticException exc){
                System.out.println("Öffne niemals die Büchse der Pandora!");
            }

        }
    }

    public void teiler210While(){

        int i = 0;

        while(i <= 210){

            try {
                if (210 % i == 0) {
                    System.out.println(i + " ist ein Teiler von 210");
                }
            }catch(java.lang.ArithmeticException exc){
                System.out.println("Öffne niemals die Büchse der Pandora!");
            }

            i = i + 1;

        }

    }


    //////////////////////////
    public int teilerNFor(int n){
        int teilercount = 0;


        for(int i = 0; i<=n; i++){

            try {
                if (n % i == 0) {
                    System.out.println(i + " ist ein Teiler von " + n);
                    teilercount += 1;

                }
            }catch(java.lang.ArithmeticException exc){
                System.out.println("Öffne niemals die Büchse der Pandora!");
            }
        }
        System.out.println(n + " hat " + teilercount + " Teiler.");
        return teilercount;
    }

    public int teilerNWhile(int n){

        int i = 0;
        int teilercount = 0;

        while(i <= n){

            try {
                if (n % i == 0) {
                    System.out.println(i + " ist ein Teiler von " + n);
                    teilercount += 1;
                }
            }catch(java.lang.ArithmeticException exc){
                System.out.println("Öffne niemals die Büchse der Pandora!");
            }

            i = i + 1;

        }
        System.out.println(n + " hat " + teilercount + " Teiler.");
        return teilercount;
    }

    public void MeisstenTeilerN(int n){

        int temp1 = 1;

        for(int i = 0; i <= n; i++){

            if(this.teilerNFor(i) > this.teilerNFor(temp1)){

                temp1 = i;
            }

        }

        System.out.println(temp1 + " Hat am meissten Teiler, nämlich: " + this.teilerNFor(temp1));
    }
    
}










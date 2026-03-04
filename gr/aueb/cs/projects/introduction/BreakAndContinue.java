package gr.aueb.cs.projects.introduction;

public class BreakAndContinue {
        public static void main(String[] args){
            for(int i = 0; i < 100; i++) {
                if(i == 74) {
                    break;
                }
                // Out of for loop
                if(i % 9 != 0) {
                    System.out.println("In here");
                    continue;
                }
                // Next iteration
                System.out.println(i);
            }
        }
    }
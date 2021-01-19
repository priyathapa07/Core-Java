package Annotations;

public class Annotation_main {

    @SuppressWarnings("deprecation")
    public static void main(String[]args){
        UseCase useCase = new UseCase();

        //if deprecated, have to call both old and new version
        useCase.old();
        useCase.recent();

    }



}

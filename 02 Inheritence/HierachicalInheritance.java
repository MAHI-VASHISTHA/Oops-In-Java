class Notebook{
    String colour;
    long  height;
    String company;

    Notebook(){
        System.out.println("*****Notebook*****");
        colour="pink and purple";
        height=50;
        company="classmate";
    }
    void showNotebookDetails(){
        System.out.println("Notebook details are :");
        System.out.println("Colour :"+colour);
        System.out.println("height :"+height);
        System.out.println("company :"+company);

    }
}
class Pages extends Notebook{
    String colour;
    long  noOfPages;

    Pages(){
        System.out.println("*****Pages*****");
        colour="white";
        noOfPages=350;
    }
    void showPagesDetails(){
        System.out.println("Pages details are :");
        System.out.println("colour :"+colour);
        System.out.println("noOfPages :"+noOfPages);

    }
}class Lines extends Notebook{
    long  noOfLines;

    Lines(){
        System.out.println("*****Lines*****");
       
    }
    void showLinesDetails(){
        System.out.println("Lines details are :");
        System.out.println("noOfLines :"+noOfLines);

    }
}

public class HierachicalInheritance {
    public static void main(String[] args) {
        
Notebook n1=new Pages();
n1.showNotebookDetails();
n1.showLinesDetails();

    }
}

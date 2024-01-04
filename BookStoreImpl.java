class Book {
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;

    // Declare required constructors
    
    Book( int isbnNo,String bookName,
    String author,
    String genre,
    float price)
    {

    this.isbnNo=isbnNo;
    this.bookName=bookName;
    this.author=author;
    this.genre=genre;
    this.price=price;
}

    
    public void printBookDetails(){
    System.out.println("Book id: "+isbnNo);
    System.out.println("Book Name: "+bookName);
    System.out.println("Book author: "+author);
    System.out.println("Book genre: "+genre);
    System.out.println("Book price: "+price);
    }
   
    }
    // create a method to print book details





public class BookStoreImpl {
    public static void main(String[] args) {
    
        Book b1=new Book(101,"Burried Thoughts","Joseph","Mixed",320);
        Book b2=new Book(102,"Aadujeevitham","Benamin","Travel",400);
        Book b3=new Book(103,"Fire","APJ","Autobiography",300);
        
    
    b1.printBookDetails();
    b2.printBookDetails();
    b3.printBookDetails();
 float min=0;
    if(b1.price<b2.price && b1.price<b3.price){
        min=b1.price;
    }
    else if(b2.price<b1.price && b2.price<b3.price){
        min=b2.price;
    }
    else{
        min=b3.price;
    }
   System.out.println("The cheapest price is " +min);
}
}
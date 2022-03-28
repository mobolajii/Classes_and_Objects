class Book{
   private String author, title, content, publisher;
  private int year, pages;


    public Book(String author, String title, int year, int pages){
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
        content = " ";
    }

    public void append(String content){
        content = content +1;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

     public String toString(){
       String  s = "The book " + title + " by " + author + " was published by "
                + publisher + " in the year " + year + " and has " + pages + " pages.";
        return s;
    }

    public static void main(String[] args) {
        Book a = new Book("A. O", "Flying", 1990 , 100);
        a.setPublisher("Publisher AG");
        a.append("ghjkdfghjklkjhgfdfgnm");
        System.out.println(a);



    }

}

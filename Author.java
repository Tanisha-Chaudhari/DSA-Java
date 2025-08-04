class Author {
    String name;
    String email;

    Author(String name, String email){
        this.name = name;
        this.email= email;
    }

    public void showAuthorInfo(){
        System.out.println("Author Name: "+ name);
        System.out.println("Author Email: "+ email);
    }
}
class Book {
        String title;
        double price;

        Author author;

        Book(String title, double price, Author author){
            this.title = title;
            this.price = price;
            this.author = author;
        }

        public void showBookInfo () {
            System.out.println("Book Name: " + title);
            System.out.println("Book Price: " + price);
            author.showAuthorInfo(); // using the Author object
        }
    public static void main(String[] args) {
            Author authorObj = new Author("Saurabh shukla", "saurabh@java.com");
            Book bookObj = new Book("Java Programming", 499.99, authorObj);

            bookObj.showBookInfo();

    }
}


//op: Book Name: Java Programming
//Book Price: 499.99
//Author Name: Saurabh Shukla
//Author Email: saurabh@java.com
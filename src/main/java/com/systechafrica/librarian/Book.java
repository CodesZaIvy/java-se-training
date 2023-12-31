package com.systechafrica.librarian;

public class Book {
   
    
        private boolean borrowed; //Each book is either borrowed or not
        
        public Book() {
            this.borrowed = false;
        }
        
        public void setToBorrowed() { //Method will fire once a book has been checked out
            this.borrowed = true;
        }
        
        public void setToReturned() { //Method will fire once book has been returned to the library catalog
            this.borrowed = false;
        }
        
        public boolean isBorrowed() { //Determines whether the book is borrowed or not
            return this.borrowed;
        }
        
    }
    


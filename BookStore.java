import java.util.ArrayList;

/**
 * a class that creates a collection of Book objects
 * @author Gustavo Correa
 * @version 1.0
 */
public class BookStore
{
    
    private String storeName;
    private Book[] inventory;
    
    private static final int MIN_STRING_LENGTH = 1;
    
    /**
     * default constructor. Generates the book collection from a pre-set list
     */
    public BookStore()
    {
        inventory = new Book[20];
        
        inventory[0] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "ULYSSES");
        inventory[1] = new Book(new Author(new Name("F.", "Fitzgerald", "Scott"),new Date(), new Date()), new Date(), "THE GREAT GATSBY");
        inventory[2] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "A PORTRAIT OF THE ARTIST AS A YOUNG MAN");
        inventory[3] = new Book(new Author(new Name("Vladimir", "Nabokov", null), new Date(), new Date()), new Date(), "LOLITA");
        inventory[4] = new Book(new Author(new Name("Aldous", "Huxley", null), new Date(), new Date()), new Date(), "BRAVE NEW WORLD");
        inventory[5] = new Book(new Author(new Name("William", "Faulkner", null), new Date(), new Date()), new Date(), "THE SOUND AND THE FURY");
        inventory[6] = new Book(new Author(new Name("Joseph", "Heller", null), new Date(), new Date()), new Date(), "CATCH-22");
        inventory[7] = new Book(new Author(new Name("Arthur", "Koestler", null), new Date(), new Date()), new Date(), "DARKNESS AT NOON");
        inventory[8] = new Book(new Author(new Name("D.", "Lawrence", "H."), new Date(), new Date()), new Date(), "SONS AND LOVERS");
        inventory[9] = new Book(new Author(new Name("John", "Steinbeck", null), new Date(), new Date()), new Date(), "THE GRAPES OF WRATH");
        inventory[10] = new Book(new Author(new Name("Malcolm", "Lowry", null), new Date(), new Date()), new Date(), "UNDER THE VOLCANO");
        inventory[11] = new Book(new Author(new Name("Samuel", "Buttler", null), new Date(), new Date()), new Date(), "THE WAY OF ALL FLESH");
        inventory[12] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "1984");
        inventory[13] = new Book(new Author(new Name("Robert", "Graves", null), new Date(), new Date()), new Date(), "I, CLAUDIUS");
        inventory[14] = new Book(new Author(new Name("Virginia", "Woolf", null), new Date(), new Date()), new Date(), "TO THE LIGHTHOUSE");
        inventory[15] = new Book(new Author(new Name("Theodore", "Dreiser", null), new Date(), new Date()), new Date(), "AN AMERICAN TRAGEDY");
        inventory[16] = new Book(new Author(new Name("Carson", "McCullers", null), new Date(), new Date()), new Date(), "THE HEART IS A LONELY HUNTER");
        inventory[17] = new Book(new Author(new Name("Kurt", "Vonnegut", null), new Date(), new Date()), new Date(), "SLAUGHTERHOUSE-FIVE");
        inventory[18] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "ANIMAL FARM");
        inventory[19] = new Book(new Author(new Name("W.", "Maugham", "Somerset"), new Date(), new Date()), new Date(), "OF HUMAN BONDAGE");
    }
    
    /**
     * constructor. Creates the book collection and also creates the Sotre name
     * @param storeName String. The name for the collection. Can't be null or empty and will store Jason's Used Books instead of Taylor's Used Books
     */
    public BookStore(String storeName)
    {
        inventory = new Book[20];
        
        inventory[0] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "ULYSSES");
        inventory[1] = new Book(new Author(new Name("F.", "Fitzgerald", "Scott"),new Date(), new Date()), new Date(), "THE GREAT GATSBY");
        inventory[2] = new Book(new Author(new Name("James", "Joyce", null), new Date(), new Date()), new Date(), "A PORTRAIT OF THE ARTIST AS A YOUNG MAN");
        inventory[3] = new Book(new Author(new Name("Vladimir", "Nabokov", null), new Date(), new Date()), new Date(), "LOLITA");
        inventory[4] = new Book(new Author(new Name("Aldous", "Huxley", null), new Date(), new Date()), new Date(), "BRAVE NEW WORLD");
        inventory[5] = new Book(new Author(new Name("William", "Faulkner", null), new Date(), new Date()), new Date(), "THE SOUND AND THE FURY");
        inventory[6] = new Book(new Author(new Name("Joseph", "Heller", null), new Date(), new Date()), new Date(), "CATCH-22");
        inventory[7] = new Book(new Author(new Name("Arthur", "Koestler", null), new Date(), new Date()), new Date(), "DARKNESS AT NOON");
        inventory[8] = new Book(new Author(new Name("D.", "Lawrence", "H."), new Date(), new Date()), new Date(), "SONS AND LOVERS");
        inventory[9] = new Book(new Author(new Name("John", "Steinbeck", null), new Date(), new Date()), new Date(), "THE GRAPES OF WRATH");
        inventory[10] = new Book(new Author(new Name("Malcolm", "Lowry", null), new Date(), new Date()), new Date(), "UNDER THE VOLCANO");
        inventory[11] = new Book(new Author(new Name("Samuel", "Buttler", null), new Date(), new Date()), new Date(), "THE WAY OF ALL FLESH");
        inventory[12] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "1984");
        inventory[13] = new Book(new Author(new Name("Robert", "Graves", null), new Date(), new Date()), new Date(), "I, CLAUDIUS");
        inventory[14] = new Book(new Author(new Name("Virginia", "Woolf", null), new Date(), new Date()), new Date(), "TO THE LIGHTHOUSE");
        inventory[15] = new Book(new Author(new Name("Theodore", "Dreiser", null), new Date(), new Date()), new Date(), "AN AMERICAN TRAGEDY");
        inventory[16] = new Book(new Author(new Name("Carson", "McCullers", null), new Date(), new Date()), new Date(), "THE HEART IS A LONELY HUNTER");
        inventory[17] = new Book(new Author(new Name("Kurt", "Vonnegut", null), new Date(), new Date()), new Date(), "SLAUGHTERHOUSE-FIVE");
        inventory[18] = new Book(new Author(new Name("George", "Orwell", null), new Date(), new Date()), new Date(), "ANIMAL FARM");
        inventory[19] = new Book(new Author(new Name("W.", "Maugham", "Somerset"), new Date(), new Date()), new Date(), "OF HUMAN BONDAGE");
        
        setStoreName(storeName);
    }
    
    /**
     * mutator for storeName
     * @param name String. Cant be null or empty
     */
    public void setStoreName(String name)
    {
        if(name == null || name.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please provide a name for the Book Store");
        }
        
        if(name.equals("Taylor's Used Books"))
        {
            storeName = "Jason's Used Books";
        }else
        {
            storeName = name;
        }
    }
    
    /**
     * mutator for inventory
     * @param Book[] An array of books to be added to inventory. Can't be null
     */
    public void setInventory(Book[] inventory)
    {
        if (inventory == null)
        {
            throw new IllegalArgumentException("Cannot store a collection that doesn't exist!");
        }
        
        this.inventory = inventory;
    }
    
    /**
     * accessor for storeName
     * @return storeName
     */
    public String getStoreName()
    {
        return storeName;
    }
    
    /**
     * accessor for the book collection inventory
     * @return inventory
     */
    public Book[] getInventory()
    {
        return inventory;
    }
    
    /**
     * returns the number of books in the collection written by the provided author
     * @param authorLastName String. Cant be null or empty
     * @return count Int. Number of books written by the provided author
     */
    public int howManyBooksDidThisAuthorWrite(String authorLastName)
    {
        if(authorLastName == null || authorLastName.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please provide the author's last name");
        }
        
        int count = 0;
        
        for(int i=0; i<inventory.length; i++)
        {
            if(inventory[i] == null)
            {
                continue;
            }
            
            if(inventory[i].getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName))
            {
                count++;
            }
        }
        
        return count;
       
    }
    
    /**
     * returns the full name of the author of the provided book
     * @param title String. The title of the book whose author we're looking for
     * @return String. The author's full name
     */
    public String getAuthorFullName(String title)
    {
        if(title == null || title.length()<MIN_STRING_LENGTH)
        {
            return null;
        }
        
        for (int i=0; i<inventory.length; i++)
        {
            if (inventory[i] == null)
            {
                continue;
            }
            
            if(inventory[i].getTitle().equalsIgnoreCase(title))
            {
                return inventory[i].getAuthorName();
            }
        }
        
        return null;
    }
    
    /**
     * searches the collection for books written by the provided author's last name
     * @param authorLastName String. Can't be null or empty
     * @return result. Book[] containing the resulting books
     */
    public Book[] getBooksWrittenBy(String authorLastName)
    {
        if(authorLastName == null || authorLastName.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please provide the author's last name");
        }
        
        ArrayList<Book> temp = new ArrayList<Book>();
        
        for(Book books : inventory )
        {
            if(books == null)
            {
                continue;
            }
            
            if(books.getAuthor().getName().getLastName().equalsIgnoreCase(authorLastName))
            {
                temp.add(books);
            }
        }
        
        if(temp.size() == 0)
        {
            return null;
        }
        
        Book[] result = new Book[temp.size()];
        result = temp.toArray(result);
        
        return result;
    }
    
    /**
     * checks and returns the first book found that was written by the provided author
     * @param firstName String. Author;s first name for the search. Can't be null or empty
     * @return Book. The first Book object in the collection that was written by the provided author
     */
    public Book getBookWrittenBy(String firstName)
    {
        if(firstName == null || firstName.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please entre the author's first name");
        }
        
        for(Book books : inventory)
        {
            if(books == null)
            {
                continue;
            }
            
            if(books.getAuthor().getName().getFirstName().equalsIgnoreCase(firstName))
            {
                return books;
            }
        }
        
        return null;
    }
    
    /**
     * searches the book collection for books containing the provided substring in their titles
     * @param wordInTitle String. The substring to be serached. Can't be null or empty
     * @return result. String[] an array containing all the matching titles. 
     */ 
    public String[] getBookTitlesContaining(String wordInTitle)
    {
        if(wordInTitle == null || wordInTitle.length()<MIN_STRING_LENGTH)
        {
            throw new IllegalArgumentException("Please enter the word you want to check");
        }
        
        ArrayList<String> tempTitles = new ArrayList<String>();
        
        for(Book books : inventory)
        {                      
            if(books != null && books.getTitle().toLowerCase().contains(wordInTitle.toLowerCase()))
            {
                tempTitles.add(books.getTitle());
            }        
        }
        
        if(tempTitles.size() == 0)
        {
            return null; 
        }
        
        String[] result = new String[tempTitles.size()];
        result = tempTitles.toArray(result);
        
        return result;
    }
    
    
   
}























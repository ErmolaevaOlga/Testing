package seminars.fourth;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import org.mockito.Mock;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookService;
import seminars.fourth.book.InMemoryBookRepository;


public class TestBookService {
    @Mock
    InMemoryBookRepository mockBook;
    BookService bookService;
    Book mockBook1 = new Book("1", "Book1", "Author1");
    @BeforeEach
    public void start() {
        mockBook = mock(InMemoryBookRepository.class);
        bookService = new BookService(mockBook);
    }
    @Test
    public void testFindBookById() {
        String bookId = "1";
        when(mockBook.findById("1")).thenReturn(mockBook1);
        assertThat(bookService.findBookById(bookId)).isEqualTo(mockBook1);
        verify(mockBook, times(1)).findById(bookId);
    }

    @Test
    public void testFindBooks() {
        ArrayList<Book> stubBooks = new ArrayList<Book>();
        stubBooks.add(stubBookId1);
        when(mockBook.findAll()).thenReturn(stubBooks);
        assertThat(bookService.findAllBooks()).isEqualTo(stubBooks);
        verify(mockBook, times(1)).findAll();
    }

}

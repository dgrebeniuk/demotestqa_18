import org.junit.jupiter.api.*;

public class JunitTest {

   @BeforeAll
   static void beforeAll() {
      System.out.println("Here is my beforeAll()");
   }

   @BeforeEach
   void setUp() {
      System.out.println("    Here is my setUp()");
   }

   @AfterAll
   static void afterAll() {
      System.out.println("                Here is my afterAll()");
   }

   @AfterEach
   void tearDown() {
      System.out.println("                   Here is my tearDown()");
   }

   @Test
   void firstTest(){
      System.out.println("          Here is my firstTest()");
   }

   @Test
   void secondTest(){
      System.out.println("          Here is my secondTest()");
   }



}

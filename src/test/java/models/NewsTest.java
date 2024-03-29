package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public News setUpDeptNews(){
        return new News("Christine","my news",3);
    }

    public News setUpGenNews(){
        return new News("Christine","my news");
    }


    @Test
    public void News_newsInstanceOfNews_true() {
        assertTrue(setUpDeptNews() instanceof News);
    }

    @Test
    public void getContent_newsInstantiatesWithContent_true() {
        assertEquals("my news",setUpDeptNews().getContent());
    }

    @Test
    public void getWrittenBy_newsInstantiatesWithWrittenBy_true() {
        assertEquals("Christine",setUpDeptNews().getWrittenBy());
    }

    @Test
    public void setContent_true() {
        News testNews = setUpDeptNews();
        testNews.setContent("These are my news");
        assertNotEquals("my news",testNews.getContent());
    }

    @Test
    public void setWrittenBy_true() {
        News testNews = setUpDeptNews();
        testNews.setWrittenBy("Wangui");
        assertNotEquals("Christine",testNews.getWrittenBy());
    }
}
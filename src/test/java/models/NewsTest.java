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

    public News setUpNews(){
        return new News("my news","Christine");
    }

    @Test
    public void News_newsInstanceOfNews_true() {
        assertTrue(setUpNews() instanceof News);
    }

    @Test
    public void getContent_newsInstantiatesWithContent_true() {
        assertEquals("my news",setUpNews().getContent());
    }

    @Test
    public void getWrittenBy_newsInstantiatesWithWrittenBy_true() {
        assertEquals("Christine",setUpNews().getWrittenBy());
    }


}
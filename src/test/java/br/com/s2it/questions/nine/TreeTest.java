package br.com.s2it.questions.nine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    private Tree tree;

    @Before
    public void before(){
        tree = new Tree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
    }

    @Test
    public void testSumAfterRoot(){
        assertEquals(Integer.valueOf(36),tree.sumNodesAfter(6));
    }

    @Test
    public void testSumAfterSecondNode(){
        assertEquals(Integer.valueOf(8),tree.sumNodesAfter(4));
    }

    @Test
    public void testSumAfterLastNode(){
        assertEquals(Integer.valueOf(0),tree.sumNodesAfter(5));
    }

    @Test
    public void testSumBeginingByRoot(){
        assertEquals(Integer.valueOf(42),tree.sumNodesBegning(6));
    }
    @Test
    public void testSumBeginingBySecondNode(){
        assertEquals(Integer.valueOf(24),tree.sumNodesBegning(8));
    }
    @Test
    public void testSumBeginingByLastNode(){
        assertEquals(Integer.valueOf(9),tree.sumNodesBegning(9));
    }

}
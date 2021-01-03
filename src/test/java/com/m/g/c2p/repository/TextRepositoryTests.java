package com.m.g.c2p.repository;

import com.m.g.c2p.model.Text;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

@DataJpaTest
public class TextRepositoryTests {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    TextRepository textRepository;

    @Test
    public void testSaveNewProduct()
    {
        testEntityManager.persist(new Text("12","cjcgcmhvmn"));
        testEntityManager.persist(new Text("11","nmvmnv,v,"));

        List<Text> texts = textRepository.findAll();

        textRepository.delete(texts.get(0));

        List<Text> newText = textRepository.findAll();

        System.out.println(newText.size());

    }
}

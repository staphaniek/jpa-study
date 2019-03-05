package com.example.jpa

import com.example.jpa.model.GPS
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.persistence.EntityManager

@RunWith(SpringRunner::class)
@SpringBootTest
class JpaEmbeddableDemoApplicationTests {
    @Autowired
    lateinit var entityManager: EntityManager

	@Test
	fun contextLoads() {
        entityManager.clear()
	}

}

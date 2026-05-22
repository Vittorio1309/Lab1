package br.com.faculdadedonaduzzi.lab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class LabApplicationTests {

	@Autowired
	private MockMvc mockMvc;


	@Test
	void testeGetAllTasks() throws Exception {
		mockMvc.perform(get("/tarefas"))
				.andExpect(status().isOk());
	}

}

package harkka.EstateManagement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@WithMockUser(username = "admin", password = "admin", roles = "ADMIN")
class ApiTests {

	@Autowired
	private WebApplicationContext webAppContext;

	private MockMvc mockMvc;

	@BeforeEach
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
	}

	@Test
	public void checkStatus() throws Exception {
		this.mockMvc.perform(get("/estates")).andExpect(status().isOk());
	}

	@Test
	public void checkResponseTypeJSON() throws Exception {

		this.mockMvc.perform(get("/estates")).andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void apiStatusIsOk() throws Exception {

		this.mockMvc.perform(get("/api/estates")).andExpect(status().isOk());
	}

}
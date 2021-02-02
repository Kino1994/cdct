package es.codeurjc.mastercloudapps.planner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import es.codeurjc.mastercloudapps.planner.models.LandscapeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@AutoConfigureStubRunner(ids={"ja.devicentel:toposervice:+:stubs:8080"},
	stubsMode = StubsMode.LOCAL)
class DemoApplicationTests {

	@Test
	void verify_topo_service() {
		RestTemplate restTemplate = new RestTemplate();

		LandscapeResponse landscapeResponse = restTemplate.getForObject("http://localhost:8080/api/topographicdetails/Barcelona", LandscapeResponse.class);

		assertEquals("Barcelona", landscapeResponse.getId());
		assertEquals("Flat", landscapeResponse.getLandscape());
	}
}
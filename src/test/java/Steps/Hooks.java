package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
	}
	
	@After
	public void afterScenario(Scenario sc) {
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
	}
}

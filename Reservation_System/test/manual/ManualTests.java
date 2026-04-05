package manual;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AccountFactoryTest.class, EquipmentFactoryTest.class, 
	AvailableStateTest.class, DisabledStateTest.class, MaintenanceStateTest.class, 
	CancelledStateTest.class, PendingStateTest.class, ExtendedStateTest.class, ConfirmedStateTest.class, 
	GUIControllerTest.class, MainFrameTest.class})
public class ManualTests {
}
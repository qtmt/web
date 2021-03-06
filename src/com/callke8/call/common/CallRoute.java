package com.callke8.call.common;

import com.callke8.call.calltask.CallTaskController;
import com.callke8.call.calltask.TaskExecuteController;
import com.callke8.call.calltask.TaskGraphShowController;
import com.callke8.call.calltelephone.CallTelephoneController;
import com.callke8.system.role.RoleController;
import com.jfinal.config.Routes;

public class CallRoute extends Routes {

	@Override
	public void config() {
		add("/callTask",CallTaskController.class,"/call/calltask");
		add("/callTelephone",CallTelephoneController.class,"/call/calltelephone");
		add("/taskExecute",TaskExecuteController.class,"/call/taskexecute");
		add("/taskGraphShow",TaskGraphShowController.class,"/graphshow/taskgraphshow");
	}

}

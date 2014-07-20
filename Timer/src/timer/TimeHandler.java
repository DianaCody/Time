package timer;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.lang.Thread;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class TimeHandler extends AbstractHandler implements IHandler {
	
	Date date = new Date(System.currentTimeMillis());
	String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
//		boolean isAlarming = true;
//		while(isAlarming){			
			MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"Time Helper", "Current time is " + str);
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {			
//				e.printStackTrace();
//			}
//		}
		return null;
	}
	
	

}

package multunus.onemdm.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import multunus.onemdm.util.Logger;

public class OneMDMService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.debug("OneMDM Service started");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

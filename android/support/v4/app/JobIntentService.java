package android.support.v4.app;

import android.app.Service;
import android.content.ComponentName;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service
{
  static final HashMap<ComponentName, Object> Ef = new HashMap();
  static final Object sLock = new Object();
  boolean Ed = false;
  final ArrayList<Object> Ee;
  boolean mDestroyed = false;
  boolean mStopped = false;

  public JobIntentService()
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (this.Ee = null; ; this.Ee = new ArrayList())
      return;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.app.JobIntentService
 * JD-Core Version:    0.6.2
 */
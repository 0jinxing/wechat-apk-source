package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver
{
  private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
  private static int mNextId = 1;
  private static final SparseArray<PowerManager.WakeLock> sActiveWakeLocks = new SparseArray();

  public static boolean completeWakefulIntent(Intent arg0)
  {
    boolean bool = false;
    int i = ???.getIntExtra("android.support.content.wakelockid", 0);
    if (i == 0);
    while (true)
    {
      return bool;
      synchronized (sActiveWakeLocks)
      {
        PowerManager.WakeLock localWakeLock = (PowerManager.WakeLock)sActiveWakeLocks.get(i);
        if (localWakeLock != null)
        {
          localWakeLock.release();
          sActiveWakeLocks.remove(i);
          bool = true;
          continue;
        }
        bool = true;
      }
    }
  }

  public static ComponentName startWakefulService(Context paramContext, Intent paramIntent)
  {
    synchronized (sActiveWakeLocks)
    {
      int i = mNextId;
      int j = mNextId + 1;
      mNextId = j;
      if (j <= 0)
        mNextId = 1;
      paramIntent.putExtra("android.support.content.wakelockid", i);
      paramIntent = paramContext.startService(paramIntent);
      if (paramIntent == null)
      {
        paramContext = null;
        return paramContext;
      }
      PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>("wake:");
      paramContext = localPowerManager.newWakeLock(1, paramIntent.flattenToShortString());
      paramContext.setReferenceCounted(false);
      paramContext.acquire(60000L);
      sActiveWakeLocks.put(i, paramContext);
      paramContext = paramIntent;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.content.WakefulBroadcastReceiver
 * JD-Core Version:    0.6.2
 */
package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.d;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver
{
  private static ComponentName g(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString);
    localIntent.setPackage(paramContext.getPackageName());
    paramContext = localPackageManager.queryIntentServices(localIntent, 0);
    if (paramContext.size() == 1)
      paramContext = (ResolveInfo)paramContext.get(0);
    for (paramContext = new ComponentName(paramContext.serviceInfo.packageName, paramContext.serviceInfo.name); ; paramContext = null)
    {
      return paramContext;
      if (!paramContext.isEmpty())
        break;
    }
    throw new IllegalStateException("Expected 1 service that handles " + paramString + ", found " + paramContext.size());
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (!"android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction())) || (!paramIntent.hasExtra("android.intent.extra.KEY_EVENT")))
      new StringBuilder("Ignore unsupported intent: ").append(paramIntent);
    while (true)
    {
      return;
      ComponentName localComponentName = g(paramContext, "android.intent.action.MEDIA_BUTTON");
      if (localComponentName != null)
      {
        paramIntent.setComponent(localComponentName);
        if (Build.VERSION.SDK_INT >= 26)
          paramContext.startForegroundService(paramIntent);
        else
          paramContext.startService(paramIntent);
      }
      else
      {
        localComponentName = g(paramContext, "android.media.browse.MediaBrowserService");
        if (localComponentName == null)
          break;
        BroadcastReceiver.PendingResult localPendingResult = goAsync();
        paramContext = paramContext.getApplicationContext();
        paramIntent = new MediaButtonReceiver.a(paramContext, paramIntent, localPendingResult);
        paramContext = new MediaBrowserCompat(paramContext, localComponentName, paramIntent);
        paramIntent.Ji = paramContext;
        paramContext.HJ.connect();
      }
    }
    throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaButtonReceiver
 * JD-Core Version:    0.6.2
 */
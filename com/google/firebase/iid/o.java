package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.support.v4.f.m;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public final class o
{
  private static o bvV;

  @GuardedBy("serviceClassNames")
  private final m<String, String> bvW;
  private Boolean bvX;
  final Queue<Intent> bvY;
  public final Queue<Intent> bvZ;

  private o()
  {
    AppMethodBeat.i(108745);
    this.bvW = new m();
    this.bvX = null;
    this.bvY = new ArrayDeque();
    this.bvZ = new ArrayDeque();
    AppMethodBeat.o(108745);
  }

  public static PendingIntent a(Context paramContext, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(108746);
    Intent localIntent = new Intent(paramContext, FirebaseInstanceIdReceiver.class);
    localIntent.setAction("com.google.firebase.MESSAGING_EVENT");
    localIntent.putExtra("wrapped_intent", paramIntent);
    paramContext = PendingIntent.getBroadcast(paramContext, paramInt, localIntent, 1073741824);
    AppMethodBeat.o(108746);
    return paramContext;
  }

  private final int c(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(108748);
    synchronized (this.bvW)
    {
      ??? = (String)this.bvW.get(paramIntent.getAction());
      ??? = ???;
      if (??? == null)
      {
        ??? = paramContext.getPackageManager().resolveService(paramIntent, 0);
        if (??? != null)
          if (((ResolveInfo)???).serviceInfo != null)
            break label130;
      }
    }
    try
    {
      boolean bool;
      if (this.bvX == null)
      {
        if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
        {
          bool = true;
          label78: this.bvX = Boolean.valueOf(bool);
        }
      }
      else
      {
        if (!this.bvX.booleanValue())
          break label382;
        paramContext = WakefulBroadcastReceiver.startWakefulService(paramContext, paramIntent);
        label103: if (paramContext != null)
          break label391;
        i = 404;
        AppMethodBeat.o(108748);
      }
      while (true)
      {
        return i;
        paramContext = finally;
        AppMethodBeat.o(108748);
        throw paramContext;
        label130: ??? = ((ResolveInfo)???).serviceInfo;
        if ((!paramContext.getPackageName().equals(((ServiceInfo)???).packageName)) || (((ServiceInfo)???).name == null))
        {
          ??? = ((ServiceInfo)???).packageName;
          ??? = ((ServiceInfo)???).name;
          new StringBuilder(String.valueOf(???).length() + 94 + String.valueOf(???).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append((String)???).append("/").append((String)???);
          break;
        }
        ??? = ((ServiceInfo)???).name;
        ??? = ???;
        if (((String)???).startsWith("."))
        {
          ??? = String.valueOf(paramContext.getPackageName());
          ??? = String.valueOf(???);
          if (((String)???).length() == 0)
            break label340;
          ??? = ((String)???).concat((String)???);
        }
        while (true)
        {
          synchronized (this.bvW)
          {
            this.bvW.put(paramIntent.getAction(), ???);
            if (Log.isLoggable("FirebaseInstanceId", 3))
            {
              ??? = String.valueOf(???);
              if (((String)???).length() != 0)
                "Restricting intent to a specific service: ".concat((String)???);
            }
            else
            {
              paramIntent.setClassName(paramContext.getPackageName(), (String)???);
              break;
              label340: ??? = new String((String)???);
            }
          }
          new String("Restricting intent to a specific service: ");
        }
        bool = false;
        break label78;
        label382: paramContext = paramContext.startService(paramIntent);
        break label103;
        label391: i = -1;
        AppMethodBeat.o(108748);
      }
    }
    catch (SecurityException paramContext)
    {
      while (true)
      {
        i = 401;
        AppMethodBeat.o(108748);
      }
    }
    catch (IllegalStateException paramContext)
    {
      while (true)
      {
        paramContext = String.valueOf(paramContext);
        new StringBuilder(String.valueOf(paramContext).length() + 45).append("Failed to start service while in background: ").append(paramContext);
        int i = 402;
        AppMethodBeat.o(108748);
      }
    }
  }

  public static o uS()
  {
    try
    {
      AppMethodBeat.i(108744);
      if (bvV == null)
      {
        localo = new com/google/firebase/iid/o;
        localo.<init>();
        bvV = localo;
      }
      o localo = bvV;
      AppMethodBeat.o(108744);
      return localo;
    }
    finally
    {
    }
  }

  public final int a(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(108747);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0)
          "Unknown service action: ".concat(paramContext);
        break;
      case 0:
      case 1:
      }
      break;
    case -842411455:
    case 41532704:
    }
    while (true)
    {
      i = 500;
      AppMethodBeat.o(108747);
      return i;
      if (!paramString.equals("com.google.firebase.INSTANCE_ID_EVENT"))
        break;
      i = 0;
      break;
      if (!paramString.equals("com.google.firebase.MESSAGING_EVENT"))
        break;
      i = 1;
      break;
      this.bvY.offer(paramIntent);
      while (true)
      {
        paramString = new Intent(paramString);
        paramString.setPackage(paramContext.getPackageName());
        i = c(paramContext, paramString);
        AppMethodBeat.o(108747);
        break;
        this.bvZ.offer(paramIntent);
      }
      new String("Unknown service action: ");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.o
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AppBrandMainProcessService extends Service
{
  private static c huH;
  private static ServiceConnection huI;
  private static final LinkedList<Parcel> huJ;
  private static Map<String, WeakReference<MainProcessTask>> huK;
  private static final Handler huL;
  private static Messenger huM;
  private static final Set<AppBrandMainProcessService.a> huN;
  private final HashMap<String, IBinder.DeathRecipient> huE;
  private final Messenger huF;
  private final c.a huG;
  private final Handler mHandler;

  static
  {
    AppMethodBeat.i(91006);
    huJ = new LinkedList();
    huK = new ConcurrentHashMap();
    huL = new AppBrandMainProcessService.3(Looper.getMainLooper());
    huM = new Messenger(huL);
    huN = Collections.newSetFromMap(new ConcurrentHashMap());
    AppMethodBeat.o(91006);
  }

  public AppBrandMainProcessService()
  {
    AppMethodBeat.i(90988);
    this.huE = new HashMap();
    this.mHandler = new AppBrandMainProcessService.1(this, m.aNS().oAl.getLooper());
    this.huF = new Messenger(this.mHandler);
    this.huG = new c.a()
    {
      public final void a(IBinder paramAnonymousIBinder, String paramAnonymousString)
      {
        AppMethodBeat.i(90984);
        AppBrandMainProcessService.2.1 local1 = new AppBrandMainProcessService.2.1(this, paramAnonymousString, paramAnonymousIBinder);
        try
        {
          paramAnonymousIBinder.linkToDeath(local1, 0);
          AppBrandMainProcessService.b(AppBrandMainProcessService.this).put(paramAnonymousString, local1);
          AppBrandMainProcessService.aBO();
          AppMethodBeat.o(90984);
          return;
        }
        catch (Exception paramAnonymousIBinder)
        {
          while (true)
          {
            ab.e("MicroMsg.AppBrandMainProcessService", "registerDeathRecipient: %s", new Object[] { paramAnonymousIBinder });
            AppMethodBeat.o(90984);
          }
        }
      }

      public final void w(Bundle paramAnonymousBundle)
      {
        AppMethodBeat.i(90982);
        Message localMessage = Message.obtain();
        localMessage.setData(paramAnonymousBundle);
        AppBrandMainProcessService.a(AppBrandMainProcessService.this).send(localMessage);
        AppMethodBeat.o(90982);
      }

      public final void x(Bundle paramAnonymousBundle)
      {
        AppMethodBeat.i(90983);
        paramAnonymousBundle = AppBrandMainProcessService.b(paramAnonymousBundle, false);
        if (paramAnonymousBundle != null)
          paramAnonymousBundle.asP();
        AppMethodBeat.o(90983);
      }
    };
    AppMethodBeat.o(90988);
  }

  static Bundle a(MainProcessTask paramMainProcessTask, boolean paramBoolean)
  {
    AppMethodBeat.i(90998);
    Bundle localBundle = new Bundle(3);
    localBundle.putParcelable("task_object", paramMainProcessTask);
    if (paramBoolean)
      localBundle.putParcelable("task_client", huM);
    localBundle.putString("task_id", paramMainProcessTask.hvr);
    AppMethodBeat.o(90998);
    return localBundle;
  }

  private static MainProcessTask a(Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(90999);
    paramBundle.setClassLoader(MainProcessTask.class.getClassLoader());
    MainProcessTask localMainProcessTask = (MainProcessTask)paramBundle.getParcelable("task_object");
    if (localMainProcessTask == null)
    {
      paramBundle = null;
      AppMethodBeat.o(90999);
    }
    while (true)
    {
      return paramBundle;
      if (paramBoolean)
        localMainProcessTask.hvF = ((Messenger)paramBundle.getParcelable("task_client"));
      localMainProcessTask.hvr = paramBundle.getString("task_id");
      AppMethodBeat.o(90999);
      paramBundle = localMainProcessTask;
    }
  }

  public static void a(AppBrandMainProcessService.a parama)
  {
    AppMethodBeat.i(90994);
    huN.add(parama);
    AppMethodBeat.o(90994);
  }

  public static void a(MainProcessTask paramMainProcessTask)
  {
    AppMethodBeat.i(90989);
    huK.put(paramMainProcessTask.hvr, new WeakReference(paramMainProcessTask));
    u(a(paramMainProcessTask, true));
    AppMethodBeat.o(90989);
  }

  private static void a(MainProcessTask paramMainProcessTask1, MainProcessTask paramMainProcessTask2)
  {
    AppMethodBeat.i(90996);
    Parcel localParcel = Parcel.obtain();
    paramMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramMainProcessTask2.g(localParcel);
    localParcel.recycle();
    AppMethodBeat.o(90996);
  }

  public static void aBM()
  {
    AppMethodBeat.i(90993);
    if (huI == null)
      huI = new ServiceConnection()
      {
        public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          AppMethodBeat.i(90986);
          AppBrandMainProcessService.a(c.a.r(paramAnonymousIBinder));
          AppBrandMainProcessService.access$800();
          ah.getPackageName();
          AppBrandMainProcessService.aBO();
          try
          {
            paramAnonymousIBinder = AppBrandMainProcessService.aBP();
            paramAnonymousComponentName = new android/os/Binder;
            paramAnonymousComponentName.<init>();
            paramAnonymousIBinder.a(paramAnonymousComponentName, ah.getProcessName());
            ab.i("MicroMsg.AppBrandMainProcessService", "onServiceConnected(%s)", new Object[] { ah.getProcessName() });
            AppMethodBeat.o(90986);
            return;
          }
          catch (Exception paramAnonymousComponentName)
          {
            while (true)
              ab.e("MicroMsg.AppBrandMainProcessService", "onServiceConnected, registerDeathRecipient, %s", new Object[] { paramAnonymousComponentName });
          }
        }

        public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
        {
          AppMethodBeat.i(90987);
          AppBrandMainProcessService.a(null);
          ah.getPackageName();
          AppBrandMainProcessService.aBN();
          AppBrandMainProcessService.aBM();
          ab.i("MicroMsg.AppBrandMainProcessService", "onServiceDisconnected(%s)", new Object[] { ah.getProcessName() });
          AppMethodBeat.o(90987);
        }
      };
    ab.i("MicroMsg.AppBrandMainProcessService", "tryBindService");
    Context localContext = ah.getContext();
    Intent localIntent = new Intent(localContext, AppBrandMainProcessService.class);
    try
    {
      localContext.bindService(localIntent, huI, 1);
      AppMethodBeat.o(90993);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandMainProcessService", "bindService() Exception:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(90993);
      }
    }
  }

  public static void b(AppBrandMainProcessService.a parama)
  {
    AppMethodBeat.i(90995);
    huN.remove(parama);
    AppMethodBeat.o(90995);
  }

  public static boolean b(MainProcessTask paramMainProcessTask)
  {
    boolean bool = false;
    AppMethodBeat.i(90990);
    Bundle localBundle = a(paramMainProcessTask, false);
    if (t(localBundle));
    while (true)
    {
      try
      {
        a(a(localBundle, false), paramMainProcessTask);
        paramMainProcessTask.asQ();
        bool = true;
        AppMethodBeat.o(90990);
        return bool;
      }
      catch (NullPointerException paramMainProcessTask)
      {
        AppMethodBeat.o(90990);
        continue;
      }
      AppMethodBeat.o(90990);
    }
  }

  private static boolean t(Bundle paramBundle)
  {
    AppMethodBeat.i(90991);
    boolean bool = true;
    try
    {
      huH.x(paramBundle);
      AppMethodBeat.o(90991);
      return bool;
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        bool = false;
        ab.e("MicroMsg.AppBrandMainProcessService", paramBundle.getMessage());
      }
    }
  }

  private static void u(Bundle paramBundle)
  {
    AppMethodBeat.i(90992);
    if (huH == null)
      aBM();
    while (true)
    {
      synchronized (huJ)
      {
        huJ.add(v(paramBundle));
        AppMethodBeat.o(90992);
        return;
      }
      try
      {
        huH.w(paramBundle);
        AppMethodBeat.o(90992);
      }
      catch (Exception paramBundle)
      {
        ab.e("MicroMsg.AppBrandMainProcessService", paramBundle.getMessage());
        AppMethodBeat.o(90992);
      }
    }
  }

  private static Parcel v(Bundle paramBundle)
  {
    AppMethodBeat.i(90997);
    Parcel localParcel = Parcel.obtain();
    paramBundle.writeToParcel(localParcel, 0);
    AppMethodBeat.o(90997);
    return localParcel;
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.huG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService
 * JD-Core Version:    0.6.2
 */
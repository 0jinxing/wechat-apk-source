package com.tencent.mm.plugin.wepkg.ipc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WepkgMainProcessService extends Service
{
  private static ServiceConnection huI;
  private static Map<Integer, WeakReference<WepkgMainProcessTask>> huK;
  private static Handler huL;
  private static Messenger huM;
  private static a uWG;
  private static final LinkedList<Message> uWH;
  private final Messenger huF;
  private final Handler mHandler;
  private final a.a uWF;

  static
  {
    AppMethodBeat.i(63500);
    uWH = new LinkedList();
    huK = new ConcurrentHashMap();
    huL = new WepkgMainProcessService.3(Looper.getMainLooper());
    huM = new Messenger(huL);
    AppMethodBeat.o(63500);
  }

  public WepkgMainProcessService()
  {
    AppMethodBeat.i(63486);
    this.mHandler = new WepkgMainProcessService.1(this, d.aNS().oAl.getLooper());
    this.huF = new Messenger(this.mHandler);
    this.uWF = new WepkgMainProcessService.2(this);
    AppMethodBeat.o(63486);
  }

  public static void a(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    AppMethodBeat.i(63487);
    huK.put(Integer.valueOf(paramWepkgMainProcessTask.hashCode()), new WeakReference(paramWepkgMainProcessTask));
    Message localMessage = Message.obtain();
    localMessage.what = paramWepkgMainProcessTask.hashCode();
    localMessage.replyTo = huM;
    localMessage.setData(c(paramWepkgMainProcessTask));
    s(localMessage);
    AppMethodBeat.o(63487);
  }

  private static void a(WepkgMainProcessTask paramWepkgMainProcessTask1, WepkgMainProcessTask paramWepkgMainProcessTask2)
  {
    AppMethodBeat.i(63494);
    Parcel localParcel = Parcel.obtain();
    paramWepkgMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramWepkgMainProcessTask2.g(localParcel);
    localParcel.recycle();
    AppMethodBeat.o(63494);
  }

  private static void aBM()
  {
    AppMethodBeat.i(63491);
    if (huI == null)
      huI = new WepkgMainProcessService.4();
    ab.i("MicroMsg.Wepkg.WepkgMainProcessService", "tryBindService");
    Context localContext = ah.getContext();
    Intent localIntent = new Intent(localContext, WepkgMainProcessService.class);
    try
    {
      localContext.bindService(localIntent, huI, 1);
      AppMethodBeat.o(63491);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Wepkg.WepkgMainProcessService", "tryBind() Exception:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(63491);
      }
    }
  }

  private static WepkgMainProcessTask ar(Bundle paramBundle)
  {
    AppMethodBeat.i(63493);
    paramBundle.setClassLoader(WepkgMainProcessTask.class.getClassLoader());
    paramBundle = (WepkgMainProcessTask)paramBundle.getParcelable("task_object");
    AppMethodBeat.o(63493);
    return paramBundle;
  }

  public static boolean b(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    AppMethodBeat.i(63488);
    Bundle localBundle = c(paramWepkgMainProcessTask);
    boolean bool;
    if (t(localBundle))
    {
      a(ar(localBundle), paramWepkgMainProcessTask);
      paramWepkgMainProcessTask.asQ();
      bool = true;
      AppMethodBeat.o(63488);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63488);
    }
  }

  static Bundle c(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    AppMethodBeat.i(63492);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("task_object", paramWepkgMainProcessTask);
    AppMethodBeat.o(63492);
    return localBundle;
  }

  public static boolean isLive()
  {
    if (uWG != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void s(Message paramMessage)
  {
    AppMethodBeat.i(63490);
    paramMessage.replyTo = huM;
    if (uWG == null)
      aBM();
    while (true)
    {
      synchronized (uWH)
      {
        uWH.add(paramMessage);
        AppMethodBeat.o(63490);
        return;
      }
      try
      {
        uWG.r(paramMessage);
        AppMethodBeat.o(63490);
      }
      catch (Exception paramMessage)
      {
        ab.e("MicroMsg.Wepkg.WepkgMainProcessService", paramMessage.getMessage());
        AppMethodBeat.o(63490);
      }
    }
  }

  private static boolean t(Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(63489);
    boolean bool2 = true;
    if (uWG == null)
    {
      aBM();
      AppMethodBeat.o(63489);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        uWG.x(paramBundle);
        AppMethodBeat.o(63489);
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.e("MicroMsg.Wepkg.WepkgMainProcessService", paramBundle.getMessage());
          bool2 = false;
        }
      }
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.uWF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService
 * JD-Core Version:    0.6.2
 */
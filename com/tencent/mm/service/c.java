package com.tencent.mm.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private static ConcurrentHashMap<String, b> xFh;
  private static Vector<Intent> xFi;
  private static Vector<Intent> xFj;
  private static ConcurrentHashMap<Integer, String> xFk;
  private static ConcurrentHashMap<Integer, IBinder> xFl;
  private static ConcurrentHashMap<Integer, IBinder.DeathRecipient> xFm;

  static
  {
    AppMethodBeat.i(115294);
    xFh = new ConcurrentHashMap();
    xFi = new Vector();
    xFj = new Vector();
    xFk = new ConcurrentHashMap();
    xFl = new ConcurrentHashMap();
    xFm = new ConcurrentHashMap();
    AppMethodBeat.o(115294);
  }

  public static void a(Intent paramIntent1, String paramString, boolean paramBoolean, Intent paramIntent2)
  {
    AppMethodBeat.i(115287);
    if (paramIntent1 == null)
    {
      ab.i("MicroMsg.MMServiceHelper", "startService Intent == null");
      AppMethodBeat.o(115287);
    }
    while (true)
      while (true)
      {
        return;
        String str = paramIntent1.getComponent().getClassName();
        if (bo.isNullOrNil(str))
        {
          ab.i("MicroMsg.MMServiceHelper", "startService() ClassName = null processName = %s", new Object[] { paramString });
          AppMethodBeat.o(115287);
        }
        else
        {
          ab.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s", new Object[] { str, paramString });
          e.pXa.a(963L, 0L, 1L, false);
          paramIntent1.putExtra("class_name", str);
          Object localObject = (b)xFh.get(paramString);
          if (localObject == null)
          {
            e.pXa.a(963L, 1L, 1L, false);
            xFi.add(paramIntent1);
            localObject = ah.getContext();
            h((Context)localObject, paramString, paramIntent2);
            try
            {
              ServiceConnection local1 = new com/tencent/mm/service/c$1;
              local1.<init>(str, paramString, paramIntent1, paramBoolean, paramIntent2);
              ab.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s bindService_result = %b", new Object[] { str, paramString, Boolean.valueOf(((Context)localObject).bindService(paramIntent2, local1, 1)) });
              AppMethodBeat.o(115287);
            }
            catch (Exception paramIntent1)
            {
              ab.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", new Object[] { str, paramString, paramIntent1.getMessage() });
              AppMethodBeat.o(115287);
            }
          }
          else
          {
            e.pXa.a(963L, 6L, 1L, false);
            try
            {
              ab.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, startService() ClassName = %s ProcessName = %s ", new Object[] { str, paramString });
              ((b)localObject).aH(paramIntent1);
              AppMethodBeat.o(115287);
            }
            catch (Exception localException)
            {
              ab.i("MicroMsg.MMServiceHelper", "startService ClassName = %s ProcessName = %s  exception = %s stack[%s]", new Object[] { str, paramString, localException.getMessage(), bo.dpG() });
              xFh.remove(paramString);
              if (paramBoolean)
              {
                e.pXa.a(963L, 5L, 1L, false);
                paramBoolean = false;
                break;
              }
              AppMethodBeat.o(115287);
            }
          }
        }
      }
  }

  public static void a(ServiceConnection paramServiceConnection, String paramString, boolean paramBoolean, Intent paramIntent)
  {
    AppMethodBeat.i(115290);
    if (paramServiceConnection == null)
    {
      ab.i("MicroMsg.MMServiceHelper", "unbindService ServiceConnection == null");
      AppMethodBeat.o(115290);
    }
    while (true)
      while (true)
      {
        return;
        String str = (String)xFk.remove(Integer.valueOf(paramServiceConnection.hashCode()));
        Object localObject1 = (IBinder)xFl.remove(Integer.valueOf(paramServiceConnection.hashCode()));
        Object localObject2 = (IBinder.DeathRecipient)xFm.remove(Integer.valueOf(paramServiceConnection.hashCode()));
        if (localObject1 != null)
          ((IBinder)localObject1).unlinkToDeath((IBinder.DeathRecipient)localObject2, 0);
        if (bo.isNullOrNil(str))
        {
          ab.i("MicroMsg.MMServiceHelper", "unbindService() processName = %s", new Object[] { paramString });
          AppMethodBeat.o(115290);
        }
        else
        {
          ab.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s processName = %s", new Object[] { str, paramString });
          e.pXa.a(963L, 46L, 1L, false);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("class_name", str);
          ((Intent)localObject2).putExtra("service_connection", paramServiceConnection.hashCode());
          localObject1 = (b)xFh.get(paramString);
          if (localObject1 == null)
          {
            e.pXa.a(963L, 47L, 1L, false);
            Context localContext = ah.getContext();
            h(localContext, paramString, paramIntent);
            try
            {
              localObject1 = new com/tencent/mm/service/c$5;
              ((5)localObject1).<init>(str, paramString, (Intent)localObject2, paramBoolean, paramServiceConnection, paramIntent);
              ab.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s bindService_result = %b", new Object[] { str, paramString, Boolean.valueOf(localContext.bindService(paramIntent, (ServiceConnection)localObject1, 1)) });
              AppMethodBeat.o(115290);
            }
            catch (Exception paramServiceConnection)
            {
              ab.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", new Object[] { str, paramString, paramServiceConnection.getMessage() });
              AppMethodBeat.o(115290);
            }
          }
          else
          {
            e.pXa.a(963L, 52L, 1L, false);
            try
            {
              ab.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, unbindService() ClassName = %s ProcessName = %s ", new Object[] { str, paramString });
              ((b)localObject1).aN((Intent)localObject2);
              AppMethodBeat.o(115290);
            }
            catch (Exception localException)
            {
              ab.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s exception = %s stack[%s]", new Object[] { str, paramString, localException.getMessage(), bo.dpG() });
              xFh.remove(paramString);
              if (paramBoolean)
              {
                e.pXa.a(963L, 51L, 1L, false);
                paramBoolean = false;
                break;
              }
              AppMethodBeat.o(115290);
            }
          }
        }
      }
  }

  public static void a(String paramString, final boolean paramBoolean, final Intent paramIntent)
  {
    AppMethodBeat.i(115291);
    Context localContext = ah.getContext();
    h(localContext, paramString, paramIntent);
    ab.i("MicroMsg.MMServiceHelper", "startProcessService() processName = %s", new Object[] { paramString });
    localContext.bindService(paramIntent, new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        AppMethodBeat.i(115285);
        ab.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected()", new Object[] { this.xFo });
        if (paramAnonymousIBinder == null)
        {
          ab.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected() service == null", new Object[] { this.xFo });
          AppMethodBeat.o(115285);
        }
        while (true)
        {
          return;
          paramAnonymousComponentName = b.a.N(paramAnonymousIBinder);
          c.dqA().put(this.xFo, paramAnonymousComponentName);
          AppMethodBeat.o(115285);
        }
      }

      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        AppMethodBeat.i(115286);
        ab.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceDisconnected()", new Object[] { this.xFo });
        e.pXa.a(963L, 4L, 1L, false);
        c.dqA().remove(this.xFo);
        if (paramBoolean)
          c.a(this.xFo, false, paramIntent);
        AppMethodBeat.o(115286);
      }
    }
    , 1);
    AppMethodBeat.o(115291);
  }

  public static boolean a(Intent paramIntent1, ServiceConnection paramServiceConnection, int paramInt, String paramString, boolean paramBoolean, Intent paramIntent2)
  {
    AppMethodBeat.i(115289);
    if (paramIntent1 == null)
    {
      ab.i("MicroMsg.MMServiceHelper", "bindService Intent == null");
      paramBoolean = false;
      AppMethodBeat.o(115289);
    }
    String str;
    while (true)
    {
      return paramBoolean;
      str = paramIntent1.getComponent().getClassName();
      if (!bo.isNullOrNil(str))
        break;
      ab.i("MicroMsg.MMServiceHelper", "bindService() processName = %s", new Object[] { paramString });
      paramBoolean = false;
      AppMethodBeat.o(115289);
    }
    ab.i("MicroMsg.MMServiceHelper", "bindService() ClassName = %s ProcessName = %s", new Object[] { str, paramString });
    e.pXa.a(963L, 31L, 1L, false);
    Object localObject1 = (b)xFh.get(paramString);
    paramIntent1.putExtra("class_name", str);
    paramIntent1.putExtra("service_connection", paramServiceConnection.hashCode());
    xFk.put(Integer.valueOf(paramServiceConnection.hashCode()), str);
    if (localObject1 == null)
    {
      e.pXa.a(963L, 32L, 1L, false);
      xFj.add(paramIntent1);
      localObject1 = ah.getContext();
      h((Context)localObject1, paramString, paramIntent2);
    }
    while (true)
    {
      Object localObject2;
      try
      {
        localObject2 = new com/tencent/mm/service/c$3;
        ((3)localObject2).<init>(paramIntent2, str, paramString, paramIntent1, paramServiceConnection, paramBoolean, paramInt);
        paramBoolean = ((Context)localObject1).bindService(paramIntent2, (ServiceConnection)localObject2, 1);
        ab.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s bindService_result = %b", new Object[] { paramIntent2.getComponent().getClassName(), str, paramString, Boolean.valueOf(paramBoolean) });
        paramBoolean = true;
        AppMethodBeat.o(115289);
      }
      catch (Exception paramIntent1)
      {
        ab.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s Context.bindService() Exception = %s", new Object[] { paramIntent2.getComponent().getClassName(), str, paramString, paramIntent1.getMessage() });
        continue;
      }
      e.pXa.a(963L, 37L, 1L, false);
      try
      {
        ab.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, bindService() ClassName = %s ProcessName = %s ", new Object[] { str, paramString });
        localObject2 = new com/tencent/mm/service/c$4;
        ((4)localObject2).<init>(paramIntent2, str, paramString, paramServiceConnection);
        ((b)localObject1).a(paramIntent1, (a)localObject2);
      }
      catch (Exception localException)
      {
        ab.i("MicroMsg.MMServiceHelper", "bindService ClassName = %s ProcessName = %s exception = %s stack[%s]", new Object[] { str, paramString, localException.getMessage(), bo.dpG() });
        xFh.remove(paramString);
      }
      if (paramBoolean)
      {
        e.pXa.a(963L, 36L, 1L, false);
        a(paramIntent1, paramServiceConnection, paramInt, paramString, false, paramIntent2);
      }
    }
  }

  private static boolean anQ(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(115293);
    if (!bo.isEqual(paramString, "mm"))
      AppMethodBeat.o(115293);
    while (true)
    {
      return bool;
      if (d.iW(26))
      {
        int i = ah.getContext().getSharedPreferences("service_launch_way", 4).getInt("huawei_switch", 0);
        ab.i("MicroMsg.MMServiceHelper", "ifTarget26StartServiceHuawei() huaweiEnable : %s", new Object[] { Integer.valueOf(i) });
        if (bo.gW(i, 0))
        {
          AppMethodBeat.o(115293);
        }
        else
        {
          AppMethodBeat.o(115293);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(115293);
        bool = true;
      }
    }
  }

  public static void b(Intent paramIntent1, String paramString, boolean paramBoolean, Intent paramIntent2)
  {
    AppMethodBeat.i(115288);
    if (paramIntent1 == null)
    {
      ab.i("MicroMsg.MMServiceHelper", "stopService Intent == null");
      AppMethodBeat.o(115288);
    }
    while (true)
      while (true)
      {
        return;
        String str = paramIntent1.getComponent().getClassName();
        if (bo.isNullOrNil(str))
        {
          ab.i("MicroMsg.MMServiceHelper", "stopService() ClassName = null processName = %s", new Object[] { paramString });
          AppMethodBeat.o(115288);
        }
        else
        {
          ab.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s", new Object[] { str, paramString });
          e.pXa.a(963L, 16L, 1L, false);
          Object localObject = (b)xFh.get(paramString);
          paramIntent1.putExtra("class_name", str);
          if (localObject == null)
          {
            e.pXa.a(963L, 17L, 1L, false);
            localObject = ah.getContext();
            h((Context)localObject, paramString, paramIntent2);
            try
            {
              ServiceConnection local2 = new com/tencent/mm/service/c$2;
              local2.<init>(str, paramString, paramIntent1, paramBoolean, paramIntent2);
              ab.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s bindService_result = %b", new Object[] { str, paramString, Boolean.valueOf(((Context)localObject).bindService(paramIntent2, local2, 1)) });
              AppMethodBeat.o(115288);
            }
            catch (Exception paramIntent1)
            {
              ab.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", new Object[] { str, paramString, paramIntent1.getMessage() });
              AppMethodBeat.o(115288);
            }
          }
          else
          {
            e.pXa.a(963L, 22L, 1L, false);
            try
            {
              ab.i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, stopService() ClassName = %s ProcessName = %s stack[%s]", new Object[] { str, paramString, bo.dpG() });
              ((b)localObject).aI(paramIntent1);
              AppMethodBeat.o(115288);
            }
            catch (Exception localException)
            {
              ab.i("MicroMsg.MMServiceHelper", "stopService ClassName = %s ProcessName = %s exception = %s", new Object[] { str, paramString, localException.getMessage() });
              xFh.remove(paramString);
              if (paramBoolean)
              {
                e.pXa.a(963L, 21L, 1L, false);
                paramBoolean = false;
                break;
              }
              AppMethodBeat.o(115288);
            }
          }
        }
      }
  }

  private static void h(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(115292);
    if (anQ(paramString));
    while (true)
    {
      try
      {
        paramContext.startService(paramIntent);
        AppMethodBeat.o(115292);
        return;
      }
      catch (Exception paramContext)
      {
        ab.i("MicroMsg.MMServiceHelper", "startProcessService() Exception:%s %s", new Object[] { paramContext.getClass().toString(), paramContext.getMessage() });
      }
      AppMethodBeat.o(115292);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.c
 * JD-Core Version:    0.6.2
 */
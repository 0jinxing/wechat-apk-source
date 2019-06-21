package com.tencent.mm.ipcinvoker;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b.a.a;
import com.tencent.mm.ipcinvoker.e.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class BaseIPCService extends Service
{
  private a.a eFA = new BaseIPCService.1(this);
  private volatile boolean eFy;
  private volatile boolean eFz;

  public final void ci(boolean paramBoolean)
  {
    if ((this.eFz) && (!paramBoolean))
      com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "abort kill self(%s), the service was connected by other process.", new Object[] { getProcessName() });
    while (true)
    {
      return;
      com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "kill self(%s)", new Object[] { getProcessName() });
      this.eFy = true;
      b.PL().PM();
      Object localObject1 = b.PL();
      com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "releaseAllIPCBridge", new Object[0]);
      if (!((b)localObject1).eFL.isEmpty());
      synchronized (((b)localObject1).eFL)
      {
        if (((b)localObject1).eFL.isEmpty());
        do
        {
          HashSet localHashSet;
          do
          {
            stopSelf();
            localObject1 = h.PO();
            ??? = getProcessName();
            ((h)localObject1).eGf.remove(???);
            m.t(new BaseIPCService.2(this));
            break;
            localHashSet = new java/util/HashSet;
            localHashSet.<init>(((b)localObject1).eFL.keySet());
          }
          while (localHashSet.isEmpty());
          ??? = localHashSet.iterator();
        }
        while (!((Iterator)???).hasNext());
        ((b)localObject1).lf((String)((Iterator)???).next());
      }
    }
  }

  public abstract String getProcessName();

  public IBinder onBind(Intent paramIntent)
  {
    com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "onBind(%s), killSelf(%s)", new Object[] { paramIntent, Boolean.valueOf(this.eFy) });
    if (this.eFy)
    {
      com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "need to kill self, return null Binder object.", new Object[0]);
      paramIntent = null;
      return paramIntent;
    }
    paramIntent = h.PO();
    String str = e.PN();
    if ((str == null) || (str.length() == 0));
    while (true)
    {
      this.eFz = true;
      paramIntent = this.eFA;
      break;
      paramIntent.eGf.put(str, this);
    }
  }

  public boolean onUnbind(Intent paramIntent)
  {
    com.tencent.mm.ipcinvoker.h.b.i("IPC.BaseIPCService", "onUnbind(%s)", new Object[] { paramIntent });
    boolean bool = super.onUnbind(paramIntent);
    this.eFz = false;
    return bool;
  }

  static final class a
    implements c<Parcelable>, a
  {
    com.tencent.mm.ipcinvoker.b.b eFG;
    final List<com.tencent.mm.ipcinvoker.e.b> eFH;

    public a(com.tencent.mm.ipcinvoker.b.b paramb)
    {
      AppMethodBeat.i(114003);
      this.eFH = new LinkedList();
      this.eFG = paramb;
      if (paramb != null)
      {
        com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "keep ref of callback(%s)", new Object[] { Integer.valueOf(paramb.hashCode()) });
        com.tencent.mm.ipcinvoker.f.b.as(paramb);
      }
      AppMethodBeat.o(114003);
    }

    public final void a(com.tencent.mm.ipcinvoker.e.b paramb)
    {
      AppMethodBeat.i(114005);
      if (paramb == null)
        AppMethodBeat.o(114005);
      while (true)
      {
        return;
        synchronized (this.eFH)
        {
          if (this.eFH.contains(paramb))
          {
            AppMethodBeat.o(114005);
            continue;
          }
          this.eFH.add(paramb);
          AppMethodBeat.o(114005);
        }
      }
    }

    protected final void finalize()
    {
      AppMethodBeat.i(114004);
      try
      {
        com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "finalize(%s)", new Object[] { Integer.valueOf(hashCode()) });
        if (this.eFG != null)
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "finalize, release callback(%s)", new Object[] { Integer.valueOf(this.eFG.hashCode()) });
          a locala = new com/tencent/mm/ipcinvoker/BaseIPCService$a$a;
          locala.<init>(this.eFG);
          m.post(locala);
          this.eFG = null;
        }
        return;
      }
      finally
      {
        super.finalize();
        AppMethodBeat.o(114004);
      }
    }

    static final class a
      implements Runnable
    {
      private static final Bundle eFI;
      com.tencent.mm.ipcinvoker.b.b eFG;

      static
      {
        AppMethodBeat.i(114002);
        Bundle localBundle = new Bundle();
        eFI = localBundle;
        localBundle.putBoolean("__command_release_ref", true);
        AppMethodBeat.o(114002);
      }

      a(com.tencent.mm.ipcinvoker.b.b paramb)
      {
        this.eFG = paramb;
      }

      public final void run()
      {
        AppMethodBeat.i(114001);
        try
        {
          com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCInvokeCallbackProxy", "notify release ref of callback(%s).", new Object[] { Integer.valueOf(this.eFG.hashCode()) });
          this.eFG.l(eFI);
          com.tencent.mm.ipcinvoker.f.b.at(this.eFG);
          this.eFG = null;
          AppMethodBeat.o(114001);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s", new Object[] { Log.getStackTraceString(localRemoteException) });
            AppMethodBeat.o(114001);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCInvokeCallbackProxy", "notify release ref error, %s\n %s", new Object[] { localException.getMessage(), Log.getStackTraceString(localException) });
            AppMethodBeat.o(114001);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.BaseIPCService
 * JD-Core Version:    0.6.2
 */
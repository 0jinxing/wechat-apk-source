package com.tencent.mm.ipcinvoker;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b.a.a;
import com.tencent.mm.ipcinvoker.f.a;
import java.util.Map;

final class b$1
  implements ServiceConnection
{
  b$1(b paramb, b.a parama, Context paramContext, String paramString)
  {
  }

  public final void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    AppMethodBeat.i(114007);
    if (paramIBinder == null)
    {
      com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "onServiceConnected(%s), but service is null", new Object[] { Integer.valueOf(this.eFO.hashCode()) });
      this.val$context.unbindService(this.eFO.serviceConnection);
      b.a(this.eFQ).remove(this.eFP);
      this.eFO.serviceConnection = null;
      this.eFO.eFS = null;
    }
    while (true)
    {
      if (this.eFO.eFU != null)
        b.b(this.eFQ).removeCallbacks(this.eFO.eFU);
      synchronized (this.eFO)
      {
        this.eFO.eFT = false;
        this.eFO.notifyAll();
        this.eFO.eFU = null;
        AppMethodBeat.o(114007);
        return;
        com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "onServiceConnected(%s)", new Object[] { Integer.valueOf(this.eFO.hashCode()) });
        this.eFO.eFS = a.a.k(paramIBinder);
        try
        {
          ??? = new com/tencent/mm/ipcinvoker/f/a;
          ???.<init>(this.eFP);
          paramIBinder.linkToDeath(???, 0);
        }
        catch (RemoteException )
        {
          com.tencent.mm.ipcinvoker.h.b.e("IPC.IPCBridgeManager", "binder register linkToDeath listener error, %s", new Object[] { Log.getStackTraceString(???) });
        }
      }
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(114008);
    com.tencent.mm.ipcinvoker.h.b.i("IPC.IPCBridgeManager", "onServiceDisconnected(%s, tid : %s)", new Object[] { Integer.valueOf(this.eFO.hashCode()), Long.valueOf(Thread.currentThread().getId()) });
    this.eFQ.lf(this.eFP);
    com.tencent.mm.ipcinvoker.f.b.lk(this.eFP);
    b.a(this.eFQ, this.eFP);
    AppMethodBeat.o(114008);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b.1
 * JD-Core Version:    0.6.2
 */
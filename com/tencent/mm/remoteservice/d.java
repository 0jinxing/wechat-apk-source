package com.tencent.mm.remoteservice;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private Context context;
  private ServiceConnection ktl;
  List<Runnable> xtZ;
  c xua;

  public d(Context paramContext)
  {
    AppMethodBeat.i(80231);
    this.xtZ = new LinkedList();
    this.ktl = new d.1(this);
    this.context = paramContext;
    AppMethodBeat.o(80231);
  }

  final void a(b paramb, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(80235);
    if (isConnected());
    while (true)
    {
      try
      {
        this.xua.a(paramb.getClass().getName(), paramString, paramBundle, paramb);
        AppMethodBeat.o(80235);
        return;
      }
      catch (RemoteException paramb)
      {
        ab.e("MicroMsg.RemoteServiceProxy", "exception:%s", new Object[] { bo.l(paramb) });
      }
      AppMethodBeat.o(80235);
    }
  }

  public final void connect(Runnable paramRunnable)
  {
    AppMethodBeat.i(80232);
    new StringBuilder("RemoteServiceProxy construct, thread id:").append(Thread.currentThread().getId());
    if (isConnected())
    {
      paramRunnable.run();
      AppMethodBeat.o(80232);
    }
    while (true)
    {
      return;
      if (this.context == null)
      {
        AppMethodBeat.o(80232);
      }
      else
      {
        this.xtZ.add(paramRunnable);
        paramRunnable = new Intent(this.context, RemoteService.class);
        this.context.bindService(paramRunnable, this.ktl, 1);
        AppMethodBeat.o(80232);
      }
    }
  }

  public final boolean isConnected()
  {
    AppMethodBeat.i(80233);
    boolean bool;
    if ((this.xua != null) && (this.xua.asBinder().isBinderAlive()))
    {
      bool = true;
      AppMethodBeat.o(80233);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80233);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(80234);
    if ((this.xua != null) && (this.ktl != null))
    {
      this.context.unbindService(this.ktl);
      this.xua = null;
    }
    this.context = null;
    AppMethodBeat.o(80234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.d
 * JD-Core Version:    0.6.2
 */
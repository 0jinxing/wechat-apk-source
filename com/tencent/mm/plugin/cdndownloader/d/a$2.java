package com.tencent.mm.plugin.cdndownloader.d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.cdndownloader.a.a.a;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

final class a$2
  implements ServiceConnection
{
  a$2(a parama)
  {
  }

  public final void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    AppMethodBeat.i(892);
    ab.i("MicroMsg.CDNDownloadClient", "onServiceConnected");
    a.a(this.ktp, a.a.s(paramIBinder));
    a.f(this.ktp);
    a.g(this.ktp);
    try
    {
      synchronized (a.alU())
      {
        a.alU().notifyAll();
        AppMethodBeat.o(892);
        return;
      }
    }
    catch (Exception )
    {
      while (true)
        AppMethodBeat.o(892);
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(893);
    ab.i("MicroMsg.CDNDownloadClient", "onServiceDisconnected");
    if (a.c(this.ktp).size() != 0)
    {
      paramComponentName = a.c(this.ktp).iterator();
      while (paramComponentName.hasNext())
        ((CDNTaskInfo)paramComponentName.next()).ktw = true;
    }
    AppMethodBeat.o(893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.d.a.2
 * JD-Core Version:    0.6.2
 */
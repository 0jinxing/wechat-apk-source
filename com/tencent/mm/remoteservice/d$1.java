package com.tencent.mm.remoteservice;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class d$1
  implements ServiceConnection
{
  d$1(d paramd)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(80230);
    this.xub.xua = c.a.L(paramIBinder);
    paramComponentName = (Runnable[])this.xub.xtZ.toArray(new Runnable[this.xub.xtZ.size()]);
    int i = paramComponentName.length;
    for (int j = 0; j < i; j++)
      paramComponentName[j].run();
    this.xub.xtZ.clear();
    AppMethodBeat.o(80230);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.xub.xua = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.d.1
 * JD-Core Version:    0.6.2
 */
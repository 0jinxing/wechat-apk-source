package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1 extends BroadcastReceiver
{
  e$1(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(92378);
    boolean bool = this.aGC.aGz;
    this.aGC.aGz = e.isConnected(paramContext);
    if (bool != this.aGC.aGz)
    {
      if (Log.isLoggable("ConnectivityMonitor", 3))
        new StringBuilder("connectivity changed, isConnected: ").append(this.aGC.aGz);
      this.aGC.aGy.aw(this.aGC.aGz);
    }
    AppMethodBeat.o(92378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.e.1
 * JD-Core Version:    0.6.2
 */
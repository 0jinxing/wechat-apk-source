package com.google.firebase;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(24)
final class a$b extends BroadcastReceiver
{
  private static AtomicReference<b> buH;
  private final Context buz;

  static
  {
    AppMethodBeat.i(10576);
    buH = new AtomicReference();
    AppMethodBeat.o(10576);
  }

  private a$b(Context paramContext)
  {
    this.buz = paramContext;
  }

  public final void onReceive(Context arg1, Intent paramIntent)
  {
    AppMethodBeat.i(10574);
    synchronized (a.ux())
    {
      paramIntent = a.buy.values().iterator();
      if (paramIntent.hasNext())
        a.a((a)paramIntent.next());
    }
    this.buz.unregisterReceiver(this);
    AppMethodBeat.o(10574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.firebase.a.b
 * JD-Core Version:    0.6.2
 */
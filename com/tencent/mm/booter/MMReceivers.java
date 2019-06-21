package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class MMReceivers
{
  public static class SandBoxProcessReceiver extends BroadcastReceiver
  {
    private static MMReceivers.a ebV = null;

    public static void a(MMReceivers.a parama)
    {
      ebV = parama;
    }

    public void onReceive(Context paramContext, Intent paramIntent)
    {
      AppMethodBeat.i(57776);
      if (ebV != null)
        ebV.onReceive(paramContext, paramIntent);
      AppMethodBeat.o(57776);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers
 * JD-Core Version:    0.6.2
 */
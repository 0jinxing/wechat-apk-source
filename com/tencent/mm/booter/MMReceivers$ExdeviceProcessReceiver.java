package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMReceivers$ExdeviceProcessReceiver extends BroadcastReceiver
{
  private static MMReceivers.a ebV = null;

  public static void a(MMReceivers.a parama)
  {
    ebV = parama;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(57775);
    if (ebV != null)
      ebV.onReceive(paramContext, paramIntent);
    AppMethodBeat.o(57775);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.ExdeviceProcessReceiver
 * JD-Core Version:    0.6.2
 */
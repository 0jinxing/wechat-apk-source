package com.tencent.mm.modelvoice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public class RemoteController$RemoteControlReceiver extends BroadcastReceiver
{
  private static ap che;
  private static RemoteController.a fZl;

  public static void alQ()
  {
    AppMethodBeat.i(116586);
    fZl = null;
    if (che != null)
    {
      che.stopTimer();
      che = null;
    }
    AppMethodBeat.o(116586);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(116585);
    if (paramIntent == null)
      AppMethodBeat.o(116585);
    while (true)
    {
      return;
      if (!"android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction()))
      {
        ab.d("MicroMsg.RemoteControlReceiver", "unknown action, ignore" + paramIntent.getAction());
        AppMethodBeat.o(116585);
      }
      else
      {
        if ((che == null) && (fZl != null))
        {
          ab.d("MicroMsg.RemoteControlReceiver", "got remote key event down");
          che = new ap(new RemoteController.RemoteControlReceiver.1(this), true);
        }
        if (che != null)
          che.ae(1000L, 1000L);
        AppMethodBeat.o(116585);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.RemoteController.RemoteControlReceiver
 * JD-Core Version:    0.6.2
 */
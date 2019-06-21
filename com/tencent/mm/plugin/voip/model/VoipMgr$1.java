package com.tencent.mm.plugin.voip.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.c;
import com.tencent.mm.sdk.platformtools.ah;

final class VoipMgr$1 extends BroadcastReceiver
{
  VoipMgr$1(VoipMgr paramVoipMgr)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(4457);
    paramContext = paramIntent.getAction();
    paramIntent = (PowerManager)ah.getContext().getSystemService("power");
    if (("android.intent.action.USER_PRESENT".equals(paramContext)) && (paramIntent.isScreenOn()))
    {
      VoipMgr.a(this.sSn, false);
      AppMethodBeat.o(4457);
    }
    while (true)
    {
      return;
      if ("android.intent.action.SCREEN_ON".equals(paramContext))
      {
        VoipMgr.a(this.sSn, false);
        AppMethodBeat.o(4457);
      }
      else
      {
        if ("android.intent.action.SCREEN_OFF".equals(paramContext))
        {
          VoipMgr.a(this.sSn, true);
          if ((!com.tencent.mm.plugin.voip.a.b.GN(VoipMgr.a(this.sSn).mState)) && (!VoipMgr.b(this.sSn)))
            com.tencent.mm.plugin.voip.b.cIj().sSP.stopRing();
        }
        AppMethodBeat.o(4457);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.1
 * JD-Core Version:    0.6.2
 */
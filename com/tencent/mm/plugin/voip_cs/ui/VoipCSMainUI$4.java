package com.tencent.mm.plugin.voip_cs.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip_cs.b.a.a;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class VoipCSMainUI$4 extends BroadcastReceiver
{
  VoipCSMainUI$4(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(135392);
    paramContext = paramIntent.getAction();
    paramIntent = (PowerManager)ah.getContext().getSystemService("power");
    if (("android.intent.action.USER_PRESENT".equals(paramContext)) && (paramIntent.isScreenOn()))
    {
      ab.d("MicroMsg.voipcs.VoipCSMainUI", "on user present home");
      VoipCSMainUI.e(this.teJ).cAY = false;
      AppMethodBeat.o(135392);
    }
    while (true)
    {
      return;
      if ("android.intent.action.SCREEN_ON".equals(paramContext))
      {
        ab.d("MicroMsg.voipcs.VoipCSMainUI", "screen on...");
        VoipCSMainUI.e(this.teJ).cAY = false;
        if ((!VoipCSMainUI.f(this.teJ).cKq()) && (c.cMf().tdM == 2))
        {
          VoipCSMainUI.f(this.teJ).cMo();
          AppMethodBeat.o(135392);
        }
      }
      else
      {
        if ("android.intent.action.SCREEN_OFF".equals(paramContext))
        {
          ab.d("MicroMsg.voipcs.VoipCSMainUI", "screen off...");
          VoipCSMainUI.e(this.teJ).cAY = true;
          if (!VoipCSMainUI.f(this.teJ).cKq())
            VoipCSMainUI.f(this.teJ).stopRing();
        }
        AppMethodBeat.o(135392);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.4
 * JD-Core Version:    0.6.2
 */
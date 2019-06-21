package com.tencent.mm.plugin.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class HeadsetPlugReceiver extends BroadcastReceiver
{
  private HeadsetPlugReceiver.a sMY = null;

  public final void a(Context paramContext, HeadsetPlugReceiver.a parama)
  {
    AppMethodBeat.i(4303);
    this.sMY = parama;
    parama = new IntentFilter();
    parama.addAction("android.intent.action.HEADSET_PLUG");
    paramContext.registerReceiver(this, parama);
    AppMethodBeat.o(4303);
  }

  public final void fa(Context paramContext)
  {
    AppMethodBeat.i(4304);
    try
    {
      paramContext.unregisterReceiver(this);
      this.sMY = null;
      AppMethodBeat.o(4304);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        ab.e("MicroMsg.HeadsetPlugReceiver", "unregisterReceiver(HeadsetPlugReceiver.this) error:%s", new Object[] { paramContext.getMessage() });
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(4302);
    ab.d("MicroMsg.HeadsetPlugReceiver", "headset onReceive %s  %d", new Object[] { paramIntent.getAction(), Integer.valueOf(paramIntent.getIntExtra("state", 0)) });
    if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.intent.action.HEADSET_PLUG")))
      if (paramIntent.getIntExtra("state", 0) == 0)
      {
        if (this.sMY == null)
          break label118;
        this.sMY.fS(false);
        AppMethodBeat.o(4302);
      }
    while (true)
    {
      return;
      if ((paramIntent.getIntExtra("state", 0) == 1) && (this.sMY != null))
        this.sMY.fS(true);
      label118: AppMethodBeat.o(4302);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.HeadsetPlugReceiver
 * JD-Core Version:    0.6.2
 */
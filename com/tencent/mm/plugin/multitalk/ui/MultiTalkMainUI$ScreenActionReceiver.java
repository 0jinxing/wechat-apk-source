package com.tencent.mm.plugin.multitalk.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class MultiTalkMainUI$ScreenActionReceiver extends BroadcastReceiver
{
  public MultiTalkMainUI$ScreenActionReceiver(MultiTalkMainUI paramMultiTalkMainUI)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(54128);
    paramContext = paramIntent.getAction();
    if ((paramContext != null) && (paramContext.equals("android.intent.action.SCREEN_OFF")))
    {
      ab.i("MicroMsg.MT.MultiTalkMainUI", "receive action screen off");
      paramContext = this.oHS;
      paramContext.oHR.removeCallbacksAndMessages(null);
      paramContext.oHR.sendEmptyMessage(0);
    }
    AppMethodBeat.o(54128);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.ScreenActionReceiver
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.multitalk.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multitalk.model.f;
import com.tencent.mm.plugin.multitalk.model.p;
import com.tencent.mm.plugin.multitalk.ui.widget.e;

final class MultiTalkMainUI$5 extends BroadcastReceiver
{
  MultiTalkMainUI$5(MultiTalkMainUI paramMultiTalkMainUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(54122);
    if (("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction())) && (p.bSf().oGg == e.oID))
    {
      p.bSf().stopRing();
      MultiTalkMainUI.b(this.oHS);
    }
    AppMethodBeat.o(54122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.5
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.multitalk.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.plugin.multitalk.model.MultiTalkingForegroundService;
import com.tencent.mm.plugin.notification.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class MultiTalkMainUI$10 extends ak
{
  MultiTalkMainUI$10(MultiTalkMainUI paramMultiTalkMainUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(54127);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(54127);
      while (true)
      {
        return;
        if (MultiTalkMainUI.c(this.oHS))
          break;
        paramMessage = this.oHS;
        ab.i("MicroMsg.MT.MultiTalkMainUI", "bindVoiceServiceIfNeed");
        try
        {
          if (d.iW(26))
          {
            paramMessage.oHM = true;
            Intent localIntent = new android/content/Intent;
            localIntent.<init>();
            localIntent.setClass(ah.getContext(), MultiTalkingForegroundService.class);
            ah.getContext().bindService(localIntent, paramMessage, 1);
          }
          AppMethodBeat.o(54127);
        }
        catch (Exception paramMessage)
        {
          ab.printErrStackTrace("MicroMsg.MT.MultiTalkMainUI", paramMessage, "bindVoiceServiceIfNeed error: %s", new Object[] { paramMessage.getMessage() });
          AppMethodBeat.o(54127);
        }
      }
      ((a)g.M(a.class)).getNotification().cancel(43);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.10
 * JD-Core Version:    0.6.2
 */
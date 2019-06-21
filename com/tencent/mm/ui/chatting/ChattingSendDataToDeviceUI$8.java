package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChattingSendDataToDeviceUI$8
  implements Runnable
{
  ChattingSendDataToDeviceUI$8(ChattingSendDataToDeviceUI paramChattingSendDataToDeviceUI, int paramInt1, aq paramaq, String paramString, ChattingSendDataToDeviceUI.c paramc, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30770);
    int i = this.yKU + 1;
    while (true)
    {
      int j;
      if (i >= 100)
        j = i;
      try
      {
        ChattingSendDataToDeviceUI localChattingSendDataToDeviceUI = this.yKQ;
        j = i;
        ChattingSendDataToDeviceUI.8.1 local1 = new com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$8$1;
        j = i;
        local1.<init>(this);
        j = i;
        localChattingSendDataToDeviceUI.runOnUiThread(local1);
        AppMethodBeat.o(30770);
        return;
        j = i;
        this.yKS.yMM.Os(i);
        i++;
        j = i;
        Thread.sleep(this.yKV);
      }
      catch (Exception localException)
      {
        ab.d("MicroMsg.ChattingSendDataToDeviceUI", "setProgress on progress view exception %s", new Object[] { localException });
        i = j;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.8
 * JD-Core Version:    0.6.2
 */
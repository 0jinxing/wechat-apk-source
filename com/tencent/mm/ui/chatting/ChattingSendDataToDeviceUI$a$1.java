package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChattingSendDataToDeviceUI$a$1
  implements Runnable
{
  ChattingSendDataToDeviceUI$a$1(ChattingSendDataToDeviceUI.a parama, int paramInt1, ChattingSendDataToDeviceUI.c paramc, aq paramaq, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30776);
    int i = this.yKU + 1;
    int j;
    if (this.yKZ.yKQ.yKG)
      if (i >= 100)
        j = i;
    while (true)
    {
      try
      {
        if (this.yKT.cxW.equals("send_data_sucess"))
        {
          j = i;
          localChattingSendDataToDeviceUI = this.yKZ.yKQ;
          j = i;
          localObject = new com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$a$1$1;
          j = i;
          ((ChattingSendDataToDeviceUI.a.1.1)localObject).<init>(this);
          j = i;
          localChattingSendDataToDeviceUI.runOnUiThread((Runnable)localObject);
          AppMethodBeat.o(30776);
          return;
        }
        j = i;
        if (!this.yKT.cxW.equals("send_data_failed"))
          break;
        j = i;
        ChattingSendDataToDeviceUI localChattingSendDataToDeviceUI = this.yKZ.yKQ;
        j = i;
        Object localObject = new com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$a$1$2;
        j = i;
        ((ChattingSendDataToDeviceUI.a.1.2)localObject).<init>(this);
        j = i;
        localChattingSendDataToDeviceUI.runOnUiThread((Runnable)localObject);
        AppMethodBeat.o(30776);
        continue;
        j = i;
        this.yKS.yMM.Os(i);
        j = i;
        this.yKT.progress = i;
        i++;
        j = i;
        Thread.sleep(this.yKV);
      }
      catch (Exception localException)
      {
        ab.d("MicroMsg.ChattingSendDataToDeviceUI", "setSendingProgress exception %s", new Object[] { localException });
        i = j;
      }
      break;
      AppMethodBeat.o(30776);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.a.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChattingSendDataToDeviceUI$7
  implements Runnable
{
  ChattingSendDataToDeviceUI$7(ChattingSendDataToDeviceUI paramChattingSendDataToDeviceUI, aq paramaq, ChattingSendDataToDeviceUI.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30768);
    this.yKS.yMM.setVisibility(0);
    this.yKS.yKX.setTextColor(this.yKQ.getResources().getColor(2131690433));
    this.yKS.yKX.setText(this.yKQ.getText(2131298244));
    this.yKT.cxW = "send_data_sending";
    AppMethodBeat.o(30768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.7
 * JD-Core Version:    0.6.2
 */
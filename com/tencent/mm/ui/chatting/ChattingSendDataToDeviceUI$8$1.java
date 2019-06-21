package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class ChattingSendDataToDeviceUI$8$1
  implements Runnable
{
  ChattingSendDataToDeviceUI$8$1(ChattingSendDataToDeviceUI.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30769);
    this.yKW.yKS.yMM.Os(0);
    ChattingSendDataToDeviceUI.b(this.yKW.yKQ).remove(this.yKW.uuv);
    this.yKW.yKS.yMM.setVisibility(4);
    this.yKW.yKS.yKX.setText(this.yKW.yKQ.getText(2131298242));
    this.yKW.yKS.yKX.setTextColor(this.yKW.yKQ.getResources().getColor(2131690433));
    this.yKW.yKT.cxW = "send_data_sucess";
    this.yKW.yKT.progress = 0;
    ChattingSendDataToDeviceUI.a(this.yKW.yKQ, 4);
    AppMethodBeat.o(30769);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.8.1
 * JD-Core Version:    0.6.2
 */
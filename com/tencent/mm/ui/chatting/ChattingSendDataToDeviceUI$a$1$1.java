package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class ChattingSendDataToDeviceUI$a$1$1
  implements Runnable
{
  ChattingSendDataToDeviceUI$a$1$1(ChattingSendDataToDeviceUI.a.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30774);
    this.yLa.yKS.yMM.Os(0);
    this.yLa.yKS.yMM.setVisibility(4);
    this.yLa.yKS.yKX.setText(this.yLa.yKZ.yKQ.getText(2131298242));
    this.yLa.yKS.yKX.setTextColor(this.yLa.yKZ.yKQ.getResources().getColor(2131690433));
    this.yLa.yKT.cxW = "send_data_sucess";
    this.yLa.yKT.progress = 0;
    ChattingSendDataToDeviceUI.d(this.yLa.yKZ.yKQ).put(this.yLa.yKT.deviceID, this.yLa.yKT);
    ab.i("MicroMsg.ChattingSendDataToDeviceUI", " deviceId %s SEND_DATA_SUCCESS!", new Object[] { this.yLa.yKT.deviceID });
    AppMethodBeat.o(30774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.a.1.1
 * JD-Core Version:    0.6.2
 */
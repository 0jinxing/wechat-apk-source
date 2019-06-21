package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dd;
import com.tencent.mm.g.a.ej;
import com.tencent.mm.g.a.ej.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class ChattingSendDataToDeviceUI$1
  implements AdapterView.OnItemClickListener
{
  ChattingSendDataToDeviceUI$1(ChattingSendDataToDeviceUI paramChattingSendDataToDeviceUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30760);
    this.yKQ.yKF = true;
    ChattingSendDataToDeviceUI.c localc = ChattingSendDataToDeviceUI.a(this.yKQ).Op(paramInt);
    String str1 = localc.cws;
    paramAdapterView = localc.deviceID;
    String str2 = localc.cxR;
    try
    {
      if (ChattingSendDataToDeviceUI.b(this.yKQ).get(paramAdapterView) != null)
      {
        ab.e("MicroMsg.ChattingSendDataToDeviceUI", "ap: some file is sending");
        paramView = new com/tencent/mm/g/a/dd;
        paramView.<init>();
        paramView.cwo.ceI = paramAdapterView;
        a.xxA.m(paramView);
        ChattingSendDataToDeviceUI.a(this.yKQ, "send_data_cancel", paramAdapterView, 0);
        localc.cxW = "send_data_cancel";
        ChattingSendDataToDeviceUI.b(this.yKQ).remove(paramAdapterView);
        paramAdapterView = (aq)((View)ChattingSendDataToDeviceUI.c(this.yKQ).get(Integer.valueOf(paramInt))).getTag();
        paramAdapterView.yKX.setText(this.yKQ.getText(2131298235));
        paramAdapterView.yKX.setTextColor(this.yKQ.getResources().getColor(2131690431));
        paramAdapterView.yMM.setVisibility(8);
        paramAdapterView.yMM.Os(0);
        AppMethodBeat.o(30760);
        return;
      }
      localc.cxW = "send_data_sending";
      ChattingSendDataToDeviceUI.d(this.yKQ).put(localc.deviceID, localc);
      ChattingSendDataToDeviceUI.b(this.yKQ).put(paramAdapterView, paramView);
      ChattingSendDataToDeviceUI.a(this.yKQ, "send_data_sending", paramAdapterView, 1);
      ChattingSendDataToDeviceUI.a(this.yKQ, 3);
      paramView = new com/tencent/mm/g/a/ej;
      paramView.<init>();
      paramView.cxP.ceI = paramAdapterView;
      paramView.cxP.cws = str1;
      paramView.cxP.data = ChattingSendDataToDeviceUI.e(this.yKQ);
      paramView.cxP.cxR = str2;
      if (this.yKQ.cxS)
      {
        paramView.cxP.cwT = ChattingSendDataToDeviceUI.f(this.yKQ);
        paramView.cxP.cxS = this.yKQ.cxS;
      }
      while (true)
      {
        a.xxA.m(paramView);
        if (!paramView.cxQ.cxT)
        {
          ChattingSendDataToDeviceUI.arc("send_data_failed");
          ab.e("MicroMsg.ChattingSendDataToDeviceUI", " e.result.isSuccess is false, send fail!");
        }
        AppMethodBeat.o(30760);
        break;
        paramView.cxP.cvx = ChattingSendDataToDeviceUI.g(this.yKQ);
      }
    }
    catch (Exception paramAdapterView)
    {
      while (true)
      {
        ChattingSendDataToDeviceUI.arc("send_data_failed");
        ab.e("MicroMsg.ChattingSendDataToDeviceUI", "send to device item click exception %s", new Object[] { paramAdapterView });
        AppMethodBeat.o(30760);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.1
 * JD-Core Version:    0.6.2
 */
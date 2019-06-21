package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class ChattingSendDataToDeviceUI$9
  implements Runnable
{
  TextView yKX;

  ChattingSendDataToDeviceUI$9(ChattingSendDataToDeviceUI paramChattingSendDataToDeviceUI, String paramString1, String paramString2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30771);
    try
    {
      ChattingSendDataToDeviceUI.c localc = (ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(this.yKQ).get(this.uuv);
      localc.cxW = this.kOj;
      if (this.gOm > localc.progress)
        localc.progress = this.gOm;
      int i = ((Integer)ChattingSendDataToDeviceUI.k(this.yKQ).get(this.uuv)).intValue();
      localView = (View)ChattingSendDataToDeviceUI.c(this.yKQ).get(Integer.valueOf(i));
      aq localaq = (aq)localView.getTag();
      if (localaq == null)
      {
        ab.w("MicroMsg.ChattingSendDataToDeviceUI", "get view holder is null");
        AppMethodBeat.o(30771);
        return;
      }
      this.yKX = localaq.yKX;
      this.yKX.setVisibility(0);
      if (this.kOj.equals("send_data_failed"))
      {
        ChattingSendDataToDeviceUI.a(this.yKQ, 5);
        this.yKX.setText(this.yKQ.getString(2131298239));
        ChattingSendDataToDeviceUI.b(this.yKQ).remove(this.uuv);
        this.yKX.setTextColor(this.yKQ.getResources().getColor(2131690436));
        ChattingSendDataToDeviceUI.a(false, 0, localView);
      }
      while (true)
      {
        ChattingSendDataToDeviceUI.d(this.yKQ).put(localc.deviceID, localc);
        AppMethodBeat.o(30771);
        break;
        if (!this.kOj.equals("send_data_sending"))
          break label327;
        this.yKX.setText(this.yKQ.getString(2131298244));
        this.yKX.setTextColor(this.yKQ.getResources().getColor(2131690433));
        ChattingSendDataToDeviceUI.a(true, this.gOm, localView);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        View localView;
        ab.e("MicroMsg.ChattingSendDataToDeviceUI", "ap: send Data: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(30771);
        continue;
        label327: if (this.kOj.equals("send_data_cancel"))
        {
          ChattingSendDataToDeviceUI.a(this.yKQ, 6);
          this.yKX.setText(this.yKQ.getString(2131298235));
          this.yKX.setTextColor(this.yKQ.getResources().getColor(2131690431));
          ChattingSendDataToDeviceUI.a(true, 0, localView);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.9
 * JD-Core Version:    0.6.2
 */
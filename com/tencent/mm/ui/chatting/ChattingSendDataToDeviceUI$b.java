package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.eg;
import com.tencent.mm.g.a.eg.a;
import com.tencent.mm.g.a.ek;
import com.tencent.mm.g.a.ek.a;
import com.tencent.mm.sdk.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ChattingSendDataToDeviceUI$b
{
  public ChattingSendDataToDeviceUI$b(ChattingSendDataToDeviceUI paramChattingSendDataToDeviceUI)
  {
  }

  private boolean o(b paramb)
  {
    AppMethodBeat.i(30785);
    ek localek = (ek)paramb;
    String str = localek.cxU.cxW;
    paramb = localek.cxU.ceI;
    if (str.equals("send_data_sending"))
      ChattingSendDataToDeviceUI.a(this.yKQ, "send_data_sending", paramb, localek.cxU.progress);
    while (true)
    {
      AppMethodBeat.o(30785);
      return true;
      if (str.equals("send_data_failed"))
        ChattingSendDataToDeviceUI.a(this.yKQ, "send_data_failed", paramb, 0);
      else if (str.equals("send_data_sucess"))
        this.yKQ.arb(paramb);
    }
  }

  private boolean p(b paramb)
  {
    AppMethodBeat.i(30786);
    List localList = ((eg)paramb).cxJ.cwW;
    paramb = new ArrayList();
    for (int i = 0; i < localList.size(); i++)
    {
      ChattingSendDataToDeviceUI.c localc = new ChattingSendDataToDeviceUI.c(this.yKQ);
      localc.cws = ((String)((Map)localList.get(i)).get("deviceType"));
      localc.deviceID = ((String)((Map)localList.get(i)).get("deviceID"));
      localc.eoz = ((String)((Map)localList.get(i)).get("displayName"));
      localc.iconUrl = ((String)((Map)localList.get(i)).get("iconUrl"));
      localc.cxR = ((String)((Map)localList.get(i)).get("ability"));
      localc.yLc = ((String)((Map)localList.get(i)).get("abilityInf"));
      if (((this.yKQ.cxS) && (ChattingSendDataToDeviceUI.b(localc, ChattingSendDataToDeviceUI.f(this.yKQ)))) || ((!this.yKQ.cxS) && (ChattingSendDataToDeviceUI.b(localc, ChattingSendDataToDeviceUI.g(this.yKQ)))))
      {
        if ((ChattingSendDataToDeviceUI.d(this.yKQ).containsKey(localc.deviceID)) && (((ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(this.yKQ).get(localc.deviceID)).cxW != null))
        {
          localc.cxW = ((ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(this.yKQ).get(localc.deviceID)).cxW;
          localc.progress = ((ChattingSendDataToDeviceUI.c)ChattingSendDataToDeviceUI.d(this.yKQ).get(localc.deviceID)).progress;
        }
        paramb.add(localc);
      }
    }
    if (ChattingSendDataToDeviceUI.l(this.yKQ).size() != paramb.size())
    {
      ChattingSendDataToDeviceUI.a(this.yKQ, paramb);
      this.yKQ.runOnUiThread(new ChattingSendDataToDeviceUI.b.1(this));
    }
    AppMethodBeat.o(30786);
    return true;
  }

  public final boolean n(b paramb)
  {
    AppMethodBeat.i(30784);
    boolean bool;
    if ((paramb instanceof eg))
    {
      bool = p(paramb);
      AppMethodBeat.o(30784);
    }
    while (true)
    {
      return bool;
      if ((paramb instanceof ek))
      {
        bool = o(paramb);
        AppMethodBeat.o(30784);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(30784);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.b
 * JD-Core Version:    0.6.2
 */
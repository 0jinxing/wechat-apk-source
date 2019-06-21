package com.tencent.mm.plugin.freewifi.ui;

import android.net.wifi.ScanResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.h.a;
import com.tencent.mm.protocal.protobuf.buc;
import com.tencent.mm.protocal.protobuf.dh;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class FreeWifiNetCheckUI$6
  implements h.a
{
  FreeWifiNetCheckUI$6(FreeWifiNetCheckUI paramFreeWifiNetCheckUI, String paramString)
  {
  }

  public final void bU(List<ScanResult> paramList)
  {
    AppMethodBeat.i(21040);
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.mzM.finish();
      FreeWifiNetCheckUI.c(this.mzM);
      AppMethodBeat.o(21040);
    }
    while (true)
    {
      return;
      buc localbuc = new buc();
      localbuc.wVV = new LinkedList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (ScanResult)localIterator.next();
        if (paramList != null)
        {
          dh localdh = new dh();
          localdh.mac = paramList.BSSID;
          localdh.vFl = paramList.level;
          localdh.ssid = paramList.SSID;
          localbuc.wVV.add(localdh);
        }
      }
      paramList = com.tencent.mm.plugin.freewifi.k.byo();
      paramList.kBq = m.V(FreeWifiNetCheckUI.b(this.mzM));
      paramList.muf = k.b.mux.muQ;
      paramList.mug = k.b.mux.name;
      paramList.cIb = 9;
      paramList.byq().byp();
      new com.tencent.mm.plugin.freewifi.d.k(this.mwt, localbuc, 9, m.V(this.mzM.getIntent())).c(new FreeWifiNetCheckUI.6.1(this));
      AppMethodBeat.o(21040);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI.6
 * JD-Core Version:    0.6.2
 */
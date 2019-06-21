package com.tencent.mm.plugin.freewifi.model;

import android.net.wifi.ScanResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.protocal.protobuf.buc;
import com.tencent.mm.protocal.protobuf.dh;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class j$9$1
  implements h.a
{
  j$9$1(j.9 param9, String paramString)
  {
  }

  public final void bU(List<ScanResult> paramList)
  {
    AppMethodBeat.i(20747);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(20747);
    while (true)
    {
      return;
      buc localbuc = new buc();
      localbuc.wVV = new LinkedList();
      Object localObject = paramList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramList = (ScanResult)((Iterator)localObject).next();
        if (paramList != null)
        {
          dh localdh = new dh();
          localdh.mac = paramList.BSSID;
          localdh.vFl = paramList.level;
          localdh.ssid = paramList.SSID;
          localbuc.wVV.add(localdh);
        }
      }
      localObject = m.bys();
      paramList = com.tencent.mm.plugin.freewifi.k.byo();
      paramList.kBq = ((String)localObject);
      paramList.muf = k.b.mux.muQ;
      paramList.mug = k.b.mux.name;
      paramList.cIb = 8;
      paramList.byq().byp();
      new com.tencent.mm.plugin.freewifi.d.k(this.mwt, localbuc, 8, (String)localObject).c(null);
      AppMethodBeat.o(20747);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.j.9.1
 * JD-Core Version:    0.6.2
 */
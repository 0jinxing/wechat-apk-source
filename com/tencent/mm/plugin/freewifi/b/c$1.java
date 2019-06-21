package com.tencent.mm.plugin.freewifi.b;

import android.database.MatrixCursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.plugin.freewifi.d.j;
import com.tencent.mm.protocal.protobuf.baj;
import com.tencent.mm.protocal.protobuf.bak;
import com.tencent.mm.protocal.protobuf.bal;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

final class c$1
  implements f
{
  c$1(c paramc, LinkedList paramLinkedList, int paramInt, fh paramfh)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20673);
    while (true)
    {
      Object localObject1;
      int i;
      synchronized (this.mvr)
      {
        paramm = ((j)paramm).bzp();
        this.mvr.iM(System.currentTimeMillis());
        localObject1 = this.mvr;
        if (paramm.mvm <= 0)
        {
          i = 180;
          ((c)localObject1).vQ(i);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("resp.reqMaxApCount=");
          ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", paramm.mvl);
          if (paramm.mvl > 0)
            break label252;
          i = 200;
          label104: ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "_reqMaxApCount = ".concat(String.valueOf(i)));
          this.mvr.vP(i);
          if ((paramInt1 != 0) || (paramInt2 != 0))
            break label1048;
          paramString = paramm.wEg;
          localObject1 = null;
        }
      }
      try
      {
        paramm = new android/database/MatrixCursor;
        paramm.<init>(c.aqJ());
        Object localObject3;
        try
        {
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
          paramInt1 = 0;
          while (true)
            if (paramInt1 < paramString.size())
            {
              localObject2 = (bal)paramString.get(paramInt1);
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((Map)localObject1).put(((bal)localObject2).ssid + "-" + ((bal)localObject2).bssid, Integer.valueOf(paramInt1));
              paramInt1++;
              continue;
              i = paramm.mvm;
              break;
              label252: i = paramm.mvl;
              break label104;
            }
          paramInt1 = 0;
          if (paramInt1 >= this.mvo.size())
            break label1027;
          Object localObject2 = (bak)this.mvo.get(paramInt1);
          localObject3 = new com/tencent/mm/protocal/protobuf/bal;
          ((bal)localObject3).<init>();
          ((bal)localObject3).ssid = ((bak)localObject2).ssid;
          ((bal)localObject3).bssid = ((bak)localObject2).bssid;
          ((bal)localObject3).cyC = ((bak)localObject2).cyC;
          ((bal)localObject3).wEh = 0;
          ((bal)localObject3).wEi = null;
          ((bal)localObject3).mue = 0;
          ((bal)localObject3).cuH = null;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          if (((Map)localObject1).get(((bal)localObject3).ssid + "-" + ((bal)localObject3).bssid) != null)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = (Integer)((Map)localObject1).get(((bal)localObject3).ssid + "-" + ((bal)localObject3).bssid);
            if (paramString.get(((Integer)localObject2).intValue()) != null)
            {
              ((bal)localObject3).wEh = ((bal)paramString.get(((Integer)localObject2).intValue())).wEh;
              ((bal)localObject3).wEi = ((bal)paramString.get(((Integer)localObject2).intValue())).wEi;
              ((bal)localObject3).mue = ((bal)paramString.get(((Integer)localObject2).intValue())).mue;
              ((bal)localObject3).cuH = ((bal)paramString.get(((Integer)localObject2).intValue())).cuH;
            }
          }
          if ((((bal)localObject3).mue != 4) && (((bal)localObject3).mue != 31))
          {
            paramm.addRow(new Object[] { ((bal)localObject3).ssid, ((bal)localObject3).bssid, Integer.valueOf(((bal)localObject3).cyC), Integer.valueOf(0), null, Integer.valueOf(this.mvr.byB()), Integer.valueOf(this.mvr.byC()) });
            ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cursor add row. ssid=%s, bssid=%s, rssi=%d, isWechatwifi=%d, wechatShopName=%s, maxApCount=%d, reqIntervalSeconds=%d", new Object[] { ((bal)localObject3).ssid, ((bal)localObject3).bssid, Integer.valueOf(((bal)localObject3).cyC), Integer.valueOf(0), null, Integer.valueOf(this.mvr.byB()), Integer.valueOf(this.mvr.byC()) });
          }
          while (true)
          {
            paramInt1++;
            break;
            paramm.addRow(new Object[] { ((bal)localObject3).ssid, ((bal)localObject3).bssid, Integer.valueOf(((bal)localObject3).cyC), Integer.valueOf(((bal)localObject3).wEh), ((bal)localObject3).wEi, Integer.valueOf(this.mvr.byB()), Integer.valueOf(this.mvr.byC()) });
            ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cursor add row. ssid=%s, bssid=%s, rssi=%d, isWechatwifi=%d, wechatShopName=%s, maxApCount=%d, reqIntervalSeconds=%d", new Object[] { ((bal)localObject3).ssid, ((bal)localObject3).bssid, Integer.valueOf(((bal)localObject3).cyC), Integer.valueOf(((bal)localObject3).wEh), ((bal)localObject3).wEi, Integer.valueOf(this.mvr.byB()), Integer.valueOf(this.mvr.byC()) });
            if ((((bal)localObject3).wEh == 1) && (this.mvp == 1))
            {
              a.a.byy().e(((bal)localObject3).ssid, ((bal)localObject3).bssid, ((bal)localObject3).cuH, ((bal)localObject3).mue);
              ab.i("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "cached : ssid=%s, bssid=%s, apKey=%s, protocolType=%d. ", new Object[] { ((bal)localObject3).ssid, ((bal)localObject3).bssid, ((bal)localObject3).cuH, Integer.valueOf(((bal)localObject3).mue) });
            }
          }
        }
        catch (Exception paramString)
        {
        }
        if (paramm != null)
          paramm.close();
        ab.e("MicroMsg.FreeWifi.FreeWifiManufacturerGetWifiListHelper", "exception in getWifiList syncTaskCur.", new Object[] { paramString });
        c.a(this.mvr, this.mvq, 1108, "cursor exception.");
        AppMethodBeat.o(20673);
        while (true)
        {
          return;
          label1027: c.a(this.mvq, paramm);
          AppMethodBeat.o(20673);
          continue;
          label1048: if (paramInt2 == -30035)
          {
            localObject1 = this.mvr;
            paramm = this.mvq;
            paramString = new java/lang/StringBuilder;
            paramString.<init>("Too many ap. The number of ap requested per time should be between 1 and ");
            c.a((c)localObject1, paramm, 1110, this.mvr.byB() + ".");
            AppMethodBeat.o(20673);
          }
          else
          {
            paramm = this.mvr;
            localObject3 = this.mvq;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Server returns errtype= ");
            c.a(paramm, (fh)localObject3, 1121, paramInt1 + ", errcode=" + paramInt2 + ", errMsg=" + com.tencent.mm.plugin.freewifi.m.Mw(paramString) + ".");
            AppMethodBeat.o(20673);
          }
        }
        paramString = finally;
        AppMethodBeat.o(20673);
        throw paramString;
      }
      catch (Exception paramString)
      {
        while (true)
          paramm = (com.tencent.mm.ai.m)localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.c.1
 * JD-Core Version:    0.6.2
 */
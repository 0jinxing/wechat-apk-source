package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.dt;
import com.tencent.mm.g.a.dt.a;
import com.tencent.mm.plugin.webview.model.l;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.protocal.protobuf.atz;
import com.tencent.mm.protocal.protobuf.aua;
import com.tencent.mm.protocal.protobuf.auc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class g$50 extends com.tencent.mm.sdk.b.c<dt>
{
  g$50(g paramg)
  {
    AppMethodBeat.i(9107);
    this.xxI = dt.class.getName().hashCode();
    AppMethodBeat.o(9107);
  }

  private boolean a(dt paramdt)
  {
    AppMethodBeat.i(9108);
    String str1;
    int i;
    int j;
    double d1;
    double d2;
    String str2;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    Object localObject1;
    if ((paramdt != null) && ((paramdt instanceof dt)))
    {
      System.currentTimeMillis();
      g.o(this.uHd);
      g.a(this.uHd, System.currentTimeMillis());
      str1 = paramdt.cxk.cxi;
      i = paramdt.cxk.cxl;
      j = paramdt.cxk.cxm & 0xFFFF;
      d1 = paramdt.cxk.cxo;
      d2 = paramdt.cxk.cxn;
      ab.i("MicroMsg.MsgHandler", "[MsgHandler][IBeaconRangeResult],iBeacon = %s", new Object[] { str1 + "," + i + "," + j + "," + d1 });
      str2 = str1 + "," + i + "," + j;
      boolean bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      if (g.p(this.uHd).containsKey(str2))
        break label860;
      paramdt = new atz();
      paramdt.eCq = str1;
      paramdt.major = i;
      paramdt.minor = j;
      g.p(this.uHd).put(str2, paramdt);
      bool3 = bool1;
      if (g.q(this.uHd).containsKey(str1 + "," + i))
      {
        localObject1 = (List)g.q(this.uHd).get(str1 + "," + i);
        bool3 = bool1;
        if (localObject1 != null)
          localObject1 = ((List)localObject1).iterator();
      }
    }
    while (true)
    {
      bool3 = bool4;
      Object localObject2;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (aua)((Iterator)localObject1).next();
        if ((localObject2 == null) || (((aua)localObject2).wxZ == null) || (((aua)localObject2).wxZ.isEmpty()))
          break label1080;
        localObject2 = ((aua)localObject2).wxZ.iterator();
        auc localauc;
        do
        {
          if (!((Iterator)localObject2).hasNext())
            break;
          localauc = (auc)((Iterator)localObject2).next();
        }
        while ((j < localauc.wya) || (j > localauc.wyb));
      }
      label1080: for (bool3 = true; bool3; bool3 = bool4)
      {
        bool4 = bool3;
        if (!bool3)
        {
          g.r(this.uHd).add(paramdt);
          localObject1 = null;
          paramdt = (dt)localObject1;
          if (g.j(this.uHd) != null)
          {
            paramdt = (dt)localObject1;
            if (g.j(this.uHd).puc != null)
            {
              paramdt = g.j(this.uHd).puc.get("url");
              if (paramdt == null)
                break label853;
              paramdt = paramdt.toString();
            }
          }
        }
        while (true)
        {
          paramdt = bo.nullAsNil(g.s(this.uHd).agj(paramdt));
          bool4 = bool3;
          if (!g.t(this.uHd))
          {
            g.a(this.uHd, true);
            paramdt = new l(g.r(this.uHd), bo.nullAsNil(paramdt));
            g.r(this.uHd).clear();
            com.tencent.mm.kernel.g.Rg().a(1704, new g.50.1(this, paramdt));
            com.tencent.mm.kernel.g.Rg().a(paramdt, 0);
            bool4 = bool3;
          }
          label639: ab.d("MicroMsg.MsgHandler", "[MsgHandler][ibeacon check and find] find:%s", new Object[] { String.valueOf(bool4) + "," + str2 });
          try
          {
            paramdt = (e)g.u(this.uHd).get();
            if (paramdt != null)
              if (bool4)
              {
                ab.i("FindBeaconBug", "find Msghandler");
                localObject1 = new android/os/Bundle;
                ((Bundle)localObject1).<init>();
                ((Bundle)localObject1).putString("uuid", str1);
                ((Bundle)localObject1).putInt("major", i);
                ((Bundle)localObject1).putInt("minor", j);
                ((Bundle)localObject1).putDouble("accuracy", d2);
                ((Bundle)localObject1).putDouble("rssi", d1);
                ((Bundle)localObject1).putFloat("heading", g.v(this.uHd));
                paramdt.c(40002, (Bundle)localObject1);
              }
            while (true)
            {
              ab.i("MicroMsg.MsgHandler", "[MsgHandler]result iBeacon = %s,beaconMap.size:%d", new Object[] { g.p(this.uHd).get(str2), Integer.valueOf(g.p(this.uHd).size()) });
              AppMethodBeat.o(9108);
              return false;
              label853: paramdt = "";
              break;
              label860: paramdt = (List)g.q(this.uHd).get(str1 + "," + i);
              bool4 = bool2;
              if (paramdt == null)
                break label639;
              paramdt = paramdt.iterator();
              do
              {
                bool4 = bool3;
                if (!paramdt.hasNext())
                  break;
                localObject1 = (aua)paramdt.next();
                bool4 = bool3;
                if (localObject1 != null)
                {
                  bool4 = bool3;
                  if (((aua)localObject1).wxZ != null)
                  {
                    bool4 = bool3;
                    if (!((aua)localObject1).wxZ.isEmpty())
                    {
                      localObject2 = ((aua)localObject1).wxZ.iterator();
                      do
                      {
                        bool4 = bool3;
                        if (!((Iterator)localObject2).hasNext())
                          break;
                        localObject1 = (auc)((Iterator)localObject2).next();
                      }
                      while ((j < ((auc)localObject1).wya) || (j > ((auc)localObject1).wyb));
                      bool4 = true;
                    }
                  }
                }
                bool3 = bool4;
              }
              while (!bool4);
              break label639;
              ab.i("FindBeaconBug", "callbacker is null");
            }
          }
          catch (RemoteException paramdt)
          {
            while (true)
              ab.i("MicroMsg.MsgHandler", "[MsgHandler]callback failure:%s", new Object[] { paramdt.getMessage() });
          }
        }
      }
      bool4 = bool3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.50
 * JD-Core Version:    0.6.2
 */
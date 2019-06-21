package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.protobuf.cwz;
import com.tencent.mm.protocal.protobuf.ix;
import com.tencent.mm.protocal.protobuf.iy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j extends a<iy>
{
  j(List<String> paramList, a parama)
  {
    AppMethodBeat.i(129850);
    ab.i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, list_size %d, scene %s(%d)", new Object[] { Integer.valueOf(paramList.size()), parama.name(), Integer.valueOf(parama.intValue) });
    ix localix = new ix();
    localix.Scene = parama.intValue;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!bo.isNullOrNil(str))
      {
        parama = new cwz();
        parama.xfb = str;
        parama.vMS = f.auO().zf(str);
        localix.vKs.add(parama);
      }
    }
    paramList = new b.a();
    paramList.fsJ = localix;
    paramList.fsK = new iy();
    paramList.fsI = 1192;
    paramList.uri = "/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync";
    this.ehh = paramList.acD();
    AppMethodBeat.o(129850);
  }

  public static enum a
  {
    final int intValue;

    static
    {
      AppMethodBeat.i(129849);
      hhk = new a("DEFAULT", 0, 100);
      hhl = new a("RECENTS_LIST", 1, 101);
      hhm = new a("TASK_BAR", 2, 102);
      hhn = new a("STAR_LIST", 3, 103);
      hho = new a("MP_PRELOAD", 4, 104);
      hhp = new a("BIZ_BIND_WXA", 5, 105);
      hhq = new a("WXA_CUSTOMER_SERVICE", 6, 106);
      hhr = new a("WXA_PLUGIN_JSAPI", 7, 107);
      hhs = new a("WXA_RECOMMEND_LIST", 8, 108);
      hht = new a("WXA_RECOMMEND_CARD_LIST", 9, 109);
      hhu = new a[] { hhk, hhl, hhm, hhn, hho, hhp, hhq, hhr, hhs, hht };
      AppMethodBeat.o(129849);
    }

    private a(int paramInt)
    {
      this.intValue = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.j
 * JD-Core Version:    0.6.2
 */
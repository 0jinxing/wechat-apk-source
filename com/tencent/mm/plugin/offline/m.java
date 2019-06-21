package com.tencent.mm.plugin.offline;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vg;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.a.s.a;
import com.tencent.mm.plugin.offline.a.s.c;
import com.tencent.mm.plugin.offline.a.s.e;
import com.tencent.mm.plugin.offline.a.s.f;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

public final class m
  implements s.a
{
  c nZv;

  public m()
  {
    AppMethodBeat.i(43378);
    this.nZv = new m.1(this);
    a.xxA.c(this.nZv);
    k.bXg();
    k.bXh().a(this);
    AppMethodBeat.o(43378);
  }

  private static void aU(int paramInt, String paramString)
  {
    AppMethodBeat.i(43379);
    vg localvg = new vg();
    localvg.cSe.cSg = paramInt;
    localvg.cSe.action = 4;
    localvg.cSe.content = paramString;
    a.xxA.m(localvg);
    AppMethodBeat.o(43379);
  }

  public final boolean a(s.c paramc)
  {
    AppMethodBeat.i(43380);
    if (paramc.oYS == 6)
    {
      paramc = (s.f)paramc;
      if ((paramc.oZa.tAq != null) && (paramc.oZa.tAq.size() > 0))
      {
        paramc = (Orders.Commodity)paramc.oZa.tAq.get(0);
        aU(0, ah.getContext().getString(2131305419, new Object[] { e.e(paramc.kCJ, paramc.pcl) }));
      }
    }
    while (true)
    {
      AppMethodBeat.o(43380);
      return false;
      aU(9, ah.getContext().getString(2131305417));
      continue;
      if (paramc.oYS == 8)
        aU(6, ah.getContext().getString(2131305417));
      else if (paramc.oYS == 5)
        aU(7, bo.bc(((s.e)paramc).oYW, ""));
      else if (paramc.oYS == 4)
        aU(8, ah.getContext().getString(2131305418));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.m
 * JD-Core Version:    0.6.2
 */
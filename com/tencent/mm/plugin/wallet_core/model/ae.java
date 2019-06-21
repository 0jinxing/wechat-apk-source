package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class ae
{
  static ArrayList<l> lUV = null;
  private static ae tCu = null;
  bz.a kBx;

  private ae()
  {
    AppMethodBeat.i(46920);
    this.kBx = new bz.a()
    {
      public final void a(com.tencent.mm.ai.e.a paramAnonymousa)
      {
        AppMethodBeat.i(46917);
        paramAnonymousa = aa.a(paramAnonymousa.eAB.vED);
        ab.d("MicroMsg.WalletPushNotifyManager", "PayMsg:".concat(String.valueOf(paramAnonymousa)));
        paramAnonymousa = br.z(paramAnonymousa, "sysmsg");
        int i = bo.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.PayMsgType"), -1);
        if (!ae.a(ae.this, i, paramAnonymousa))
          ae.e(i, paramAnonymousa);
        AppMethodBeat.o(46917);
      }
    };
    AppMethodBeat.o(46920);
  }

  public static boolean a(l paraml)
  {
    AppMethodBeat.i(46922);
    if (lUV == null)
      lUV = new ArrayList();
    lUV.add(paraml);
    AppMethodBeat.o(46922);
    return true;
  }

  public static boolean b(l paraml)
  {
    AppMethodBeat.i(46923);
    boolean bool;
    if (lUV == null)
    {
      ab.e("MicroMsg.WalletPushNotifyManager", "hy: callback pool is null. release failed");
      bool = false;
      AppMethodBeat.o(46923);
    }
    while (true)
    {
      return bool;
      lUV.remove(paraml);
      bool = true;
      AppMethodBeat.o(46923);
    }
  }

  public static ae cPT()
  {
    AppMethodBeat.i(46921);
    if (tCu == null)
      tCu = new ae();
    ae localae = tCu;
    AppMethodBeat.o(46921);
    return localae;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ae
 * JD-Core Version:    0.6.2
 */
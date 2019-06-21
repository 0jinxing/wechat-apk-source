package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.Map;

final class r$7
  implements bz.a
{
  r$7(r paramr)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(46856);
    String str = aa.a(parama.eAB.vED);
    parama = br.z(str, "sysmsg");
    if (parama == null)
    {
      AppMethodBeat.o(46856);
      return;
    }
    int i = bo.getInt((String)parama.get(".sysmsg.paymsg.PayMsgType"), -1);
    ab.i("MicroMsg.SubCoreWalletCore", "got a pay msg, type = ".concat(String.valueOf(i)));
    switch (i)
    {
    default:
    case 17:
    case 16:
    case 37:
    }
    while (true)
    {
      AppMethodBeat.o(46856);
      break;
      i = bo.getInt((String)parama.get(".sysmsg.paymsg.WalletType"), -1);
      ab.i("MicroMsg.SubCoreWalletCore", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=".concat(String.valueOf(i)));
      if (i >= 0)
      {
        g.RQ();
        g.RP().Ry().set(339975, Integer.valueOf(i));
        AppMethodBeat.o(46856);
        break;
        i = bo.getInt((String)parama.get(".sysmsg.paymsg.Flag"), 0);
        ab.i("MicroMsg.SubCoreWalletCore", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=".concat(String.valueOf(i)));
        if (i == 1)
        {
          ab.i("MicroMsg.SubCoreWalletCore", "open wallet");
          com.tencent.mm.model.r.YJ();
          AppMethodBeat.o(46856);
          break;
        }
        if (i == 2)
        {
          ab.i("MicroMsg.SubCoreWalletCore", "close wallet");
          i = com.tencent.mm.model.r.YF();
          g.RQ();
          g.RP().Ry().set(40, Integer.valueOf(i & 0xFFFF7FFF));
          AppMethodBeat.o(46856);
          break;
          ab.i("MicroMsg.SubCoreWalletCore", "receive c2c content update msg: %s", new Object[] { str });
          g.RQ();
          g.RS().aa(new r.7.1(this, parama));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.r.7
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a
{
  public static boolean Hn(int paramInt)
  {
    AppMethodBeat.i(46462);
    g.RQ();
    boolean bool;
    if ((((Integer)g.RP().Ry().get(ac.a.xMg, Integer.valueOf(-1))).intValue() < paramInt) && (paramInt > 0))
    {
      bool = true;
      AppMethodBeat.o(46462);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46462);
    }
  }

  public static boolean cOQ()
  {
    boolean bool1 = true;
    AppMethodBeat.i(46463);
    l locall = (l)g.K(l.class);
    Object localObject = new StringBuilder("mgr==null?");
    if (locall == null)
    {
      bool2 = true;
      ab.i("MicroMsg.WalletUtil", bool2);
      if (locall != null)
        ab.i("MicroMsg.WalletUtil", " mgr.isSupportAndLoadSuccess()=" + locall.bxs());
      s.cNC();
      localObject = s.cND();
      ai localai = ((ak)localObject).cQo();
      StringBuilder localStringBuilder = new StringBuilder("config==null?");
      if (localai != null)
        break label222;
      bool2 = true;
      label107: ab.i("MicroMsg.WalletUtil", bool2);
      if (localai != null)
        ab.i("MicroMsg.WalletUtil", "config.isSupportTouchPay()=" + localai.cPY());
      ab.i("MicroMsg.WalletUtil", "userInfoManger.isReg()=" + ((ak)localObject).cQg());
      if ((locall == null) || (!locall.bxs()) || (localai == null) || (!localai.cPY()) || (!((ak)localObject).cQg()))
        break label227;
      AppMethodBeat.o(46463);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label222: bool2 = false;
      break label107;
      label227: AppMethodBeat.o(46463);
    }
  }

  public static boolean cOR()
  {
    AppMethodBeat.i(46464);
    l locall = (l)g.K(l.class);
    boolean bool;
    if (locall == null)
    {
      ab.w("MicroMsg.WalletUtil", "no finger mgr!");
      AppMethodBeat.o(46464);
      bool = false;
    }
    while (true)
    {
      return bool;
      s.cNC();
      ak localak = s.cND();
      ai localai = localak.cQo();
      h.pYm.k(916L, 0L, 1L);
      ab.i("MicroMsg.WalletUtil", "support faceid: %s, %s, %s", new Object[] { Boolean.valueOf(locall.bxA()), Boolean.valueOf(localai.cPY()), Boolean.valueOf(localak.cQg()) });
      if ((locall.bxA()) && (localai.cPY()) && (localak.cQg()))
      {
        AppMethodBeat.o(46464);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(46464);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.b.a
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class ai
{
  public int tCP;
  private int tCQ;

  public ai()
  {
    AppMethodBeat.i(46949);
    this.tCP = 0;
    this.tCQ = 0;
    g.RQ();
    this.tCP = ((Integer)g.RP().Ry().get(196660, Integer.valueOf(0))).intValue();
    g.RQ();
    this.tCQ = ((Integer)g.RP().Ry().get(ac.a.xWA, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + this.tCP + "balanceShow:" + this.tCQ);
    AppMethodBeat.o(46949);
  }

  public ai(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46948);
    this.tCP = 0;
    this.tCQ = 0;
    g.RQ();
    g.RP().Ry().set(196660, Integer.valueOf(paramInt1));
    g.RQ();
    g.RP().Ry().set(ac.a.xWA, Integer.valueOf(paramInt2));
    this.tCP = paramInt1;
    this.tCQ = paramInt2;
    ab.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig1 " + paramInt1 + "balanceShow:" + paramInt2);
    AppMethodBeat.o(46948);
  }

  public final boolean adL()
  {
    AppMethodBeat.i(46956);
    if ((this.tCP & 0x2000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46956);
      return bool;
    }
  }

  public final boolean cNb()
  {
    AppMethodBeat.i(46951);
    if ((this.tCP & 0x4) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isBalanceFetchOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46951);
      return bool;
    }
  }

  public final boolean cPW()
  {
    AppMethodBeat.i(46950);
    if ((this.tCP & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isMicroPayOn, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46950);
      return bool;
    }
  }

  public final boolean cPX()
  {
    AppMethodBeat.i(46952);
    if ((this.tCP & 0x80) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isSupportScanBankCard, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46952);
      return bool;
    }
  }

  public final boolean cPY()
  {
    AppMethodBeat.i(46953);
    if ((this.tCP & 0x100) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isSupportTouchPay, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46953);
      return bool;
    }
  }

  public final boolean cPZ()
  {
    AppMethodBeat.i(46954);
    if ((this.tCP & 0x400) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isSupportLCT, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46954);
      return bool;
    }
  }

  public final boolean cQa()
  {
    AppMethodBeat.i(46955);
    if ((this.tCP & 0x800) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isSupporSwitchWalletCurrency, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46955);
      return bool;
    }
  }

  public final boolean cQb()
  {
    AppMethodBeat.i(46957);
    if ((this.tCP & 0x40000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isReportWifiSSid, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46957);
      return bool;
    }
  }

  public final boolean cQc()
  {
    AppMethodBeat.i(46958);
    if ((this.tCP & 0x800000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isReportCellInfo, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46958);
      return bool;
    }
  }

  public final boolean cQd()
  {
    AppMethodBeat.i(46959);
    if ((this.tCP & 0x8000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46959);
      return bool;
    }
  }

  public final boolean cQe()
  {
    AppMethodBeat.i(46960);
    if ((this.tCP & 0x200000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
      AppMethodBeat.o(46960);
      return bool;
    }
  }

  public final boolean cQf()
  {
    AppMethodBeat.i(46961);
    boolean bool = bo.gW(this.tCQ, 1);
    ab.i("MicroMsg.WalletSwitchConfig", "isShowBalance, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.tCP) });
    AppMethodBeat.o(46961);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ai
 * JD-Core Version:    0.6.2
 */
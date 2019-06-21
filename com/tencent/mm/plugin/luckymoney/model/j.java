package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class j
{
  i nSs;
  private d nWN;

  public j()
  {
    AppMethodBeat.i(42289);
    init();
    AppMethodBeat.o(42289);
  }

  private void init()
  {
    AppMethodBeat.i(42290);
    this.nSs = new i();
    g.RQ();
    String str = (String)g.RP().Ry().get(356355, null);
    if (bo.isNullOrNil(str))
    {
      this.nSs.nRR = 2000.0D;
      this.nSs.nRO = 100;
      this.nSs.nRS = 200.0D;
      this.nSs.nRQ = 0.01D;
      this.nSs.nRP = 200.0D;
    }
    while (true)
    {
      ab.i("MicroMsg.LuckyMoneyConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.nSs.nRR + " maxTotalNum:" + this.nSs.nRO + " perGroupMaxValue:" + this.nSs.nRS + " perMinValue:" + this.nSs.nRQ + " perPersonMaxValue:" + this.nSs.nRP);
      AppMethodBeat.o(42290);
      return;
      try
      {
        this.nSs.parseFrom(str.getBytes("ISO-8859-1"));
        bLt();
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.LuckyMoneyConfigManager", "parseConfig exp, " + localException.getLocalizedMessage());
        this.nSs.nRR = 2000.0D;
        this.nSs.nRO = 100;
        this.nSs.nRS = 200.0D;
        this.nSs.nRQ = 0.01D;
        this.nSs.nRP = 200.0D;
      }
    }
  }

  final void bLt()
  {
    AppMethodBeat.i(42291);
    if (this.nSs != null)
    {
      this.nWN = d.Qg(this.nSs.nWM);
      if ((this.nWN != null) && (this.nWN.nWu != null))
      {
        ((a)g.K(a.class)).a(this.nWN.nWu.wwQ);
        g.RP().Ry().set(ac.a.xUv, Integer.valueOf(1));
      }
    }
    AppMethodBeat.o(42291);
  }

  public final i bLu()
  {
    AppMethodBeat.i(42292);
    if (this.nSs == null)
      init();
    i locali = this.nSs;
    AppMethodBeat.o(42292);
    return locali;
  }

  public final d bLv()
  {
    AppMethodBeat.i(42293);
    if (this.nWN == null)
      init();
    d locald = this.nWN;
    AppMethodBeat.o(42293);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.j
 * JD-Core Version:    0.6.2
 */
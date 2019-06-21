package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.d.a;
import java.util.HashMap;
import java.util.Map;

public final class z
{
  public static int tgb = 123;
  public static int tgc = 456;
  public int accountType;
  public String cAa;
  public b glt;
  private x tgd;
  public y tge;
  public WalletLqtSaveFetchUI tgf;
  public String tgg;
  public int tgh;
  public int tgi;
  public String tgj;
  public Bankcard tgk;
  public Map<String, String> tgl;

  public z()
  {
    AppMethodBeat.i(45318);
    this.tgd = null;
    this.tge = null;
    this.tgf = null;
    this.tgl = new HashMap();
    AppMethodBeat.o(45318);
  }

  public z(x paramx, y paramy, WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
    AppMethodBeat.i(45319);
    this.tgd = null;
    this.tge = null;
    this.tgf = null;
    this.tgl = new HashMap();
    this.tgd = paramx;
    this.tge = paramy;
    this.tgf = paramWalletLqtSaveFetchUI;
    AppMethodBeat.o(45319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.z
 * JD-Core Version:    0.6.2
 */
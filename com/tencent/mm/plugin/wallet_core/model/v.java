package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.core.c.j;
import java.security.Signature;

public enum v
{
  public String msn = null;
  public boolean mso = false;
  private Signature tCo = null;
  public j tCp = null;

  static
  {
    AppMethodBeat.i(46896);
    tCn = new v("IML");
    tCq = new v[] { tCn };
    AppMethodBeat.o(46896);
  }

  public final void reset()
  {
    AppMethodBeat.i(46895);
    ab.i("MicroMsg.WalletFingerprintVerifyManager", "hy: start reset");
    this.tCo = null;
    this.msn = null;
    this.mso = false;
    AppMethodBeat.o(46895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.v
 * JD-Core Version:    0.6.2
 */
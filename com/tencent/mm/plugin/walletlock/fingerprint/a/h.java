package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.a.a;

public final class h
{
  public a tVi = null;

  public final void release()
  {
    AppMethodBeat.i(51497);
    ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo release fingerprint auth");
    if (this.tVi != null)
      this.tVi.rp(true);
    AppMethodBeat.o(51497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.h
 * JD-Core Version:    0.6.2
 */
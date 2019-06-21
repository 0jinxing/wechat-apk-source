package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.a.a;

public final class h$1
  implements com.tencent.soter.a.a.b
{
  public h$1(h paramh, com.tencent.mm.plugin.walletlock.c.b paramb)
  {
  }

  public final void bxL()
  {
    AppMethodBeat.i(51490);
    ab.v("MicroMsg.SoterFingerprintAuthManager", "alvinluo onStartAuthentication");
    if (this.tVj != null)
      this.tVj.cTy();
    AppMethodBeat.o(51490);
  }

  public final void bxM()
  {
    AppMethodBeat.i(51492);
    ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo onAuthenticationSucceed");
    this.tVk.tVi = null;
    AppMethodBeat.o(51492);
  }

  public final void onAuthenticationCancelled()
  {
    AppMethodBeat.i(51494);
    ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo onAuthenticationCancelled");
    this.tVk.tVi = null;
    AppMethodBeat.o(51494);
  }

  public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(51495);
    ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo onAuthenticationError errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    if (10308 == paramInt)
    {
      ab.i("MicroMsg.SoterFingerprintAuthManager", "py: authentication is frozen, auto cancel now.");
      paramCharSequence = this.tVk;
      ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo user cancel fingerprint auth");
      if (paramCharSequence.tVi != null)
        paramCharSequence.tVi.rp(true);
    }
    this.tVk.tVi = null;
    AppMethodBeat.o(51495);
  }

  public final void onAuthenticationFailed()
  {
    AppMethodBeat.i(51493);
    ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo onAuthenticationFailed");
    if (this.tVj != null)
      this.tVj.T(1, "not match");
    AppMethodBeat.o(51493);
  }

  public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(51491);
    ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo onAuthenticationHelp errCode: %d, errMsg: %s and do nothing", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    AppMethodBeat.o(51491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.h.1
 * JD-Core Version:    0.6.2
 */
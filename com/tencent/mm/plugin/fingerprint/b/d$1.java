package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.a;

final class d$1
  implements com.tencent.mm.plugin.soter.d.g
{
  d$1(d paramd)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41437);
    if ((paramInt == 0) && (a.dRc()))
    {
      ab.i("MicroMsg.FingerPrintMgrImpl", "After recheck IFingerPrintMgr is now switched to SoterAuthMgrImp");
      paramString = new l();
      paramString.bxp();
      com.tencent.mm.kernel.g.a(com.tencent.mm.pluginsdk.l.class, paramString);
      AppMethodBeat.o(41437);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FingerPrintMgrImpl", "After recheck IFingerPrintMgr is still FingerPrintMgrImpl errCode[" + paramInt + "], errMsg[" + paramString + "]");
      AppMethodBeat.o(41437);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.d.1
 * JD-Core Version:    0.6.2
 */
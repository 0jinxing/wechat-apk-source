package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class ad
{
  public static void e(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(49101);
    ab.v("Micromsg.WalletPayLinkReport", "kvAction scene %s reqKey %s action %s info %s", new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2), paramString2 });
    h.pYm.e(15001, new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2), paramString2 });
    AppMethodBeat.o(49101);
  }

  public static void o(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(49100);
    ab.v("Micromsg.WalletPayLinkReport", "kvStatStartPay scene %s reqKey %s errcode %s", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    h.pYm.e(14997, new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    AppMethodBeat.o(49100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.ad
 * JD-Core Version:    0.6.2
 */
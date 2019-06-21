package com.tencent.mm.plugin.fingerprint.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.a;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class FingerPrintAuthTransparentUI$1
  implements c
{
  FingerPrintAuthTransparentUI$1(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void bJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(41597);
    switch (paramInt1)
    {
    default:
    case 0:
    case 2002:
    case 2001:
    case 2005:
    case 2007:
    case 10308:
    case 2009:
    }
    while (true)
    {
      AppMethodBeat.o(41597);
      while (true)
      {
        return;
        ab.i("MicroMsg.FingerPrintAuthTransparentUI", "identify success");
        FingerPrintAuthTransparentUI.a(this.msC, paramInt2);
        FingerPrintAuthTransparentUI.a(this.msC);
        AppMethodBeat.o(41597);
        continue;
        ab.i("MicroMsg.FingerPrintAuthTransparentUI", "identify FingerPrintConst.RESULT_NO_MATCH");
        FingerPrintAuthTransparentUI.b(this.msC);
        FingerPrintAuthTransparentUI.a(this.msC, true);
        AppMethodBeat.o(41597);
        continue;
        ab.i("MicroMsg.FingerPrintAuthTransparentUI", "identify timeout");
        AppMethodBeat.o(41597);
      }
      ab.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
      String str = ah.getContext().getString(2131303883);
      if (paramInt1 == 10308)
      {
        str = ah.getContext().getString(2131303884);
        a.d(6, -1000223, -1, "too many trial");
      }
      while (true)
      {
        FingerPrintAuthTransparentUI.a(this.msC, str);
        AppMethodBeat.o(41597);
        break;
        a.d(1000, -1000223, paramInt1, "fingerprint error");
      }
      ab.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
      str = ah.getContext().getString(2131303883);
      a.d(1000, -1000223, paramInt1, "fingerprint error");
      a.EE(2);
      FingerPrintAuthTransparentUI.a(this.msC, str);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.1
 * JD-Core Version:    0.6.2
 */
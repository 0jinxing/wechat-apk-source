package com.tencent.mm.plugin.fingerprint.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.a;
import com.tencent.mm.pluginsdk.wallet.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;

public final class FingerPrintAuthUI$a
  implements c
{
  private WeakReference<FingerPrintAuthUI> msL;

  public FingerPrintAuthUI$a(FingerPrintAuthUI paramFingerPrintAuthUI1, FingerPrintAuthUI paramFingerPrintAuthUI2)
  {
    AppMethodBeat.i(41638);
    this.msL = null;
    this.msL = new WeakReference(paramFingerPrintAuthUI2);
    AppMethodBeat.o(41638);
  }

  private FingerPrintAuthUI bxT()
  {
    AppMethodBeat.i(41639);
    FingerPrintAuthUI localFingerPrintAuthUI;
    if (this.msL != null)
    {
      localFingerPrintAuthUI = (FingerPrintAuthUI)this.msL.get();
      AppMethodBeat.o(41639);
    }
    while (true)
    {
      return localFingerPrintAuthUI;
      localFingerPrintAuthUI = null;
      AppMethodBeat.o(41639);
    }
  }

  public final void bJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(41640);
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
      AppMethodBeat.o(41640);
      while (true)
      {
        label77: return;
        ab.i("MicroMsg.FingerPrintAuthUI", "identify success");
        if (bxT() == null)
          break;
        FingerPrintAuthUI.a(bxT(), paramInt2);
        AppMethodBeat.o(41640);
        continue;
        ab.i("MicroMsg.FingerPrintAuthUI", "identify FingerPrintConst.RESULT_NO_MATCH");
        if (bxT() == null)
          break;
        FingerPrintAuthUI.a(bxT());
        FingerPrintAuthUI.a(this.msI, true);
        AppMethodBeat.o(41640);
        continue;
        ab.i("MicroMsg.FingerPrintAuthUI", "identify timeout");
        if (bxT() == null)
          break;
        FingerPrintAuthUI.a(this.msI, false);
        AppMethodBeat.o(41640);
      }
      ab.i("MicroMsg.FingerPrintAuthUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
      String str = ah.getContext().getString(2131303883);
      if (paramInt1 == 10308)
      {
        str = ah.getContext().getString(2131303884);
        a.d(6, -1000223, -1, "too many trial");
      }
      while (bxT() != null)
      {
        FingerPrintAuthUI.a(bxT(), str, -1);
        AppMethodBeat.o(41640);
        break label77;
        a.d(1000, -1000223, paramInt1, "fingerprint error");
      }
      ab.i("MicroMsg.FingerPrintAuthUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
      str = ah.getContext().getString(2131303883);
      a.d(1000, -1000223, paramInt1, "fingerprint error");
      a.EE(2);
      if (bxT() != null)
        FingerPrintAuthUI.a(bxT(), str, -1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.a
 * JD-Core Version:    0.6.2
 */
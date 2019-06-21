package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.walletlock.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class FingerprintWalletLockUI$a
  implements b
{
  private WeakReference<FingerprintWalletLockUI> msL;

  public FingerprintWalletLockUI$a(FingerprintWalletLockUI paramFingerprintWalletLockUI1, FingerprintWalletLockUI paramFingerprintWalletLockUI2)
  {
    AppMethodBeat.i(51513);
    this.msL = null;
    this.msL = new WeakReference(paramFingerprintWalletLockUI2);
    AppMethodBeat.o(51513);
  }

  private FingerprintWalletLockUI cTx()
  {
    AppMethodBeat.i(51514);
    FingerprintWalletLockUI localFingerprintWalletLockUI;
    if (this.msL != null)
    {
      localFingerprintWalletLockUI = (FingerprintWalletLockUI)this.msL.get();
      AppMethodBeat.o(51514);
    }
    while (true)
    {
      return localFingerprintWalletLockUI;
      localFingerprintWalletLockUI = null;
      AppMethodBeat.o(51514);
    }
  }

  public final void T(int paramInt, String paramString)
  {
    AppMethodBeat.i(51516);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onResult result: %d, errMsg: %s, isCancelled: %b", new Object[] { Integer.valueOf(paramInt), paramString, Boolean.valueOf(FingerprintWalletLockUI.c(this.tVx)) });
    if ((FingerprintWalletLockUI.d(this.tVx) != null) && (FingerprintWalletLockUI.d(this.tVx).equals("action.switch_on_pattern")))
    {
      paramString = new bj();
      paramString.cVT = 3L;
      paramString.dcm = 1L;
      paramString.ajK();
    }
    if ((FingerprintWalletLockUI.d(this.tVx) != null) && (FingerprintWalletLockUI.d(this.tVx).equals("action.verify_pattern")))
    {
      if (FingerprintWalletLockUI.e(this.tVx) != 1)
        break label167;
      paramString = new bj();
      paramString.cVT = 7L;
      paramString.dcm = 1L;
      paramString.ajK();
    }
    while (FingerprintWalletLockUI.c(this.tVx))
    {
      AppMethodBeat.o(51516);
      return;
      label167: if (FingerprintWalletLockUI.e(this.tVx) == 2)
      {
        paramString = new bj();
        paramString.cVT = 9L;
        paramString.dcm = 1L;
        paramString.ajK();
      }
    }
    switch (paramInt)
    {
    case 6:
    case 7:
    default:
    case 0:
    case 4:
    case 1:
    case 5:
    case 2:
    case 8:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(51516);
      break;
      ab.i("MicroMsg.FingerprintWalletLockUI", "identify success");
      if (cTx() != null)
        FingerprintWalletLockUI.f(cTx());
      if ((FingerprintWalletLockUI.d(this.tVx) != null) && (FingerprintWalletLockUI.d(this.tVx).equals("action.switch_on_pattern")))
      {
        paramString = new bj();
        paramString.cVT = 3L;
        paramString.dcm = 2L;
        paramString.ajK();
      }
      if ((FingerprintWalletLockUI.d(this.tVx) != null) && (FingerprintWalletLockUI.d(this.tVx).equals("action.verify_pattern")))
      {
        if (FingerprintWalletLockUI.e(this.tVx) == 1)
        {
          paramString = new bj();
          paramString.cVT = 7L;
          paramString.dcm = 2L;
          paramString.ajK();
          AppMethodBeat.o(51516);
          break;
        }
        if (FingerprintWalletLockUI.e(this.tVx) == 2)
        {
          paramString = new bj();
          paramString.cVT = 9L;
          paramString.dcm = 2L;
          paramString.ajK();
          AppMethodBeat.o(51516);
          break;
          ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user cancel");
          AppMethodBeat.o(51516);
          break;
          ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo identify ERR_NO_MATCH");
          if (cTx() != null)
          {
            FingerprintWalletLockUI.a(cTx(), paramInt, this.tVx.getString(2131304889));
            AppMethodBeat.o(51516);
            break;
            ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo identify TIMEOUT");
            if (cTx() != null)
            {
              FingerprintWalletLockUI.a(cTx(), paramInt, this.tVx.getString(2131304889));
              AppMethodBeat.o(51516);
              break;
              if (cTx() != null)
              {
                FingerprintWalletLockUI.b(cTx(), paramInt, this.tVx.getString(2131304881));
                AppMethodBeat.o(51516);
                break;
                if (cTx() != null)
                {
                  FingerprintWalletLockUI.b(cTx(), paramInt, this.tVx.getString(2131304898));
                  AppMethodBeat.o(51516);
                  break;
                  ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo on error: %d", new Object[] { Integer.valueOf(paramInt) });
                  if (cTx() != null)
                    FingerprintWalletLockUI.b(cTx(), paramInt, this.tVx.getString(2131304888));
                }
              }
            }
          }
        }
      }
    }
  }

  public final void cTy()
  {
    AppMethodBeat.i(51515);
    FingerprintWalletLockUI.a(this.tVx);
    FingerprintWalletLockUI.b(this.tVx);
    AppMethodBeat.o(51515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.a
 * JD-Core Version:    0.6.2
 */
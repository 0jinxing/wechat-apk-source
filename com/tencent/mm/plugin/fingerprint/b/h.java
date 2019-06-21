package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.plugin.fingerprint.c.f;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class h
  implements j
{
  private String cBV;
  private String gEk;
  ak mrD;
  com.tencent.mm.pluginsdk.wallet.a mrH;
  private com.tencent.mm.pluginsdk.wallet.a mrI;
  WalletBaseUI mrJ;
  private String mrK;

  public h()
  {
    AppMethodBeat.i(41485);
    this.mrH = null;
    this.mrI = null;
    this.mrJ = null;
    this.mrK = null;
    this.cBV = null;
    this.gEk = null;
    this.mrD = new ak(new h.1(this));
    AppMethodBeat.o(41485);
  }

  public final void a(Context paramContext, com.tencent.mm.pluginsdk.wallet.a parama, String paramString)
  {
    AppMethodBeat.i(41486);
    this.mrJ = ((WalletBaseUI)paramContext);
    this.mrH = parama;
    this.gEk = paramString;
    paramContext = FingerPrintAuth.getRsaKey(e.dQ(ah.getContext()), e.getUserId(), com.tencent.mm.compatible.e.q.LM());
    com.tencent.mm.plugin.soter.d.a.cvN();
    if (TextUtils.isEmpty(paramContext))
    {
      ab.e("MicroMsg.HwFingerprintOpenDelegate", "FingerPrintAuth.getRsaKey() is null");
      new q(new h.a(this, (byte)0)).aBU();
      AppMethodBeat.o(41486);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.HwFingerprintOpenDelegate", "do NetSceneTenpayGetOpenTouchCert");
      paramContext = new com.tencent.mm.plugin.fingerprint.c.e(paramContext);
      this.mrJ.a(paramContext, false, false);
      AppMethodBeat.o(41486);
    }
  }

  public final void a(com.tencent.mm.pluginsdk.wallet.a parama, String paramString, int paramInt)
  {
    AppMethodBeat.i(41488);
    this.mrI = parama;
    if (TextUtils.isEmpty(this.gEk))
    {
      ab.e("MicroMsg.HwFingerprintOpenDelegate", "get user pwd error");
      parama.aC(-1, this.mrJ.getString(2131299873));
      AppMethodBeat.o(41488);
      return;
    }
    String str1 = e.getUserId();
    String str2 = com.tencent.mm.compatible.e.q.LM();
    String str3 = w.dNR();
    parama = "";
    if (e.bxs())
    {
      parama = FingerPrintAuth.genOpenFPEncrypt(e.dQ(ah.getContext()), str1, str2, paramString, str3, "", this.mrK, this.cBV, Build.MODEL);
      paramString = FingerPrintAuth.genOpenFPSign(e.dQ(ah.getContext()), e.getUserId(), com.tencent.mm.compatible.e.q.LM(), parama);
    }
    while (true)
    {
      if (TextUtils.isEmpty(this.mrK))
        ab.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypted_device_info which return by FingerPrintAuth.genOpenFPEncrypt is null");
      while (true)
      {
        parama = new f(parama, paramString, this.gEk, paramInt);
        this.mrJ.a(parama, false, false);
        AppMethodBeat.o(41488);
        break;
        if (TextUtils.isEmpty(paramString))
          ab.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypto_open_sign which return by FingerPrintAuth.genOpenFPSign is null");
      }
      str1 = "";
      paramString = parama;
      parama = str1;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    int i = 0;
    AppMethodBeat.i(41487);
    Object localObject;
    if ((paramm instanceof com.tencent.mm.plugin.fingerprint.c.e))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert success");
        paramString = (com.tencent.mm.plugin.fingerprint.c.e)paramm;
        this.mrK = paramString.mrK;
        this.cBV = paramString.cBV;
        localObject = this.mrH;
        paramm = "";
        paramInt1 = i;
        ((com.tencent.mm.pluginsdk.wallet.a)localObject).aC(paramInt1, paramm);
        AppMethodBeat.o(41487);
        bool = true;
      }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert error");
      com.tencent.mm.pluginsdk.wallet.a locala = this.mrH;
      paramInt2 = -1;
      paramInt1 = paramInt2;
      localObject = locala;
      paramm = paramString;
      if (!bo.isNullOrNil(paramString))
        break;
      paramm = this.mrJ.getString(2131299873);
      paramInt1 = paramInt2;
      localObject = locala;
      break;
      if ((paramm instanceof f))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.plugin.soter.d.a.cvO();
          com.tencent.mm.plugin.soter.d.a.d(0, 0, 0, "OK");
          this.mrI.aC(0, "");
        }
        while (true)
        {
          AppMethodBeat.o(41487);
          bool = true;
          break;
          this.mrI.aC(-2, "");
        }
      }
      AppMethodBeat.o(41487);
    }
  }

  public final void clear()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.h
 * JD-Core Version:    0.6.2
 */